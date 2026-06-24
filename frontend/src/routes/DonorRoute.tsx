import { Navigate, Outlet } from "react-router-dom";

import { useAuth } from "../contexts/AuthContext";

export default function DonorRoute() {
  const { user } = useAuth();

  if (user?.role !== "DONOR") {
    return <Navigate to="/login" replace />;
  }

  return <Outlet />;
}
