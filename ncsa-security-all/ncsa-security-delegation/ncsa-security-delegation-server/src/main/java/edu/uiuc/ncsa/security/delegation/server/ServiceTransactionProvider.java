package edu.uiuc.ncsa.security.delegation.server;

import edu.uiuc.ncsa.security.core.Identifier;
import edu.uiuc.ncsa.security.core.util.IdentifierProvider;
import edu.uiuc.ncsa.security.delegation.storage.impl.BasicTransactionProvider;

/**
 * <p>Created by Jeff Gaynor<br>
 * on 4/4/12 at  4:27 PM
 */
public class ServiceTransactionProvider<V extends ServiceTransaction> extends BasicTransactionProvider<V> {
    public ServiceTransactionProvider(IdentifierProvider<Identifier> idProvider) {
        super(idProvider);
    }

    @Override
    public V get(boolean createNewIdentifier) {
        return (V) new ServiceTransaction(createNewId(createNewIdentifier));
    }
}
