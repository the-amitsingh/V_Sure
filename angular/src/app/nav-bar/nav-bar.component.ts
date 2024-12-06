import { Component } from '@angular/core';
import { NavigationEnd, Router } from '@angular/router';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrl: './nav-bar.component.css'
})
export class NavBarComponent {
  isBlackNavBar: boolean = false;
  isAdminNavBar: boolean = false;
  isUnderwriterNavBar: boolean = false;
  constructor(private router: Router) {
    this.router.events.subscribe((event)=>{
      if(event instanceof NavigationEnd) {
        this.setNavbarClass();
      }
    });
  }
  setNavbarClass(): void {
    const excludedRoutes = ['/', '/admin', '/underwriter'];
    
    // Set isBlackNavBar to true if the current route is not excluded
    this.isBlackNavBar = !excludedRoutes.includes(this.router.url);

    // Set specific navbar states
    this.isAdminNavBar = this.router.url === '/admin';
    this.isUnderwriterNavBar = this.router.url === '/underwriter';

    console.log('Current URL:', this.router.url);
    console.log('isBlackNavBar:', this.isBlackNavBar);
    console.log('isAdminNavBar:', this.isAdminNavBar);
    console.log('isUnderwriterNavBar:', this.isUnderwriterNavBar);
  }
}
