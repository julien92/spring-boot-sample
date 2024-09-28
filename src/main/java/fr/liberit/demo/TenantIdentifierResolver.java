package fr.liberit.demo;

import java.util.Map;
import lombok.Setter;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.boot.autoconfigure.orm.jpa.HibernatePropertiesCustomizer;
import org.springframework.stereotype.Component;

@Setter
@Component
class TenantIdentifierResolver implements CurrentTenantIdentifierResolver,
    HibernatePropertiesCustomizer {

  private String currentTenant = "root";

  @Override
  public String resolveCurrentTenantIdentifier() {
    return currentTenant;
  }

  @Override
  public boolean validateExistingCurrentSessions() {
    return false;
  }

  @Override
  public boolean isRoot(Object tenantId) {
    return CurrentTenantIdentifierResolver.super.isRoot(tenantId);
  }


  @Override
  public void customize(Map<String, Object> hibernateProperties) {
    hibernateProperties.put(AvailableSettings.MULTI_TENANT_IDENTIFIER_RESOLVER, this);
  }

}