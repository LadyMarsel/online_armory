import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appResizeImg]',
  standalone: true
})
export class ResizeImageDirective {

  constructor(private el: ElementRef) { 
    this.setHeight(170);
    this.setWidth(170);
  }

  setHeight(height: number){
    this.el.nativeElement.style.height = `${height}px`;
  }

  setWidth(width: number){
    this.el.nativeElement.style.width = `${width}px`;
  }

}
