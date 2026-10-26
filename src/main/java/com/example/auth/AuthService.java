package com.example.auth;

/** 高风险靶场：核心高危路径（M4a 分级规则 high-risk-path）。 */
public final class AuthService {

  private AuthService() {}

  /**
   * 校验会话令牌。
   *
   * @param token 会话令牌
   * @return true 若令牌非空（演示用）
   */
  public static boolean isValid(String token) {
    return token != null && !token.isBlank();
  }
}
