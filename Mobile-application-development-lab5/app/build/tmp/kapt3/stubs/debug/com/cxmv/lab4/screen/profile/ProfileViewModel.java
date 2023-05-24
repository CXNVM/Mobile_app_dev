package com.cxmv.lab4.screen.profile;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0002J\u001e\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\"H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011\u00a8\u0006\'"}, d2 = {"Lcom/cxmv/lab4/screen/profile/ProfileViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_fieldsState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/cxmv/lab4/screen/profile/FieldsState;", "_jwtState", "Lcom/cxmv/lab4/types/JwtState;", "_profileState", "Lcom/cxmv/lab4/screen/profile/ProfileState;", "_user", "Lcom/cxmv/lab4/database/entity/User;", "fieldsState", "Lkotlinx/coroutines/flow/StateFlow;", "getFieldsState", "()Lkotlinx/coroutines/flow/StateFlow;", "jwtService", "Lcom/cxmv/lab4/usecases/JwtService;", "jwtState", "getJwtState", "preferencesManager", "Lcom/cxmv/lab4/datastore/PreferencesManager;", "profileState", "getProfileState", "repository", "Lcom/cxmv/lab4/database/repo/UserRepository;", "user", "getUser", "logout", "", "updatePassword", "password", "", "updatePasswordAndUsername", "username", "confirmPassword", "updateUsername", "app_debug"})
public final class ProfileViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.cxmv.lab4.database.repo.UserRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final com.cxmv.lab4.datastore.PreferencesManager preferencesManager = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cxmv.lab4.database.entity.User> _user = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cxmv.lab4.database.entity.User> user = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cxmv.lab4.screen.profile.ProfileState> _profileState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cxmv.lab4.screen.profile.ProfileState> profileState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cxmv.lab4.screen.profile.FieldsState> _fieldsState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cxmv.lab4.screen.profile.FieldsState> fieldsState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.cxmv.lab4.types.JwtState> _jwtState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.cxmv.lab4.types.JwtState> jwtState = null;
    @org.jetbrains.annotations.NotNull
    private final com.cxmv.lab4.usecases.JwtService jwtService = null;
    
    public ProfileViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cxmv.lab4.database.entity.User> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cxmv.lab4.screen.profile.ProfileState> getProfileState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cxmv.lab4.screen.profile.FieldsState> getFieldsState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.cxmv.lab4.types.JwtState> getJwtState() {
        return null;
    }
    
    public final void updatePasswordAndUsername(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String confirmPassword) {
    }
    
    private final void updateUsername(java.lang.String username) {
    }
    
    private final void updatePassword(java.lang.String password) {
    }
    
    public final void logout() {
    }
}