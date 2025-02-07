/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence.impl;

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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiInsolvencyApplicationPaymentException;
import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyApplicationPayment;
import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyApplicationPaymentTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyApplicationPaymentImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyApplicationPaymentModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiInsolvencyApplicationPaymentPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiInsolvencyApplicationPaymentUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.impl.constants.OSI_INSOLVENCYPersistenceConstants;

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
 * The persistence implementation for the osi insolvency application payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiInsolvencyApplicationPaymentPersistence.class)
public class OsiInsolvencyApplicationPaymentPersistenceImpl
	extends BasePersistenceImpl<OsiInsolvencyApplicationPayment>
	implements OsiInsolvencyApplicationPaymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiInsolvencyApplicationPaymentUtil</code> to access the osi insolvency application payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiInsolvencyApplicationPaymentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOIP_OII;
	private FinderPath _finderPathCountBygetOIP_OII;

	/**
	 * Returns the osi insolvency application payment where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationPaymentException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency application payment
	 * @throws NoSuchOsiInsolvencyApplicationPaymentException if a matching osi insolvency application payment could not be found
	 */
	@Override
	public OsiInsolvencyApplicationPayment findBygetOIP_OII(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvencyApplicationPaymentException {

		OsiInsolvencyApplicationPayment osiInsolvencyApplicationPayment =
			fetchBygetOIP_OII(osiInsolvencyId);

		if (osiInsolvencyApplicationPayment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiInsolvencyApplicationPaymentException(
				sb.toString());
		}

		return osiInsolvencyApplicationPayment;
	}

	/**
	 * Returns the osi insolvency application payment where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency application payment, or <code>null</code> if a matching osi insolvency application payment could not be found
	 */
	@Override
	public OsiInsolvencyApplicationPayment fetchBygetOIP_OII(
		long osiInsolvencyId) {

		return fetchBygetOIP_OII(osiInsolvencyId, true);
	}

	/**
	 * Returns the osi insolvency application payment where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application payment, or <code>null</code> if a matching osi insolvency application payment could not be found
	 */
	@Override
	public OsiInsolvencyApplicationPayment fetchBygetOIP_OII(
		long osiInsolvencyId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiInsolvencyId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOIP_OII, finderArgs, this);
		}

		if (result instanceof OsiInsolvencyApplicationPayment) {
			OsiInsolvencyApplicationPayment osiInsolvencyApplicationPayment =
				(OsiInsolvencyApplicationPayment)result;

			if (osiInsolvencyId !=
					osiInsolvencyApplicationPayment.getOsiInsolvencyId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATIONPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETOIP_OII_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<OsiInsolvencyApplicationPayment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOIP_OII, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {osiInsolvencyId};
							}

							_log.warn(
								"OsiInsolvencyApplicationPaymentPersistenceImpl.fetchBygetOIP_OII(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiInsolvencyApplicationPayment
						osiInsolvencyApplicationPayment = list.get(0);

					result = osiInsolvencyApplicationPayment;

					cacheResult(osiInsolvencyApplicationPayment);
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
			return (OsiInsolvencyApplicationPayment)result;
		}
	}

	/**
	 * Removes the osi insolvency application payment where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi insolvency application payment that was removed
	 */
	@Override
	public OsiInsolvencyApplicationPayment removeBygetOIP_OII(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvencyApplicationPaymentException {

		OsiInsolvencyApplicationPayment osiInsolvencyApplicationPayment =
			findBygetOIP_OII(osiInsolvencyId);

		return remove(osiInsolvencyApplicationPayment);
	}

	/**
	 * Returns the number of osi insolvency application payments where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi insolvency application payments
	 */
	@Override
	public int countBygetOIP_OII(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOIP_OII;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINSOLVENCYAPPLICATIONPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETOIP_OII_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

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

	private static final String _FINDER_COLUMN_GETOIP_OII_OSIINSOLVENCYID_2 =
		"osiInsolvencyApplicationPayment.osiInsolvencyId = ?";

	public OsiInsolvencyApplicationPaymentPersistenceImpl() {
		setModelClass(OsiInsolvencyApplicationPayment.class);

		setModelImplClass(OsiInsolvencyApplicationPaymentImpl.class);
		setModelPKClass(long.class);

		setTable(OsiInsolvencyApplicationPaymentTable.INSTANCE);
	}

	/**
	 * Caches the osi insolvency application payment in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyApplicationPayment the osi insolvency application payment
	 */
	@Override
	public void cacheResult(
		OsiInsolvencyApplicationPayment osiInsolvencyApplicationPayment) {

		entityCache.putResult(
			OsiInsolvencyApplicationPaymentImpl.class,
			osiInsolvencyApplicationPayment.getPrimaryKey(),
			osiInsolvencyApplicationPayment);

		finderCache.putResult(
			_finderPathFetchBygetOIP_OII,
			new Object[] {osiInsolvencyApplicationPayment.getOsiInsolvencyId()},
			osiInsolvencyApplicationPayment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi insolvency application payments in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyApplicationPayments the osi insolvency application payments
	 */
	@Override
	public void cacheResult(
		List<OsiInsolvencyApplicationPayment>
			osiInsolvencyApplicationPayments) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiInsolvencyApplicationPayments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiInsolvencyApplicationPayment osiInsolvencyApplicationPayment :
				osiInsolvencyApplicationPayments) {

			if (entityCache.getResult(
					OsiInsolvencyApplicationPaymentImpl.class,
					osiInsolvencyApplicationPayment.getPrimaryKey()) == null) {

				cacheResult(osiInsolvencyApplicationPayment);
			}
		}
	}

	/**
	 * Clears the cache for all osi insolvency application payments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiInsolvencyApplicationPaymentImpl.class);

		finderCache.clearCache(OsiInsolvencyApplicationPaymentImpl.class);
	}

	/**
	 * Clears the cache for the osi insolvency application payment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		OsiInsolvencyApplicationPayment osiInsolvencyApplicationPayment) {

		entityCache.removeResult(
			OsiInsolvencyApplicationPaymentImpl.class,
			osiInsolvencyApplicationPayment);
	}

	@Override
	public void clearCache(
		List<OsiInsolvencyApplicationPayment>
			osiInsolvencyApplicationPayments) {

		for (OsiInsolvencyApplicationPayment osiInsolvencyApplicationPayment :
				osiInsolvencyApplicationPayments) {

			entityCache.removeResult(
				OsiInsolvencyApplicationPaymentImpl.class,
				osiInsolvencyApplicationPayment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiInsolvencyApplicationPaymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiInsolvencyApplicationPaymentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiInsolvencyApplicationPaymentModelImpl
			osiInsolvencyApplicationPaymentModelImpl) {

		Object[] args = new Object[] {
			osiInsolvencyApplicationPaymentModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOIP_OII, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOIP_OII, args,
			osiInsolvencyApplicationPaymentModelImpl);
	}

	/**
	 * Creates a new osi insolvency application payment with the primary key. Does not add the osi insolvency application payment to the database.
	 *
	 * @param osiInsolveApplicationPaymentId the primary key for the new osi insolvency application payment
	 * @return the new osi insolvency application payment
	 */
	@Override
	public OsiInsolvencyApplicationPayment create(
		long osiInsolveApplicationPaymentId) {

		OsiInsolvencyApplicationPayment osiInsolvencyApplicationPayment =
			new OsiInsolvencyApplicationPaymentImpl();

		osiInsolvencyApplicationPayment.setNew(true);
		osiInsolvencyApplicationPayment.setPrimaryKey(
			osiInsolveApplicationPaymentId);

		osiInsolvencyApplicationPayment.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return osiInsolvencyApplicationPayment;
	}

	/**
	 * Removes the osi insolvency application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInsolveApplicationPaymentId the primary key of the osi insolvency application payment
	 * @return the osi insolvency application payment that was removed
	 * @throws NoSuchOsiInsolvencyApplicationPaymentException if a osi insolvency application payment with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplicationPayment remove(
			long osiInsolveApplicationPaymentId)
		throws NoSuchOsiInsolvencyApplicationPaymentException {

		return remove((Serializable)osiInsolveApplicationPaymentId);
	}

	/**
	 * Removes the osi insolvency application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi insolvency application payment
	 * @return the osi insolvency application payment that was removed
	 * @throws NoSuchOsiInsolvencyApplicationPaymentException if a osi insolvency application payment with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplicationPayment remove(Serializable primaryKey)
		throws NoSuchOsiInsolvencyApplicationPaymentException {

		Session session = null;

		try {
			session = openSession();

			OsiInsolvencyApplicationPayment osiInsolvencyApplicationPayment =
				(OsiInsolvencyApplicationPayment)session.get(
					OsiInsolvencyApplicationPaymentImpl.class, primaryKey);

			if (osiInsolvencyApplicationPayment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiInsolvencyApplicationPaymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiInsolvencyApplicationPayment);
		}
		catch (NoSuchOsiInsolvencyApplicationPaymentException
					noSuchEntityException) {

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
	protected OsiInsolvencyApplicationPayment removeImpl(
		OsiInsolvencyApplicationPayment osiInsolvencyApplicationPayment) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiInsolvencyApplicationPayment)) {
				osiInsolvencyApplicationPayment =
					(OsiInsolvencyApplicationPayment)session.get(
						OsiInsolvencyApplicationPaymentImpl.class,
						osiInsolvencyApplicationPayment.getPrimaryKeyObj());
			}

			if (osiInsolvencyApplicationPayment != null) {
				session.delete(osiInsolvencyApplicationPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiInsolvencyApplicationPayment != null) {
			clearCache(osiInsolvencyApplicationPayment);
		}

		return osiInsolvencyApplicationPayment;
	}

	@Override
	public OsiInsolvencyApplicationPayment updateImpl(
		OsiInsolvencyApplicationPayment osiInsolvencyApplicationPayment) {

		boolean isNew = osiInsolvencyApplicationPayment.isNew();

		if (!(osiInsolvencyApplicationPayment instanceof
				OsiInsolvencyApplicationPaymentModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					osiInsolvencyApplicationPayment.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					osiInsolvencyApplicationPayment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiInsolvencyApplicationPayment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiInsolvencyApplicationPayment implementation " +
					osiInsolvencyApplicationPayment.getClass());
		}

		OsiInsolvencyApplicationPaymentModelImpl
			osiInsolvencyApplicationPaymentModelImpl =
				(OsiInsolvencyApplicationPaymentModelImpl)
					osiInsolvencyApplicationPayment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(osiInsolvencyApplicationPayment.getCreateDate() == null)) {

			if (serviceContext == null) {
				osiInsolvencyApplicationPayment.setCreateDate(date);
			}
			else {
				osiInsolvencyApplicationPayment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiInsolvencyApplicationPaymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiInsolvencyApplicationPayment.setModifiedDate(date);
			}
			else {
				osiInsolvencyApplicationPayment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiInsolvencyApplicationPayment);
			}
			else {
				osiInsolvencyApplicationPayment =
					(OsiInsolvencyApplicationPayment)session.merge(
						osiInsolvencyApplicationPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiInsolvencyApplicationPaymentImpl.class,
			osiInsolvencyApplicationPaymentModelImpl, false, true);

		cacheUniqueFindersCache(osiInsolvencyApplicationPaymentModelImpl);

		if (isNew) {
			osiInsolvencyApplicationPayment.setNew(false);
		}

		osiInsolvencyApplicationPayment.resetOriginalValues();

		return osiInsolvencyApplicationPayment;
	}

	/**
	 * Returns the osi insolvency application payment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi insolvency application payment
	 * @return the osi insolvency application payment
	 * @throws NoSuchOsiInsolvencyApplicationPaymentException if a osi insolvency application payment with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplicationPayment findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchOsiInsolvencyApplicationPaymentException {

		OsiInsolvencyApplicationPayment osiInsolvencyApplicationPayment =
			fetchByPrimaryKey(primaryKey);

		if (osiInsolvencyApplicationPayment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiInsolvencyApplicationPaymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiInsolvencyApplicationPayment;
	}

	/**
	 * Returns the osi insolvency application payment with the primary key or throws a <code>NoSuchOsiInsolvencyApplicationPaymentException</code> if it could not be found.
	 *
	 * @param osiInsolveApplicationPaymentId the primary key of the osi insolvency application payment
	 * @return the osi insolvency application payment
	 * @throws NoSuchOsiInsolvencyApplicationPaymentException if a osi insolvency application payment with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplicationPayment findByPrimaryKey(
			long osiInsolveApplicationPaymentId)
		throws NoSuchOsiInsolvencyApplicationPaymentException {

		return findByPrimaryKey((Serializable)osiInsolveApplicationPaymentId);
	}

	/**
	 * Returns the osi insolvency application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInsolveApplicationPaymentId the primary key of the osi insolvency application payment
	 * @return the osi insolvency application payment, or <code>null</code> if a osi insolvency application payment with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyApplicationPayment fetchByPrimaryKey(
		long osiInsolveApplicationPaymentId) {

		return fetchByPrimaryKey((Serializable)osiInsolveApplicationPaymentId);
	}

	/**
	 * Returns all the osi insolvency application payments.
	 *
	 * @return the osi insolvency application payments
	 */
	@Override
	public List<OsiInsolvencyApplicationPayment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi insolvency application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency application payments
	 * @param end the upper bound of the range of osi insolvency application payments (not inclusive)
	 * @return the range of osi insolvency application payments
	 */
	@Override
	public List<OsiInsolvencyApplicationPayment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency application payments
	 * @param end the upper bound of the range of osi insolvency application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insolvency application payments
	 */
	@Override
	public List<OsiInsolvencyApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvencyApplicationPayment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency application payments
	 * @param end the upper bound of the range of osi insolvency application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insolvency application payments
	 */
	@Override
	public List<OsiInsolvencyApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvencyApplicationPayment> orderByComparator,
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

		List<OsiInsolvencyApplicationPayment> list = null;

		if (useFinderCache) {
			list = (List<OsiInsolvencyApplicationPayment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSIINSOLVENCYAPPLICATIONPAYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSIINSOLVENCYAPPLICATIONPAYMENT;

				sql = sql.concat(
					OsiInsolvencyApplicationPaymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiInsolvencyApplicationPayment>)QueryUtil.list(
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
	 * Removes all the osi insolvency application payments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiInsolvencyApplicationPayment osiInsolvencyApplicationPayment :
				findAll()) {

			remove(osiInsolvencyApplicationPayment);
		}
	}

	/**
	 * Returns the number of osi insolvency application payments.
	 *
	 * @return the number of osi insolvency application payments
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
					_SQL_COUNT_OSIINSOLVENCYAPPLICATIONPAYMENT);

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
		return "osiInsolveApplicationPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSIINSOLVENCYAPPLICATIONPAYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiInsolvencyApplicationPaymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi insolvency application payment persistence.
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

		_finderPathFetchBygetOIP_OII = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOIP_OII",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOIP_OII = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOIP_OII",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		OsiInsolvencyApplicationPaymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiInsolvencyApplicationPaymentUtil.setPersistence(null);

		entityCache.removeCache(
			OsiInsolvencyApplicationPaymentImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSIINSOLVENCYAPPLICATIONPAYMENT =
		"SELECT osiInsolvencyApplicationPayment FROM OsiInsolvencyApplicationPayment osiInsolvencyApplicationPayment";

	private static final String
		_SQL_SELECT_OSIINSOLVENCYAPPLICATIONPAYMENT_WHERE =
			"SELECT osiInsolvencyApplicationPayment FROM OsiInsolvencyApplicationPayment osiInsolvencyApplicationPayment WHERE ";

	private static final String _SQL_COUNT_OSIINSOLVENCYAPPLICATIONPAYMENT =
		"SELECT COUNT(osiInsolvencyApplicationPayment) FROM OsiInsolvencyApplicationPayment osiInsolvencyApplicationPayment";

	private static final String
		_SQL_COUNT_OSIINSOLVENCYAPPLICATIONPAYMENT_WHERE =
			"SELECT COUNT(osiInsolvencyApplicationPayment) FROM OsiInsolvencyApplicationPayment osiInsolvencyApplicationPayment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiInsolvencyApplicationPayment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiInsolvencyApplicationPayment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiInsolvencyApplicationPayment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiInsolvencyApplicationPaymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}