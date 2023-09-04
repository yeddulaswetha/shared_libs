def azureLogin(servicePrincipalId, clientSecret, tenantId) {
    sh """
    az login --service-principal -u ${servicePrincipalId} \
    -p ${clientSecret} --tenant ${tenantId}
    """
}
