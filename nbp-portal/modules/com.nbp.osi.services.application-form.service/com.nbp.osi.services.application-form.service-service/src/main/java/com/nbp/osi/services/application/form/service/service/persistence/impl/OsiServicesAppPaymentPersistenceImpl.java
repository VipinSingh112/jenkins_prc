/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesAppPaymentException;
import com.nbp.osi.services.application.form.service.model.OsiServicesAppPayment;
import com.nbp.osi.services.application.form.service.model.OsiServicesAppPaymentTable;
import com.nbp.osi.services.application.form.service.model.impl.OsiServicesAppPaymentImpl;
import com.nbp.osi.services.application.form.service.model.impl.OsiServicesAppPaymentModelImpl;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesAppPaymentPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesAppPaymentUtil;
import com.nbp.osi.services.application.form.service.service.persistence.impl.constants.OSI_SERVICESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
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
 * The persistence implementation for the osi services app payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiServicesAppPaymentPersistence.class)
public class OsiServicesAppPaymentPersistenceImpl
	extends BasePersistenceImpl<OsiServicesAppPayment>
	implements OsiServicesAppPaymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiServicesAppPaymentUtil</code> to access the osi services app payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiServicesAppPaymentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOsiServiceAppPaymentById;
	private FinderPath _finderPathCountBygetOsiServiceAppPaymentById;

	/**
	 * Returns the osi services app payment where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesAppPaymentException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services app payment
	 * @throws NoSuchOsiServicesAppPaymentException if a matching osi services app payment could not be found
	 */
	@Override
	public OsiServicesAppPayment findBygetOsiServiceAppPaymentById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesAppPaymentException {

		OsiServicesAppPayment osiServicesAppPayment =
			fetchBygetOsiServiceAppPaymentById(osiServicesApplicationId);

		if (osiServicesAppPayment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiServicesApplicationId=");
			sb.append(osiServicesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiServicesAppPaymentException(sb.toString());
		}

		return osiServicesAppPayment;
	}

	/**
	 * Returns the osi services app payment where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services app payment, or <code>null</code> if a matching osi services app payment could not be found
	 */
	@Override
	public OsiServicesAppPayment fetchBygetOsiServiceAppPaymentById(
		long osiServicesApplicationId) {

		return fetchBygetOsiServiceAppPaymentById(
			osiServicesApplicationId, true);
	}

	/**
	 * Returns the osi services app payment where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services app payment, or <code>null</code> if a matching osi services app payment could not be found
	 */
	@Override
	public OsiServicesAppPayment fetchBygetOsiServiceAppPaymentById(
		long osiServicesApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiServicesApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiServiceAppPaymentById, finderArgs,
				this);
		}

		if (result instanceof OsiServicesAppPayment) {
			OsiServicesAppPayment osiServicesAppPayment =
				(OsiServicesAppPayment)result;

			if (osiServicesApplicationId !=
					osiServicesAppPayment.getOsiServicesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSISERVICESAPPPAYMENT_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICEAPPPAYMENTBYID_OSISERVICESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

				List<OsiServicesAppPayment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiServiceAppPaymentById,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									osiServicesApplicationId
								};
							}

							_log.warn(
								"OsiServicesAppPaymentPersistenceImpl.fetchBygetOsiServiceAppPaymentById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiServicesAppPayment osiServicesAppPayment = list.get(0);

					result = osiServicesAppPayment;

					cacheResult(osiServicesAppPayment);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (OsiServicesAppPayment)result;
		}
	}

	/**
	 * Removes the osi services app payment where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services app payment that was removed
	 */
	@Override
	public OsiServicesAppPayment removeBygetOsiServiceAppPaymentById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesAppPaymentException {

		OsiServicesAppPayment osiServicesAppPayment =
			findBygetOsiServiceAppPaymentById(osiServicesApplicationId);

		return remove(osiServicesAppPayment);
	}

	/**
	 * Returns the number of osi services app payments where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services app payments
	 */
	@Override
	public int countBygetOsiServiceAppPaymentById(
		long osiServicesApplicationId) {

		FinderPath finderPath = _finderPathCountBygetOsiServiceAppPaymentById;

		Object[] finderArgs = new Object[] {osiServicesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESAPPPAYMENT_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICEAPPPAYMENTBYID_OSISERVICESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
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

	private static final String
		_FINDER_COLUMN_GETOSISERVICEAPPPAYMENTBYID_OSISERVICESAPPLICATIONID_2 =
			"osiServicesAppPayment.osiServicesApplicationId = ?";

	public OsiServicesAppPaymentPersistenceImpl() {
		setModelClass(OsiServicesAppPayment.class);

		setModelImplClass(OsiServicesAppPaymentImpl.class);
		setModelPKClass(long.class);

		setTable(OsiServicesAppPaymentTable.INSTANCE);
	}

	/**
	 * Caches the osi services app payment in the entity cache if it is enabled.
	 *
	 * @param osiServicesAppPayment the osi services app payment
	 */
	@Override
	public void cacheResult(OsiServicesAppPayment osiServicesAppPayment) {
		entityCache.putResult(
			OsiServicesAppPaymentImpl.class,
			osiServicesAppPayment.getPrimaryKey(), osiServicesAppPayment);

		finderCache.putResult(
			_finderPathFetchBygetOsiServiceAppPaymentById,
			new Object[] {osiServicesAppPayment.getOsiServicesApplicationId()},
			osiServicesAppPayment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi services app payments in the entity cache if it is enabled.
	 *
	 * @param osiServicesAppPayments the osi services app payments
	 */
	@Override
	public void cacheResult(
		List<OsiServicesAppPayment> osiServicesAppPayments) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiServicesAppPayments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiServicesAppPayment osiServicesAppPayment :
				osiServicesAppPayments) {

			if (entityCache.getResult(
					OsiServicesAppPaymentImpl.class,
					osiServicesAppPayment.getPrimaryKey()) == null) {

				cacheResult(osiServicesAppPayment);
			}
		}
	}

	/**
	 * Clears the cache for all osi services app payments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiServicesAppPaymentImpl.class);

		finderCache.clearCache(OsiServicesAppPaymentImpl.class);
	}

	/**
	 * Clears the cache for the osi services app payment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OsiServicesAppPayment osiServicesAppPayment) {
		entityCache.removeResult(
			OsiServicesAppPaymentImpl.class, osiServicesAppPayment);
	}

	@Override
	public void clearCache(List<OsiServicesAppPayment> osiServicesAppPayments) {
		for (OsiServicesAppPayment osiServicesAppPayment :
				osiServicesAppPayments) {

			entityCache.removeResult(
				OsiServicesAppPaymentImpl.class, osiServicesAppPayment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiServicesAppPaymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiServicesAppPaymentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiServicesAppPaymentModelImpl osiServicesAppPaymentModelImpl) {

		Object[] args = new Object[] {
			osiServicesAppPaymentModelImpl.getOsiServicesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiServiceAppPaymentById, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiServiceAppPaymentById, args,
			osiServicesAppPaymentModelImpl);
	}

	/**
	 * Creates a new osi services app payment with the primary key. Does not add the osi services app payment to the database.
	 *
	 * @param osiServicesAppPaymentId the primary key for the new osi services app payment
	 * @return the new osi services app payment
	 */
	@Override
	public OsiServicesAppPayment create(long osiServicesAppPaymentId) {
		OsiServicesAppPayment osiServicesAppPayment =
			new OsiServicesAppPaymentImpl();

		osiServicesAppPayment.setNew(true);
		osiServicesAppPayment.setPrimaryKey(osiServicesAppPaymentId);

		osiServicesAppPayment.setCompanyId(CompanyThreadLocal.getCompanyId());

		return osiServicesAppPayment;
	}

	/**
	 * Removes the osi services app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiServicesAppPaymentId the primary key of the osi services app payment
	 * @return the osi services app payment that was removed
	 * @throws NoSuchOsiServicesAppPaymentException if a osi services app payment with the primary key could not be found
	 */
	@Override
	public OsiServicesAppPayment remove(long osiServicesAppPaymentId)
		throws NoSuchOsiServicesAppPaymentException {

		return remove((Serializable)osiServicesAppPaymentId);
	}

	/**
	 * Removes the osi services app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi services app payment
	 * @return the osi services app payment that was removed
	 * @throws NoSuchOsiServicesAppPaymentException if a osi services app payment with the primary key could not be found
	 */
	@Override
	public OsiServicesAppPayment remove(Serializable primaryKey)
		throws NoSuchOsiServicesAppPaymentException {

		Session session = null;

		try {
			session = openSession();

			OsiServicesAppPayment osiServicesAppPayment =
				(OsiServicesAppPayment)session.get(
					OsiServicesAppPaymentImpl.class, primaryKey);

			if (osiServicesAppPayment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiServicesAppPaymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiServicesAppPayment);
		}
		catch (NoSuchOsiServicesAppPaymentException noSuchEntityException) {
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
	protected OsiServicesAppPayment removeImpl(
		OsiServicesAppPayment osiServicesAppPayment) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiServicesAppPayment)) {
				osiServicesAppPayment = (OsiServicesAppPayment)session.get(
					OsiServicesAppPaymentImpl.class,
					osiServicesAppPayment.getPrimaryKeyObj());
			}

			if (osiServicesAppPayment != null) {
				session.delete(osiServicesAppPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiServicesAppPayment != null) {
			clearCache(osiServicesAppPayment);
		}

		return osiServicesAppPayment;
	}

	@Override
	public OsiServicesAppPayment updateImpl(
		OsiServicesAppPayment osiServicesAppPayment) {

		boolean isNew = osiServicesAppPayment.isNew();

		if (!(osiServicesAppPayment instanceof
				OsiServicesAppPaymentModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiServicesAppPayment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiServicesAppPayment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiServicesAppPayment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiServicesAppPayment implementation " +
					osiServicesAppPayment.getClass());
		}

		OsiServicesAppPaymentModelImpl osiServicesAppPaymentModelImpl =
			(OsiServicesAppPaymentModelImpl)osiServicesAppPayment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiServicesAppPayment.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiServicesAppPayment.setCreateDate(date);
			}
			else {
				osiServicesAppPayment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiServicesAppPaymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiServicesAppPayment.setModifiedDate(date);
			}
			else {
				osiServicesAppPayment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiServicesAppPayment);
			}
			else {
				osiServicesAppPayment = (OsiServicesAppPayment)session.merge(
					osiServicesAppPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiServicesAppPaymentImpl.class, osiServicesAppPaymentModelImpl,
			false, true);

		cacheUniqueFindersCache(osiServicesAppPaymentModelImpl);

		if (isNew) {
			osiServicesAppPayment.setNew(false);
		}

		osiServicesAppPayment.resetOriginalValues();

		return osiServicesAppPayment;
	}

	/**
	 * Returns the osi services app payment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi services app payment
	 * @return the osi services app payment
	 * @throws NoSuchOsiServicesAppPaymentException if a osi services app payment with the primary key could not be found
	 */
	@Override
	public OsiServicesAppPayment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiServicesAppPaymentException {

		OsiServicesAppPayment osiServicesAppPayment = fetchByPrimaryKey(
			primaryKey);

		if (osiServicesAppPayment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiServicesAppPaymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiServicesAppPayment;
	}

	/**
	 * Returns the osi services app payment with the primary key or throws a <code>NoSuchOsiServicesAppPaymentException</code> if it could not be found.
	 *
	 * @param osiServicesAppPaymentId the primary key of the osi services app payment
	 * @return the osi services app payment
	 * @throws NoSuchOsiServicesAppPaymentException if a osi services app payment with the primary key could not be found
	 */
	@Override
	public OsiServicesAppPayment findByPrimaryKey(long osiServicesAppPaymentId)
		throws NoSuchOsiServicesAppPaymentException {

		return findByPrimaryKey((Serializable)osiServicesAppPaymentId);
	}

	/**
	 * Returns the osi services app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiServicesAppPaymentId the primary key of the osi services app payment
	 * @return the osi services app payment, or <code>null</code> if a osi services app payment with the primary key could not be found
	 */
	@Override
	public OsiServicesAppPayment fetchByPrimaryKey(
		long osiServicesAppPaymentId) {

		return fetchByPrimaryKey((Serializable)osiServicesAppPaymentId);
	}

	/**
	 * Returns all the osi services app payments.
	 *
	 * @return the osi services app payments
	 */
	@Override
	public List<OsiServicesAppPayment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services app payments
	 * @param end the upper bound of the range of osi services app payments (not inclusive)
	 * @return the range of osi services app payments
	 */
	@Override
	public List<OsiServicesAppPayment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services app payments
	 * @param end the upper bound of the range of osi services app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services app payments
	 */
	@Override
	public List<OsiServicesAppPayment> findAll(
		int start, int end,
		OrderByComparator<OsiServicesAppPayment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services app payments
	 * @param end the upper bound of the range of osi services app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services app payments
	 */
	@Override
	public List<OsiServicesAppPayment> findAll(
		int start, int end,
		OrderByComparator<OsiServicesAppPayment> orderByComparator,
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

		List<OsiServicesAppPayment> list = null;

		if (useFinderCache) {
			list = (List<OsiServicesAppPayment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSISERVICESAPPPAYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSISERVICESAPPPAYMENT;

				sql = sql.concat(OsiServicesAppPaymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiServicesAppPayment>)QueryUtil.list(
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
	 * Removes all the osi services app payments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiServicesAppPayment osiServicesAppPayment : findAll()) {
			remove(osiServicesAppPayment);
		}
	}

	/**
	 * Returns the number of osi services app payments.
	 *
	 * @return the number of osi services app payments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_OSISERVICESAPPPAYMENT);

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
		return "osiServicesAppPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSISERVICESAPPPAYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiServicesAppPaymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi services app payment persistence.
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

		_finderPathFetchBygetOsiServiceAppPaymentById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiServiceAppPaymentById",
			new String[] {Long.class.getName()},
			new String[] {"osiServicesApplicationId"}, true);

		_finderPathCountBygetOsiServiceAppPaymentById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOsiServiceAppPaymentById",
			new String[] {Long.class.getName()},
			new String[] {"osiServicesApplicationId"}, false);

		OsiServicesAppPaymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiServicesAppPaymentUtil.setPersistence(null);

		entityCache.removeCache(OsiServicesAppPaymentImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSISERVICESAPPPAYMENT =
		"SELECT osiServicesAppPayment FROM OsiServicesAppPayment osiServicesAppPayment";

	private static final String _SQL_SELECT_OSISERVICESAPPPAYMENT_WHERE =
		"SELECT osiServicesAppPayment FROM OsiServicesAppPayment osiServicesAppPayment WHERE ";

	private static final String _SQL_COUNT_OSISERVICESAPPPAYMENT =
		"SELECT COUNT(osiServicesAppPayment) FROM OsiServicesAppPayment osiServicesAppPayment";

	private static final String _SQL_COUNT_OSISERVICESAPPPAYMENT_WHERE =
		"SELECT COUNT(osiServicesAppPayment) FROM OsiServicesAppPayment osiServicesAppPayment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiServicesAppPayment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiServicesAppPayment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiServicesAppPayment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiServicesAppPaymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}