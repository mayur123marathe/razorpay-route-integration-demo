import { Navigate, Outlet } from "react-router-dom";

import { useAuth } from "../contexts/AuthContext";

export default function NgoRoute() {
  const { user } = useAuth();

  if (user?.role !== "NGO") {
    return <Navigate to="/login" replace />;
  }

  return <Outlet />;
}
