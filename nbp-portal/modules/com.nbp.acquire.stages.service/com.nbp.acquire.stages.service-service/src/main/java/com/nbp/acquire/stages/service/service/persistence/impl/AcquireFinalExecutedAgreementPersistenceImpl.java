/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence.impl;

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

import com.nbp.acquire.stages.service.exception.NoSuchAcquireFinalExecutedAgreementException;
import com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement;
import com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreementTable;
import com.nbp.acquire.stages.service.model.impl.AcquireFinalExecutedAgreementImpl;
import com.nbp.acquire.stages.service.model.impl.AcquireFinalExecutedAgreementModelImpl;
import com.nbp.acquire.stages.service.service.persistence.AcquireFinalExecutedAgreementPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireFinalExecutedAgreementUtil;
import com.nbp.acquire.stages.service.service.persistence.impl.constants.NBP_ACQUIREPersistenceConstants;

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
 * The persistence implementation for the acquire final executed agreement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcquireFinalExecutedAgreementPersistence.class)
public class AcquireFinalExecutedAgreementPersistenceImpl
	extends BasePersistenceImpl<AcquireFinalExecutedAgreement>
	implements AcquireFinalExecutedAgreementPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcquireFinalExecutedAgreementUtil</code> to access the acquire final executed agreement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcquireFinalExecutedAgreementImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetAcquire_FEA_By_CI;
	private FinderPath _finderPathCountBygetAcquire_FEA_By_CI;

	/**
	 * Returns the acquire final executed agreement where caseId = &#63; or throws a <code>NoSuchAcquireFinalExecutedAgreementException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire final executed agreement
	 * @throws NoSuchAcquireFinalExecutedAgreementException if a matching acquire final executed agreement could not be found
	 */
	@Override
	public AcquireFinalExecutedAgreement findBygetAcquire_FEA_By_CI(
			String caseId)
		throws NoSuchAcquireFinalExecutedAgreementException {

		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement =
			fetchBygetAcquire_FEA_By_CI(caseId);

		if (acquireFinalExecutedAgreement == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireFinalExecutedAgreementException(
				sb.toString());
		}

		return acquireFinalExecutedAgreement;
	}

	/**
	 * Returns the acquire final executed agreement where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire final executed agreement, or <code>null</code> if a matching acquire final executed agreement could not be found
	 */
	@Override
	public AcquireFinalExecutedAgreement fetchBygetAcquire_FEA_By_CI(
		String caseId) {

		return fetchBygetAcquire_FEA_By_CI(caseId, true);
	}

	/**
	 * Returns the acquire final executed agreement where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire final executed agreement, or <code>null</code> if a matching acquire final executed agreement could not be found
	 */
	@Override
	public AcquireFinalExecutedAgreement fetchBygetAcquire_FEA_By_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquire_FEA_By_CI, finderArgs, this);
		}

		if (result instanceof AcquireFinalExecutedAgreement) {
			AcquireFinalExecutedAgreement acquireFinalExecutedAgreement =
				(AcquireFinalExecutedAgreement)result;

			if (!Objects.equals(
					caseId, acquireFinalExecutedAgreement.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIREFINALEXECUTEDAGREEMENT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETACQUIRE_FEA_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETACQUIRE_FEA_BY_CI_CASEID_2);
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

				List<AcquireFinalExecutedAgreement> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquire_FEA_By_CI, finderArgs,
							list);
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
								"AcquireFinalExecutedAgreementPersistenceImpl.fetchBygetAcquire_FEA_By_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireFinalExecutedAgreement
						acquireFinalExecutedAgreement = list.get(0);

					result = acquireFinalExecutedAgreement;

					cacheResult(acquireFinalExecutedAgreement);
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
			return (AcquireFinalExecutedAgreement)result;
		}
	}

	/**
	 * Removes the acquire final executed agreement where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire final executed agreement that was removed
	 */
	@Override
	public AcquireFinalExecutedAgreement removeBygetAcquire_FEA_By_CI(
			String caseId)
		throws NoSuchAcquireFinalExecutedAgreementException {

		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement =
			findBygetAcquire_FEA_By_CI(caseId);

		return remove(acquireFinalExecutedAgreement);
	}

	/**
	 * Returns the number of acquire final executed agreements where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire final executed agreements
	 */
	@Override
	public int countBygetAcquire_FEA_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetAcquire_FEA_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREFINALEXECUTEDAGREEMENT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETACQUIRE_FEA_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETACQUIRE_FEA_BY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETACQUIRE_FEA_BY_CI_CASEID_2 =
		"acquireFinalExecutedAgreement.caseId = ?";

	private static final String _FINDER_COLUMN_GETACQUIRE_FEA_BY_CI_CASEID_3 =
		"(acquireFinalExecutedAgreement.caseId IS NULL OR acquireFinalExecutedAgreement.caseId = '')";

	public AcquireFinalExecutedAgreementPersistenceImpl() {
		setModelClass(AcquireFinalExecutedAgreement.class);

		setModelImplClass(AcquireFinalExecutedAgreementImpl.class);
		setModelPKClass(long.class);

		setTable(AcquireFinalExecutedAgreementTable.INSTANCE);
	}

	/**
	 * Caches the acquire final executed agreement in the entity cache if it is enabled.
	 *
	 * @param acquireFinalExecutedAgreement the acquire final executed agreement
	 */
	@Override
	public void cacheResult(
		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement) {

		entityCache.putResult(
			AcquireFinalExecutedAgreementImpl.class,
			acquireFinalExecutedAgreement.getPrimaryKey(),
			acquireFinalExecutedAgreement);

		finderCache.putResult(
			_finderPathFetchBygetAcquire_FEA_By_CI,
			new Object[] {acquireFinalExecutedAgreement.getCaseId()},
			acquireFinalExecutedAgreement);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acquire final executed agreements in the entity cache if it is enabled.
	 *
	 * @param acquireFinalExecutedAgreements the acquire final executed agreements
	 */
	@Override
	public void cacheResult(
		List<AcquireFinalExecutedAgreement> acquireFinalExecutedAgreements) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acquireFinalExecutedAgreements.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcquireFinalExecutedAgreement acquireFinalExecutedAgreement :
				acquireFinalExecutedAgreements) {

			if (entityCache.getResult(
					AcquireFinalExecutedAgreementImpl.class,
					acquireFinalExecutedAgreement.getPrimaryKey()) == null) {

				cacheResult(acquireFinalExecutedAgreement);
			}
		}
	}

	/**
	 * Clears the cache for all acquire final executed agreements.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcquireFinalExecutedAgreementImpl.class);

		finderCache.clearCache(AcquireFinalExecutedAgreementImpl.class);
	}

	/**
	 * Clears the cache for the acquire final executed agreement.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement) {

		entityCache.removeResult(
			AcquireFinalExecutedAgreementImpl.class,
			acquireFinalExecutedAgreement);
	}

	@Override
	public void clearCache(
		List<AcquireFinalExecutedAgreement> acquireFinalExecutedAgreements) {

		for (AcquireFinalExecutedAgreement acquireFinalExecutedAgreement :
				acquireFinalExecutedAgreements) {

			entityCache.removeResult(
				AcquireFinalExecutedAgreementImpl.class,
				acquireFinalExecutedAgreement);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcquireFinalExecutedAgreementImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AcquireFinalExecutedAgreementImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AcquireFinalExecutedAgreementModelImpl
			acquireFinalExecutedAgreementModelImpl) {

		Object[] args = new Object[] {
			acquireFinalExecutedAgreementModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetAcquire_FEA_By_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquire_FEA_By_CI, args,
			acquireFinalExecutedAgreementModelImpl);
	}

	/**
	 * Creates a new acquire final executed agreement with the primary key. Does not add the acquire final executed agreement to the database.
	 *
	 * @param acquirefinalId the primary key for the new acquire final executed agreement
	 * @return the new acquire final executed agreement
	 */
	@Override
	public AcquireFinalExecutedAgreement create(long acquirefinalId) {
		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement =
			new AcquireFinalExecutedAgreementImpl();

		acquireFinalExecutedAgreement.setNew(true);
		acquireFinalExecutedAgreement.setPrimaryKey(acquirefinalId);

		acquireFinalExecutedAgreement.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return acquireFinalExecutedAgreement;
	}

	/**
	 * Removes the acquire final executed agreement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquirefinalId the primary key of the acquire final executed agreement
	 * @return the acquire final executed agreement that was removed
	 * @throws NoSuchAcquireFinalExecutedAgreementException if a acquire final executed agreement with the primary key could not be found
	 */
	@Override
	public AcquireFinalExecutedAgreement remove(long acquirefinalId)
		throws NoSuchAcquireFinalExecutedAgreementException {

		return remove((Serializable)acquirefinalId);
	}

	/**
	 * Removes the acquire final executed agreement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acquire final executed agreement
	 * @return the acquire final executed agreement that was removed
	 * @throws NoSuchAcquireFinalExecutedAgreementException if a acquire final executed agreement with the primary key could not be found
	 */
	@Override
	public AcquireFinalExecutedAgreement remove(Serializable primaryKey)
		throws NoSuchAcquireFinalExecutedAgreementException {

		Session session = null;

		try {
			session = openSession();

			AcquireFinalExecutedAgreement acquireFinalExecutedAgreement =
				(AcquireFinalExecutedAgreement)session.get(
					AcquireFinalExecutedAgreementImpl.class, primaryKey);

			if (acquireFinalExecutedAgreement == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcquireFinalExecutedAgreementException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acquireFinalExecutedAgreement);
		}
		catch (NoSuchAcquireFinalExecutedAgreementException
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
	protected AcquireFinalExecutedAgreement removeImpl(
		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acquireFinalExecutedAgreement)) {
				acquireFinalExecutedAgreement =
					(AcquireFinalExecutedAgreement)session.get(
						AcquireFinalExecutedAgreementImpl.class,
						acquireFinalExecutedAgreement.getPrimaryKeyObj());
			}

			if (acquireFinalExecutedAgreement != null) {
				session.delete(acquireFinalExecutedAgreement);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acquireFinalExecutedAgreement != null) {
			clearCache(acquireFinalExecutedAgreement);
		}

		return acquireFinalExecutedAgreement;
	}

	@Override
	public AcquireFinalExecutedAgreement updateImpl(
		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement) {

		boolean isNew = acquireFinalExecutedAgreement.isNew();

		if (!(acquireFinalExecutedAgreement instanceof
				AcquireFinalExecutedAgreementModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					acquireFinalExecutedAgreement.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					acquireFinalExecutedAgreement);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acquireFinalExecutedAgreement proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcquireFinalExecutedAgreement implementation " +
					acquireFinalExecutedAgreement.getClass());
		}

		AcquireFinalExecutedAgreementModelImpl
			acquireFinalExecutedAgreementModelImpl =
				(AcquireFinalExecutedAgreementModelImpl)
					acquireFinalExecutedAgreement;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (acquireFinalExecutedAgreement.getCreateDate() == null)) {
			if (serviceContext == null) {
				acquireFinalExecutedAgreement.setCreateDate(date);
			}
			else {
				acquireFinalExecutedAgreement.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!acquireFinalExecutedAgreementModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				acquireFinalExecutedAgreement.setModifiedDate(date);
			}
			else {
				acquireFinalExecutedAgreement.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acquireFinalExecutedAgreement);
			}
			else {
				acquireFinalExecutedAgreement =
					(AcquireFinalExecutedAgreement)session.merge(
						acquireFinalExecutedAgreement);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcquireFinalExecutedAgreementImpl.class,
			acquireFinalExecutedAgreementModelImpl, false, true);

		cacheUniqueFindersCache(acquireFinalExecutedAgreementModelImpl);

		if (isNew) {
			acquireFinalExecutedAgreement.setNew(false);
		}

		acquireFinalExecutedAgreement.resetOriginalValues();

		return acquireFinalExecutedAgreement;
	}

	/**
	 * Returns the acquire final executed agreement with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acquire final executed agreement
	 * @return the acquire final executed agreement
	 * @throws NoSuchAcquireFinalExecutedAgreementException if a acquire final executed agreement with the primary key could not be found
	 */
	@Override
	public AcquireFinalExecutedAgreement findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchAcquireFinalExecutedAgreementException {

		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement =
			fetchByPrimaryKey(primaryKey);

		if (acquireFinalExecutedAgreement == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcquireFinalExecutedAgreementException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acquireFinalExecutedAgreement;
	}

	/**
	 * Returns the acquire final executed agreement with the primary key or throws a <code>NoSuchAcquireFinalExecutedAgreementException</code> if it could not be found.
	 *
	 * @param acquirefinalId the primary key of the acquire final executed agreement
	 * @return the acquire final executed agreement
	 * @throws NoSuchAcquireFinalExecutedAgreementException if a acquire final executed agreement with the primary key could not be found
	 */
	@Override
	public AcquireFinalExecutedAgreement findByPrimaryKey(long acquirefinalId)
		throws NoSuchAcquireFinalExecutedAgreementException {

		return findByPrimaryKey((Serializable)acquirefinalId);
	}

	/**
	 * Returns the acquire final executed agreement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquirefinalId the primary key of the acquire final executed agreement
	 * @return the acquire final executed agreement, or <code>null</code> if a acquire final executed agreement with the primary key could not be found
	 */
	@Override
	public AcquireFinalExecutedAgreement fetchByPrimaryKey(
		long acquirefinalId) {

		return fetchByPrimaryKey((Serializable)acquirefinalId);
	}

	/**
	 * Returns all the acquire final executed agreements.
	 *
	 * @return the acquire final executed agreements
	 */
	@Override
	public List<AcquireFinalExecutedAgreement> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire final executed agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireFinalExecutedAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire final executed agreements
	 * @param end the upper bound of the range of acquire final executed agreements (not inclusive)
	 * @return the range of acquire final executed agreements
	 */
	@Override
	public List<AcquireFinalExecutedAgreement> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire final executed agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireFinalExecutedAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire final executed agreements
	 * @param end the upper bound of the range of acquire final executed agreements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire final executed agreements
	 */
	@Override
	public List<AcquireFinalExecutedAgreement> findAll(
		int start, int end,
		OrderByComparator<AcquireFinalExecutedAgreement> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire final executed agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireFinalExecutedAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire final executed agreements
	 * @param end the upper bound of the range of acquire final executed agreements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire final executed agreements
	 */
	@Override
	public List<AcquireFinalExecutedAgreement> findAll(
		int start, int end,
		OrderByComparator<AcquireFinalExecutedAgreement> orderByComparator,
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

		List<AcquireFinalExecutedAgreement> list = null;

		if (useFinderCache) {
			list = (List<AcquireFinalExecutedAgreement>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACQUIREFINALEXECUTEDAGREEMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACQUIREFINALEXECUTEDAGREEMENT;

				sql = sql.concat(
					AcquireFinalExecutedAgreementModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcquireFinalExecutedAgreement>)QueryUtil.list(
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
	 * Removes all the acquire final executed agreements from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcquireFinalExecutedAgreement acquireFinalExecutedAgreement :
				findAll()) {

			remove(acquireFinalExecutedAgreement);
		}
	}

	/**
	 * Returns the number of acquire final executed agreements.
	 *
	 * @return the number of acquire final executed agreements
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
					_SQL_COUNT_ACQUIREFINALEXECUTEDAGREEMENT);

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
		return "acquirefinalId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACQUIREFINALEXECUTEDAGREEMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcquireFinalExecutedAgreementModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acquire final executed agreement persistence.
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

		_finderPathFetchBygetAcquire_FEA_By_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAcquire_FEA_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetAcquire_FEA_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAcquire_FEA_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		AcquireFinalExecutedAgreementUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcquireFinalExecutedAgreementUtil.setPersistence(null);

		entityCache.removeCache(
			AcquireFinalExecutedAgreementImpl.class.getName());
	}

	@Override
	@Reference(
		target = NBP_ACQUIREPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NBP_ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NBP_ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ACQUIREFINALEXECUTEDAGREEMENT =
		"SELECT acquireFinalExecutedAgreement FROM AcquireFinalExecutedAgreement acquireFinalExecutedAgreement";

	private static final String
		_SQL_SELECT_ACQUIREFINALEXECUTEDAGREEMENT_WHERE =
			"SELECT acquireFinalExecutedAgreement FROM AcquireFinalExecutedAgreement acquireFinalExecutedAgreement WHERE ";

	private static final String _SQL_COUNT_ACQUIREFINALEXECUTEDAGREEMENT =
		"SELECT COUNT(acquireFinalExecutedAgreement) FROM AcquireFinalExecutedAgreement acquireFinalExecutedAgreement";

	private static final String _SQL_COUNT_ACQUIREFINALEXECUTEDAGREEMENT_WHERE =
		"SELECT COUNT(acquireFinalExecutedAgreement) FROM AcquireFinalExecutedAgreement acquireFinalExecutedAgreement WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"acquireFinalExecutedAgreement.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcquireFinalExecutedAgreement exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcquireFinalExecutedAgreement exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcquireFinalExecutedAgreementPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}