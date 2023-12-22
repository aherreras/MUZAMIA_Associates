<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    </head>
    <body class="bg-light">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-md-4">
                    <div class="card shadow-lg mt-5">
                        <div class="card-header text-bg-primary">Login as admin</div>
                        <div class="card-body">
                            <form action="${pageContext.request.contextPath}/Dashboard?accion=DASH2" method="POST">
                                <div class="form-floating mb-3">
                                    <input type="text" class="form-control" id="user_name" placeholder="johndoe" autofocus>
                                    <label for="user_name">Username</label>
                                </div>
                                <div class="form-floating mb-3">
                                    <input type="password" class="form-control" id="pass_word" placeholder="***" autofocus>
                                    <label for="pass_word">Password</label>
                                </div>
                                <div class="form-check mb-3">
                                    <input class="form-check-input" type="checkbox" value="" id="remember_me">
                                    <label class="form-check-label" for="remember_me">
                                        Remember me
                                    </label>
                                </div>
                                <div class="d-grid">
                                    <button id="login" class="btn btn-success" type="submit">
                                        <!-- Login icon -->
                                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                             class="bi bi-box-arrow-in-right" viewBox="0 0 16 16">
                                        <path fill-rule="evenodd"
                                              d="M6 3.5a.5.5 0 0 1 .5-.5h8a.5.5 0 0 1 .5.5v9a.5.5 0 0 1-.5.5h-8a.5.5 0 0 1-.5-.5v-2a.5.5 0 0 0-1 0v2A1.5 1.5 0 0 0 6.5 14h8a1.5 1.5 0 0 0 1.5-1.5v-9A1.5 1.5 0 0 0 14.5 2h-8A1.5 1.5 0 0 0 5 3.5v2a.5.5 0 0 0 1 0v-2z" />
                                        <path fill-rule="evenodd"
                                              d="M11.854 8.354a.5.5 0 0 0 0-.708l-3-3a.5.5 0 1 0-.708.708L10.293 7.5H1.5a.5.5 0 0 0 0 1h8.793l-2.147 2.146a.5.5 0 0 0 .708.708l3-3z" />
                                        </svg>
                                        Login as admin</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>