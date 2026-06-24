export type UserRole = "DONOR" | "NGO";

export interface AuthUser {
  id: string;
  email: string;
  role: UserRole;
}
