package com.langoni.createUrlShortner;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UrlData {
    private String originalUrl;
    private long expirationTime;
}
