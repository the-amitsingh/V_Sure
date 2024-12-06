import { Component, OnInit, Renderer2  } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit{
  constructor(private renderer: Renderer2) {}
  ngOnInit(): void {
    // Add the style to the body to make it unscrollable
    this.renderer.setStyle(document.body, 'overflow', 'hidden');
  }
  
  ngOnDestroy(): void {
    // Remove the style when the component is destroyed
    this.renderer.removeStyle(document.body, 'overflow');
  }
}

