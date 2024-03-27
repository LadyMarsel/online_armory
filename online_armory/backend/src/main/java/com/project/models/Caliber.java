/*-----Gun Caliber-----
 * Calibre des armes, en système métrique et en système de pouce
 */
package com.project.models;


import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public enum Caliber {

    C9("", "9"),
    ;

    private final String inch;
    private final String metric;
    
}
