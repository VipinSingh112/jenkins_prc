/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.nbp.miic.application.form.services.exception.NoSuchMiicPaymentException;
import com.nbp.miic.application.form.services.model.MiicPayment;
import com.nbp.miic.application.form.services.model.MiicPaymentTable;
import com.nbp.miic.application.form.services.model.impl.MiicPaymentImpl;
import com.nbp.miic.application.form.services.model.impl.MiicPaymentModelImpl;
import com.nbp.miic.application.form.services.service.persistence.MiicPaymentPersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicPaymentUtil;
import com.nbp.miic.application.form.services.service.persistence.impl.constants.MIIC_SERVICESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the miic payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiicPaymentPersistence.class)
public class MiicPaymentPersistenceImpl
	extends BasePersistenceImpl<MiicPayment> implements MiicPaymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiicPaymentUtil</code> to access the miic payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiicPaymentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public MiicPaymentPersistenceImpl() {
		setModelClass(MiicPayment.class);

		setModelImplClass(MiicPaymentImpl.class);
		setModelPKClass(long.class);

		setTable(MiicPaymentTable.INSTANCE);
	}

	/**
	 * Caches the miic payment in the entity cache if it is enabled.
	 *
	 * @param miicPayment the miic payment
	 */
	@Override
	public void cacheResult(MiicPayment miicPayment) {
		entityCache.putResult(
			MiicPaymentImpl.class, miicPayment.getPrimaryKey(), miicPayment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the miic payments in the entity cache if it is enabled.
	 *
	 * @param miicPayments the miic payments
	 */
	@Override
	public void cacheResult(List<MiicPayment> miicPayments) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miicPayments.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiicPayment miicPayment : miicPayments) {
			if (entityCache.getResult(
					MiicPaymentImpl.class, miicPayment.getPrimaryKey()) ==
						null) {

				cacheResult(miicPayment);
			}
		}
	}

	/**
	 * Clears the cache for all miic payments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiicPaymentImpl.class);

		finderCache.clearCache(MiicPaymentImpl.class);
	}

	/**
	 * Clears the cache for the miic payment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MiicPayment miicPayment) {
		entityCache.removeResult(MiicPaymentImpl.class, miicPayment);
	}

	@Override
	public void clearCache(List<MiicPayment> miicPayments) {
		for (MiicPayment miicPayment : miicPayments) {
			entityCache.removeResult(MiicPaymentImpl.class, miicPayment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiicPaymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(MiicPaymentImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new miic payment with the primary key. Does not add the miic payment to the database.
	 *
	 * @param miicPaymentId the primary key for the new miic payment
	 * @return the new miic payment
	 */
	@Override
	public MiicPayment create(long miicPaymentId) {
		MiicPayment miicPayment = new MiicPaymentImpl();

		miicPayment.setNew(true);
		miicPayment.setPrimaryKey(miicPaymentId);

		miicPayment.setCompanyId(CompanyThreadLocal.getCompanyId());

		return miicPayment;
	}

	/**
	 * Removes the miic payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicPaymentId the primary key of the miic payment
	 * @return the miic payment that was removed
	 * @throws NoSuchMiicPaymentException if a miic payment with the primary key could not be found
	 */
	@Override
	public MiicPayment remove(long miicPaymentId)
		throws NoSuchMiicPaymentException {

		return remove((Serializable)miicPaymentId);
	}

	/**
	 * Removes the miic payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the miic payment
	 * @return the miic payment that was removed
	 * @throws NoSuchMiicPaymentException if a miic payment with the primary key could not be found
	 */
	@Override
	public MiicPayment remove(Serializable primaryKey)
		throws NoSuchMiicPaymentException {

		Session session = null;

		try {
			session = openSession();

			MiicPayment miicPayment = (MiicPayment)session.get(
				MiicPaymentImpl.class, primaryKey);

			if (miicPayment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiicPaymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miicPayment);
		}
		catch (NoSuchMiicPaymentException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected MiicPayment removeImpl(MiicPayment miicPayment) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miicPayment)) {
				miicPayment = (MiicPayment)session.get(
					MiicPaymentImpl.class, miicPayment.getPrimaryKeyObj());
			}

			if (miicPayment != null) {
				session.delete(miicPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miicPayment != null) {
			clearCache(miicPayment);
		}

		return miicPayment;
	}

	@Override
	public MiicPayment updateImpl(MiicPayment miicPayment) {
		boolean isNew = miicPayment.isNew();

		if (!(miicPayment instanceof MiicPaymentModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(miicPayment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(miicPayment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miicPayment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiicPayment implementation " +
					miicPayment.getClass());
		}

		MiicPaymentModelImpl miicPaymentModelImpl =
			(MiicPaymentModelImpl)miicPayment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miicPayment.getCreateDate() == null)) {
			if (serviceContext == null) {
				miicPayment.setCreateDate(date);
			}
			else {
				miicPayment.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!miicPaymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miicPayment.setModifiedDate(date);
			}
			else {
				miicPayment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miicPayment);
			}
			else {
				miicPayment = (MiicPayment)session.merge(miicPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(MiicPaymentImpl.class, miicPayment, false, true);

		if (isNew) {
			miicPayment.setNew(false);
		}

		miicPayment.resetOriginalValues();

		return miicPayment;
	}

	/**
	 * Returns the miic payment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the miic payment
	 * @return the miic payment
	 * @throws NoSuchMiicPaymentException if a miic payment with the primary key could not be found
	 */
	@Override
	public MiicPayment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiicPaymentException {

		MiicPayment miicPayment = fetchByPrimaryKey(primaryKey);

		if (miicPayment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiicPaymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miicPayment;
	}

	/**
	 * Returns the miic payment with the primary key or throws a <code>NoSuchMiicPaymentException</code> if it could not be found.
	 *
	 * @param miicPaymentId the primary key of the miic payment
	 * @return the miic payment
	 * @throws NoSuchMiicPaymentException if a miic payment with the primary key could not be found
	 */
	@Override
	public MiicPayment findByPrimaryKey(long miicPaymentId)
		throws NoSuchMiicPaymentException {

		return findByPrimaryKey((Serializable)miicPaymentId);
	}

	/**
	 * Returns the miic payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicPaymentId the primary key of the miic payment
	 * @return the miic payment, or <code>null</code> if a miic payment with the primary key could not be found
	 */
	@Override
	public MiicPayment fetchByPrimaryKey(long miicPaymentId) {
		return fetchByPrimaryKey((Serializable)miicPaymentId);
	}

	/**
	 * Returns all the miic payments.
	 *
	 * @return the miic payments
	 */
	@Override
	public List<MiicPayment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic payments
	 * @param end the upper bound of the range of miic payments (not inclusive)
	 * @return the range of miic payments
	 */
	@Override
	public List<MiicPayment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic payments
	 * @param end the upper bound of the range of miic payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic payments
	 */
	@Override
	public List<MiicPayment> findAll(
		int start, int end, OrderByComparator<MiicPayment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic payments
	 * @param end the upper bound of the range of miic payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic payments
	 */
	@Override
	public List<MiicPayment> findAll(
		int start, int end, OrderByComparator<MiicPayment> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<MiicPayment> list = null;

		if (useFinderCache) {
			list = (List<MiicPayment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MIICPAYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MIICPAYMENT;

				sql = sql.concat(MiicPaymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiicPayment>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the miic payments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiicPayment miicPayment : findAll()) {
			remove(miicPayment);
		}
	}

	/**
	 * Returns the number of miic payments.
	 *
	 * @return the number of miic payments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_MIICPAYMENT);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "miicPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MIICPAYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiicPaymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the miic payment persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		MiicPaymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiicPaymentUtil.setPersistence(null);

		entityCache.removeCache(MiicPaymentImpl.class.getName());
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MIICPAYMENT =
		"SELECT miicPayment FROM MiicPayment miicPayment";

	private static final String _SQL_COUNT_MIICPAYMENT =
		"SELECT COUNT(miicPayment) FROM MiicPayment miicPayment";

	private static final String _ORDER_BY_ENTITY_ALIAS = "miicPayment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiicPayment exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		MiicPaymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}