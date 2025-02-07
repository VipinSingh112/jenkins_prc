/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence.impl;

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

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisLicensePaymentException;
import com.npm.cannabis.application.stages.services.model.CannabisLicensePayment;
import com.npm.cannabis.application.stages.services.model.CannabisLicensePaymentTable;
import com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePaymentImpl;
import com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePaymentModelImpl;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisLicensePaymentPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisLicensePaymentUtil;
import com.npm.cannabis.application.stages.services.service.persistence.impl.constants.CANNABIS_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the cannabis license payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisLicensePaymentPersistence.class)
public class CannabisLicensePaymentPersistenceImpl
	extends BasePersistenceImpl<CannabisLicensePayment>
	implements CannabisLicensePaymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisLicensePaymentUtil</code> to access the cannabis license payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisLicensePaymentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetCLP_CAI;
	private FinderPath _finderPathCountBygetCLP_CAI;

	/**
	 * Returns the cannabis license payment where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisLicensePaymentException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis license payment
	 * @throws NoSuchCannabisLicensePaymentException if a matching cannabis license payment could not be found
	 */
	@Override
	public CannabisLicensePayment findBygetCLP_CAI(long cannabisApplicationId)
		throws NoSuchCannabisLicensePaymentException {

		CannabisLicensePayment cannabisLicensePayment = fetchBygetCLP_CAI(
			cannabisApplicationId);

		if (cannabisLicensePayment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("cannabisApplicationId=");
			sb.append(cannabisApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisLicensePaymentException(sb.toString());
		}

		return cannabisLicensePayment;
	}

	/**
	 * Returns the cannabis license payment where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis license payment, or <code>null</code> if a matching cannabis license payment could not be found
	 */
	@Override
	public CannabisLicensePayment fetchBygetCLP_CAI(
		long cannabisApplicationId) {

		return fetchBygetCLP_CAI(cannabisApplicationId, true);
	}

	/**
	 * Returns the cannabis license payment where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis license payment, or <code>null</code> if a matching cannabis license payment could not be found
	 */
	@Override
	public CannabisLicensePayment fetchBygetCLP_CAI(
		long cannabisApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {cannabisApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCLP_CAI, finderArgs, this);
		}

		if (result instanceof CannabisLicensePayment) {
			CannabisLicensePayment cannabisLicensePayment =
				(CannabisLicensePayment)result;

			if (cannabisApplicationId !=
					cannabisLicensePayment.getCannabisApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CANNABISLICENSEPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETCLP_CAI_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				List<CannabisLicensePayment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCLP_CAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									cannabisApplicationId
								};
							}

							_log.warn(
								"CannabisLicensePaymentPersistenceImpl.fetchBygetCLP_CAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisLicensePayment cannabisLicensePayment = list.get(0);

					result = cannabisLicensePayment;

					cacheResult(cannabisLicensePayment);
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
			return (CannabisLicensePayment)result;
		}
	}

	/**
	 * Removes the cannabis license payment where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis license payment that was removed
	 */
	@Override
	public CannabisLicensePayment removeBygetCLP_CAI(long cannabisApplicationId)
		throws NoSuchCannabisLicensePaymentException {

		CannabisLicensePayment cannabisLicensePayment = findBygetCLP_CAI(
			cannabisApplicationId);

		return remove(cannabisLicensePayment);
	}

	/**
	 * Returns the number of cannabis license payments where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis license payments
	 */
	@Override
	public int countBygetCLP_CAI(long cannabisApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCLP_CAI;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISLICENSEPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETCLP_CAI_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

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
		_FINDER_COLUMN_GETCLP_CAI_CANNABISAPPLICATIONID_2 =
			"cannabisLicensePayment.cannabisApplicationId = ?";

	private FinderPath _finderPathFetchBygetCADD_CaseId;
	private FinderPath _finderPathCountBygetCADD_CaseId;

	/**
	 * Returns the cannabis license payment where caseId = &#63; or throws a <code>NoSuchCannabisLicensePaymentException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis license payment
	 * @throws NoSuchCannabisLicensePaymentException if a matching cannabis license payment could not be found
	 */
	@Override
	public CannabisLicensePayment findBygetCADD_CaseId(String caseId)
		throws NoSuchCannabisLicensePaymentException {

		CannabisLicensePayment cannabisLicensePayment = fetchBygetCADD_CaseId(
			caseId);

		if (cannabisLicensePayment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisLicensePaymentException(sb.toString());
		}

		return cannabisLicensePayment;
	}

	/**
	 * Returns the cannabis license payment where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis license payment, or <code>null</code> if a matching cannabis license payment could not be found
	 */
	@Override
	public CannabisLicensePayment fetchBygetCADD_CaseId(String caseId) {
		return fetchBygetCADD_CaseId(caseId, true);
	}

	/**
	 * Returns the cannabis license payment where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis license payment, or <code>null</code> if a matching cannabis license payment could not be found
	 */
	@Override
	public CannabisLicensePayment fetchBygetCADD_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCADD_CaseId, finderArgs, this);
		}

		if (result instanceof CannabisLicensePayment) {
			CannabisLicensePayment cannabisLicensePayment =
				(CannabisLicensePayment)result;

			if (!Objects.equals(caseId, cannabisLicensePayment.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CANNABISLICENSEPAYMENT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCADD_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCADD_CASEID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<CannabisLicensePayment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCADD_CaseId, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"CannabisLicensePaymentPersistenceImpl.fetchBygetCADD_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisLicensePayment cannabisLicensePayment = list.get(0);

					result = cannabisLicensePayment;

					cacheResult(cannabisLicensePayment);
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
			return (CannabisLicensePayment)result;
		}
	}

	/**
	 * Removes the cannabis license payment where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the cannabis license payment that was removed
	 */
	@Override
	public CannabisLicensePayment removeBygetCADD_CaseId(String caseId)
		throws NoSuchCannabisLicensePaymentException {

		CannabisLicensePayment cannabisLicensePayment = findBygetCADD_CaseId(
			caseId);

		return remove(cannabisLicensePayment);
	}

	/**
	 * Returns the number of cannabis license payments where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis license payments
	 */
	@Override
	public int countBygetCADD_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCADD_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISLICENSEPAYMENT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCADD_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCADD_CASEID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

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

	private static final String _FINDER_COLUMN_GETCADD_CASEID_CASEID_2 =
		"cannabisLicensePayment.caseId = ?";

	private static final String _FINDER_COLUMN_GETCADD_CASEID_CASEID_3 =
		"(cannabisLicensePayment.caseId IS NULL OR cannabisLicensePayment.caseId = '')";

	public CannabisLicensePaymentPersistenceImpl() {
		setModelClass(CannabisLicensePayment.class);

		setModelImplClass(CannabisLicensePaymentImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisLicensePaymentTable.INSTANCE);
	}

	/**
	 * Caches the cannabis license payment in the entity cache if it is enabled.
	 *
	 * @param cannabisLicensePayment the cannabis license payment
	 */
	@Override
	public void cacheResult(CannabisLicensePayment cannabisLicensePayment) {
		entityCache.putResult(
			CannabisLicensePaymentImpl.class,
			cannabisLicensePayment.getPrimaryKey(), cannabisLicensePayment);

		finderCache.putResult(
			_finderPathFetchBygetCLP_CAI,
			new Object[] {cannabisLicensePayment.getCannabisApplicationId()},
			cannabisLicensePayment);

		finderCache.putResult(
			_finderPathFetchBygetCADD_CaseId,
			new Object[] {cannabisLicensePayment.getCaseId()},
			cannabisLicensePayment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis license payments in the entity cache if it is enabled.
	 *
	 * @param cannabisLicensePayments the cannabis license payments
	 */
	@Override
	public void cacheResult(
		List<CannabisLicensePayment> cannabisLicensePayments) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisLicensePayments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisLicensePayment cannabisLicensePayment :
				cannabisLicensePayments) {

			if (entityCache.getResult(
					CannabisLicensePaymentImpl.class,
					cannabisLicensePayment.getPrimaryKey()) == null) {

				cacheResult(cannabisLicensePayment);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis license payments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisLicensePaymentImpl.class);

		finderCache.clearCache(CannabisLicensePaymentImpl.class);
	}

	/**
	 * Clears the cache for the cannabis license payment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CannabisLicensePayment cannabisLicensePayment) {
		entityCache.removeResult(
			CannabisLicensePaymentImpl.class, cannabisLicensePayment);
	}

	@Override
	public void clearCache(
		List<CannabisLicensePayment> cannabisLicensePayments) {

		for (CannabisLicensePayment cannabisLicensePayment :
				cannabisLicensePayments) {

			entityCache.removeResult(
				CannabisLicensePaymentImpl.class, cannabisLicensePayment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisLicensePaymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisLicensePaymentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CannabisLicensePaymentModelImpl cannabisLicensePaymentModelImpl) {

		Object[] args = new Object[] {
			cannabisLicensePaymentModelImpl.getCannabisApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCLP_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCLP_CAI, args,
			cannabisLicensePaymentModelImpl);

		args = new Object[] {cannabisLicensePaymentModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetCADD_CaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCADD_CaseId, args,
			cannabisLicensePaymentModelImpl);
	}

	/**
	 * Creates a new cannabis license payment with the primary key. Does not add the cannabis license payment to the database.
	 *
	 * @param cannabisLicensePaymentId the primary key for the new cannabis license payment
	 * @return the new cannabis license payment
	 */
	@Override
	public CannabisLicensePayment create(long cannabisLicensePaymentId) {
		CannabisLicensePayment cannabisLicensePayment =
			new CannabisLicensePaymentImpl();

		cannabisLicensePayment.setNew(true);
		cannabisLicensePayment.setPrimaryKey(cannabisLicensePaymentId);

		cannabisLicensePayment.setCompanyId(CompanyThreadLocal.getCompanyId());

		return cannabisLicensePayment;
	}

	/**
	 * Removes the cannabis license payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisLicensePaymentId the primary key of the cannabis license payment
	 * @return the cannabis license payment that was removed
	 * @throws NoSuchCannabisLicensePaymentException if a cannabis license payment with the primary key could not be found
	 */
	@Override
	public CannabisLicensePayment remove(long cannabisLicensePaymentId)
		throws NoSuchCannabisLicensePaymentException {

		return remove((Serializable)cannabisLicensePaymentId);
	}

	/**
	 * Removes the cannabis license payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis license payment
	 * @return the cannabis license payment that was removed
	 * @throws NoSuchCannabisLicensePaymentException if a cannabis license payment with the primary key could not be found
	 */
	@Override
	public CannabisLicensePayment remove(Serializable primaryKey)
		throws NoSuchCannabisLicensePaymentException {

		Session session = null;

		try {
			session = openSession();

			CannabisLicensePayment cannabisLicensePayment =
				(CannabisLicensePayment)session.get(
					CannabisLicensePaymentImpl.class, primaryKey);

			if (cannabisLicensePayment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisLicensePaymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisLicensePayment);
		}
		catch (NoSuchCannabisLicensePaymentException noSuchEntityException) {
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
	protected CannabisLicensePayment removeImpl(
		CannabisLicensePayment cannabisLicensePayment) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisLicensePayment)) {
				cannabisLicensePayment = (CannabisLicensePayment)session.get(
					CannabisLicensePaymentImpl.class,
					cannabisLicensePayment.getPrimaryKeyObj());
			}

			if (cannabisLicensePayment != null) {
				session.delete(cannabisLicensePayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisLicensePayment != null) {
			clearCache(cannabisLicensePayment);
		}

		return cannabisLicensePayment;
	}

	@Override
	public CannabisLicensePayment updateImpl(
		CannabisLicensePayment cannabisLicensePayment) {

		boolean isNew = cannabisLicensePayment.isNew();

		if (!(cannabisLicensePayment instanceof
				CannabisLicensePaymentModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cannabisLicensePayment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisLicensePayment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisLicensePayment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisLicensePayment implementation " +
					cannabisLicensePayment.getClass());
		}

		CannabisLicensePaymentModelImpl cannabisLicensePaymentModelImpl =
			(CannabisLicensePaymentModelImpl)cannabisLicensePayment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (cannabisLicensePayment.getCreateDate() == null)) {
			if (serviceContext == null) {
				cannabisLicensePayment.setCreateDate(date);
			}
			else {
				cannabisLicensePayment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisLicensePaymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisLicensePayment.setModifiedDate(date);
			}
			else {
				cannabisLicensePayment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisLicensePayment);
			}
			else {
				cannabisLicensePayment = (CannabisLicensePayment)session.merge(
					cannabisLicensePayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisLicensePaymentImpl.class, cannabisLicensePaymentModelImpl,
			false, true);

		cacheUniqueFindersCache(cannabisLicensePaymentModelImpl);

		if (isNew) {
			cannabisLicensePayment.setNew(false);
		}

		cannabisLicensePayment.resetOriginalValues();

		return cannabisLicensePayment;
	}

	/**
	 * Returns the cannabis license payment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis license payment
	 * @return the cannabis license payment
	 * @throws NoSuchCannabisLicensePaymentException if a cannabis license payment with the primary key could not be found
	 */
	@Override
	public CannabisLicensePayment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCannabisLicensePaymentException {

		CannabisLicensePayment cannabisLicensePayment = fetchByPrimaryKey(
			primaryKey);

		if (cannabisLicensePayment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisLicensePaymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisLicensePayment;
	}

	/**
	 * Returns the cannabis license payment with the primary key or throws a <code>NoSuchCannabisLicensePaymentException</code> if it could not be found.
	 *
	 * @param cannabisLicensePaymentId the primary key of the cannabis license payment
	 * @return the cannabis license payment
	 * @throws NoSuchCannabisLicensePaymentException if a cannabis license payment with the primary key could not be found
	 */
	@Override
	public CannabisLicensePayment findByPrimaryKey(
			long cannabisLicensePaymentId)
		throws NoSuchCannabisLicensePaymentException {

		return findByPrimaryKey((Serializable)cannabisLicensePaymentId);
	}

	/**
	 * Returns the cannabis license payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisLicensePaymentId the primary key of the cannabis license payment
	 * @return the cannabis license payment, or <code>null</code> if a cannabis license payment with the primary key could not be found
	 */
	@Override
	public CannabisLicensePayment fetchByPrimaryKey(
		long cannabisLicensePaymentId) {

		return fetchByPrimaryKey((Serializable)cannabisLicensePaymentId);
	}

	/**
	 * Returns all the cannabis license payments.
	 *
	 * @return the cannabis license payments
	 */
	@Override
	public List<CannabisLicensePayment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis license payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis license payments
	 * @param end the upper bound of the range of cannabis license payments (not inclusive)
	 * @return the range of cannabis license payments
	 */
	@Override
	public List<CannabisLicensePayment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis license payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis license payments
	 * @param end the upper bound of the range of cannabis license payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis license payments
	 */
	@Override
	public List<CannabisLicensePayment> findAll(
		int start, int end,
		OrderByComparator<CannabisLicensePayment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis license payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis license payments
	 * @param end the upper bound of the range of cannabis license payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis license payments
	 */
	@Override
	public List<CannabisLicensePayment> findAll(
		int start, int end,
		OrderByComparator<CannabisLicensePayment> orderByComparator,
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

		List<CannabisLicensePayment> list = null;

		if (useFinderCache) {
			list = (List<CannabisLicensePayment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISLICENSEPAYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISLICENSEPAYMENT;

				sql = sql.concat(CannabisLicensePaymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisLicensePayment>)QueryUtil.list(
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
	 * Removes all the cannabis license payments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisLicensePayment cannabisLicensePayment : findAll()) {
			remove(cannabisLicensePayment);
		}
	}

	/**
	 * Returns the number of cannabis license payments.
	 *
	 * @return the number of cannabis license payments
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
					_SQL_COUNT_CANNABISLICENSEPAYMENT);

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
		return "cannabisLicensePaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISLICENSEPAYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisLicensePaymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis license payment persistence.
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

		_finderPathFetchBygetCLP_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCLP_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetCLP_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCLP_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		_finderPathFetchBygetCADD_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCADD_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetCADD_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCADD_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		CannabisLicensePaymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisLicensePaymentUtil.setPersistence(null);

		entityCache.removeCache(CannabisLicensePaymentImpl.class.getName());
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CANNABISLICENSEPAYMENT =
		"SELECT cannabisLicensePayment FROM CannabisLicensePayment cannabisLicensePayment";

	private static final String _SQL_SELECT_CANNABISLICENSEPAYMENT_WHERE =
		"SELECT cannabisLicensePayment FROM CannabisLicensePayment cannabisLicensePayment WHERE ";

	private static final String _SQL_COUNT_CANNABISLICENSEPAYMENT =
		"SELECT COUNT(cannabisLicensePayment) FROM CannabisLicensePayment cannabisLicensePayment";

	private static final String _SQL_COUNT_CANNABISLICENSEPAYMENT_WHERE =
		"SELECT COUNT(cannabisLicensePayment) FROM CannabisLicensePayment cannabisLicensePayment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisLicensePayment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisLicensePayment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisLicensePayment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisLicensePaymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}