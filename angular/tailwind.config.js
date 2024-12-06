/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/**/*.{html,ts}"],
  theme: {
    extend: {
      boxShadow: {
        'white': '0px 0px 12px rgba(255, 255, 255, 0.3)',
      }
    },
  },
  plugins: [],
}