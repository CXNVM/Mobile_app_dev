package com.cxmv.lab4.usecases;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/cxmv/lab4/usecases/JwtService;", "", "()V", "accessSecret", "", "issuer", "refreshSecret", "checkTokens", "accessToken", "refreshToken", "preferencesManager", "Lcom/cxmv/lab4/datastore/PreferencesManager;", "generateAccessToken", "userId", "", "generateAccessTokenFromRefreshToken", "generateRefreshToken", "generateTokens", "Lkotlin/Pair;", "verifyAccessToken", "token", "verifyRefreshToken", "app_debug"})
public final class JwtService {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String refreshSecret = "refreshSecret";
    @org.jetbrains.annotations.NotNull
    private final java.lang.String accessSecret = "accessSecret";
    @org.jetbrains.annotations.NotNull
    private final java.lang.String issuer = "Generalov";
    
    public JwtService() {
        super();
    }
    
    private final java.lang.String verifyAccessToken(java.lang.String token) {
        return null;
    }
    
    private final java.lang.String verifyRefreshToken(java.lang.String refreshToken) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.Pair<java.lang.String, java.lang.String> generateTokens(int userId) {
        return null;
    }
    
    private final java.lang.String generateAccessTokenFromRefreshToken(java.lang.String refreshToken) {
        return null;
    }
    
    private final java.lang.String generateRefreshToken(int userId) {
        return null;
    }
    
    private final java.lang.String generateAccessToken(int userId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String checkTokens(@org.jetbrains.annotations.Nullable
    java.lang.String accessToken, @org.jetbrains.annotations.Nullable
    java.lang.String refreshToken, @org.jetbrains.annotations.NotNull
    com.cxmv.lab4.datastore.PreferencesManager preferencesManager) {
        return null;
    }
}