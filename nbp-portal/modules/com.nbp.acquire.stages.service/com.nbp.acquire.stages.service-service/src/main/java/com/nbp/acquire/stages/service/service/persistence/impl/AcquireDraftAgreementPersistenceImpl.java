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

import com.nbp.acquire.stages.service.exception.NoSuchAcquireDraftAgreementException;
import com.nbp.acquire.stages.service.model.AcquireDraftAgreement;
import com.nbp.acquire.stages.service.model.AcquireDraftAgreementTable;
import com.nbp.acquire.stages.service.model.impl.AcquireDraftAgreementImpl;
import com.nbp.acquire.stages.service.model.impl.AcquireDraftAgreementModelImpl;
import com.nbp.acquire.stages.service.service.persistence.AcquireDraftAgreementPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireDraftAgreementUtil;
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
 * The persistence implementation for the acquire draft agreement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcquireDraftAgreementPersistence.class)
public class AcquireDraftAgreementPersistenceImpl
	extends BasePersistenceImpl<AcquireDraftAgreement>
	implements AcquireDraftAgreementPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcquireDraftAgreementUtil</code> to access the acquire draft agreement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcquireDraftAgreementImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetAcquire_DA_By_CI;
	private FinderPath _finderPathCountBygetAcquire_DA_By_CI;

	/**
	 * Returns the acquire draft agreement where caseId = &#63; or throws a <code>NoSuchAcquireDraftAgreementException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire draft agreement
	 * @throws NoSuchAcquireDraftAgreementException if a matching acquire draft agreement could not be found
	 */
	@Override
	public AcquireDraftAgreement findBygetAcquire_DA_By_CI(String caseId)
		throws NoSuchAcquireDraftAgreementException {

		AcquireDraftAgreement acquireDraftAgreement =
			fetchBygetAcquire_DA_By_CI(caseId);

		if (acquireDraftAgreement == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireDraftAgreementException(sb.toString());
		}

		return acquireDraftAgreement;
	}

	/**
	 * Returns the acquire draft agreement where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire draft agreement, or <code>null</code> if a matching acquire draft agreement could not be found
	 */
	@Override
	public AcquireDraftAgreement fetchBygetAcquire_DA_By_CI(String caseId) {
		return fetchBygetAcquire_DA_By_CI(caseId, true);
	}

	/**
	 * Returns the acquire draft agreement where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire draft agreement, or <code>null</code> if a matching acquire draft agreement could not be found
	 */
	@Override
	public AcquireDraftAgreement fetchBygetAcquire_DA_By_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquire_DA_By_CI, finderArgs, this);
		}

		if (result instanceof AcquireDraftAgreement) {
			AcquireDraftAgreement acquireDraftAgreement =
				(AcquireDraftAgreement)result;

			if (!Objects.equals(caseId, acquireDraftAgreement.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIREDRAFTAGREEMENT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETACQUIRE_DA_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETACQUIRE_DA_BY_CI_CASEID_2);
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

				List<AcquireDraftAgreement> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquire_DA_By_CI, finderArgs,
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
								"AcquireDraftAgreementPersistenceImpl.fetchBygetAcquire_DA_By_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireDraftAgreement acquireDraftAgreement = list.get(0);

					result = acquireDraftAgreement;

					cacheResult(acquireDraftAgreement);
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
			return (AcquireDraftAgreement)result;
		}
	}

	/**
	 * Removes the acquire draft agreement where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire draft agreement that was removed
	 */
	@Override
	public AcquireDraftAgreement removeBygetAcquire_DA_By_CI(String caseId)
		throws NoSuchAcquireDraftAgreementException {

		AcquireDraftAgreement acquireDraftAgreement = findBygetAcquire_DA_By_CI(
			caseId);

		return remove(acquireDraftAgreement);
	}

	/**
	 * Returns the number of acquire draft agreements where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire draft agreements
	 */
	@Override
	public int countBygetAcquire_DA_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetAcquire_DA_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREDRAFTAGREEMENT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETACQUIRE_DA_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETACQUIRE_DA_BY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETACQUIRE_DA_BY_CI_CASEID_2 =
		"acquireDraftAgreement.caseId = ?";

	private static final String _FINDER_COLUMN_GETACQUIRE_DA_BY_CI_CASEID_3 =
		"(acquireDraftAgreement.caseId IS NULL OR acquireDraftAgreement.caseId = '')";

	public AcquireDraftAgreementPersistenceImpl() {
		setModelClass(AcquireDraftAgreement.class);

		setModelImplClass(AcquireDraftAgreementImpl.class);
		setModelPKClass(long.class);

		setTable(AcquireDraftAgreementTable.INSTANCE);
	}

	/**
	 * Caches the acquire draft agreement in the entity cache if it is enabled.
	 *
	 * @param acquireDraftAgreement the acquire draft agreement
	 */
	@Override
	public void cacheResult(AcquireDraftAgreement acquireDraftAgreement) {
		entityCache.putResult(
			AcquireDraftAgreementImpl.class,
			acquireDraftAgreement.getPrimaryKey(), acquireDraftAgreement);

		finderCache.putResult(
			_finderPathFetchBygetAcquire_DA_By_CI,
			new Object[] {acquireDraftAgreement.getCaseId()},
			acquireDraftAgreement);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acquire draft agreements in the entity cache if it is enabled.
	 *
	 * @param acquireDraftAgreements the acquire draft agreements
	 */
	@Override
	public void cacheResult(
		List<AcquireDraftAgreement> acquireDraftAgreements) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acquireDraftAgreements.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcquireDraftAgreement acquireDraftAgreement :
				acquireDraftAgreements) {

			if (entityCache.getResult(
					AcquireDraftAgreementImpl.class,
					acquireDraftAgreement.getPrimaryKey()) == null) {

				cacheResult(acquireDraftAgreement);
			}
		}
	}

	/**
	 * Clears the cache for all acquire draft agreements.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcquireDraftAgreementImpl.class);

		finderCache.clearCache(AcquireDraftAgreementImpl.class);
	}

	/**
	 * Clears the cache for the acquire draft agreement.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AcquireDraftAgreement acquireDraftAgreement) {
		entityCache.removeResult(
			AcquireDraftAgreementImpl.class, acquireDraftAgreement);
	}

	@Override
	public void clearCache(List<AcquireDraftAgreement> acquireDraftAgreements) {
		for (AcquireDraftAgreement acquireDraftAgreement :
				acquireDraftAgreements) {

			entityCache.removeResult(
				AcquireDraftAgreementImpl.class, acquireDraftAgreement);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcquireDraftAgreementImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AcquireDraftAgreementImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AcquireDraftAgreementModelImpl acquireDraftAgreementModelImpl) {

		Object[] args = new Object[] {
			acquireDraftAgreementModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetAcquire_DA_By_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquire_DA_By_CI, args,
			acquireDraftAgreementModelImpl);
	}

	/**
	 * Creates a new acquire draft agreement with the primary key. Does not add the acquire draft agreement to the database.
	 *
	 * @param acquireDraftId the primary key for the new acquire draft agreement
	 * @return the new acquire draft agreement
	 */
	@Override
	public AcquireDraftAgreement create(long acquireDraftId) {
		AcquireDraftAgreement acquireDraftAgreement =
			new AcquireDraftAgreementImpl();

		acquireDraftAgreement.setNew(true);
		acquireDraftAgreement.setPrimaryKey(acquireDraftId);

		acquireDraftAgreement.setCompanyId(CompanyThreadLocal.getCompanyId());

		return acquireDraftAgreement;
	}

	/**
	 * Removes the acquire draft agreement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireDraftId the primary key of the acquire draft agreement
	 * @return the acquire draft agreement that was removed
	 * @throws NoSuchAcquireDraftAgreementException if a acquire draft agreement with the primary key could not be found
	 */
	@Override
	public AcquireDraftAgreement remove(long acquireDraftId)
		throws NoSuchAcquireDraftAgreementException {

		return remove((Serializable)acquireDraftId);
	}

	/**
	 * Removes the acquire draft agreement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acquire draft agreement
	 * @return the acquire draft agreement that was removed
	 * @throws NoSuchAcquireDraftAgreementException if a acquire draft agreement with the primary key could not be found
	 */
	@Override
	public AcquireDraftAgreement remove(Serializable primaryKey)
		throws NoSuchAcquireDraftAgreementException {

		Session session = null;

		try {
			session = openSession();

			AcquireDraftAgreement acquireDraftAgreement =
				(AcquireDraftAgreement)session.get(
					AcquireDraftAgreementImpl.class, primaryKey);

			if (acquireDraftAgreement == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcquireDraftAgreementException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acquireDraftAgreement);
		}
		catch (NoSuchAcquireDraftAgreementException noSuchEntityException) {
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
	protected AcquireDraftAgreement removeImpl(
		AcquireDraftAgreement acquireDraftAgreement) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acquireDraftAgreement)) {
				acquireDraftAgreement = (AcquireDraftAgreement)session.get(
					AcquireDraftAgreementImpl.class,
					acquireDraftAgreement.getPrimaryKeyObj());
			}

			if (acquireDraftAgreement != null) {
				session.delete(acquireDraftAgreement);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acquireDraftAgreement != null) {
			clearCache(acquireDraftAgreement);
		}

		return acquireDraftAgreement;
	}

	@Override
	public AcquireDraftAgreement updateImpl(
		AcquireDraftAgreement acquireDraftAgreement) {

		boolean isNew = acquireDraftAgreement.isNew();

		if (!(acquireDraftAgreement instanceof
				AcquireDraftAgreementModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(acquireDraftAgreement.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					acquireDraftAgreement);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acquireDraftAgreement proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcquireDraftAgreement implementation " +
					acquireDraftAgreement.getClass());
		}

		AcquireDraftAgreementModelImpl acquireDraftAgreementModelImpl =
			(AcquireDraftAgreementModelImpl)acquireDraftAgreement;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (acquireDraftAgreement.getCreateDate() == null)) {
			if (serviceContext == null) {
				acquireDraftAgreement.setCreateDate(date);
			}
			else {
				acquireDraftAgreement.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!acquireDraftAgreementModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				acquireDraftAgreement.setModifiedDate(date);
			}
			else {
				acquireDraftAgreement.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acquireDraftAgreement);
			}
			else {
				acquireDraftAgreement = (AcquireDraftAgreement)session.merge(
					acquireDraftAgreement);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcquireDraftAgreementImpl.class, acquireDraftAgreementModelImpl,
			false, true);

		cacheUniqueFindersCache(acquireDraftAgreementModelImpl);

		if (isNew) {
			acquireDraftAgreement.setNew(false);
		}

		acquireDraftAgreement.resetOriginalValues();

		return acquireDraftAgreement;
	}

	/**
	 * Returns the acquire draft agreement with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acquire draft agreement
	 * @return the acquire draft agreement
	 * @throws NoSuchAcquireDraftAgreementException if a acquire draft agreement with the primary key could not be found
	 */
	@Override
	public AcquireDraftAgreement findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcquireDraftAgreementException {

		AcquireDraftAgreement acquireDraftAgreement = fetchByPrimaryKey(
			primaryKey);

		if (acquireDraftAgreement == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcquireDraftAgreementException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acquireDraftAgreement;
	}

	/**
	 * Returns the acquire draft agreement with the primary key or throws a <code>NoSuchAcquireDraftAgreementException</code> if it could not be found.
	 *
	 * @param acquireDraftId the primary key of the acquire draft agreement
	 * @return the acquire draft agreement
	 * @throws NoSuchAcquireDraftAgreementException if a acquire draft agreement with the primary key could not be found
	 */
	@Override
	public AcquireDraftAgreement findByPrimaryKey(long acquireDraftId)
		throws NoSuchAcquireDraftAgreementException {

		return findByPrimaryKey((Serializable)acquireDraftId);
	}

	/**
	 * Returns the acquire draft agreement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireDraftId the primary key of the acquire draft agreement
	 * @return the acquire draft agreement, or <code>null</code> if a acquire draft agreement with the primary key could not be found
	 */
	@Override
	public AcquireDraftAgreement fetchByPrimaryKey(long acquireDraftId) {
		return fetchByPrimaryKey((Serializable)acquireDraftId);
	}

	/**
	 * Returns all the acquire draft agreements.
	 *
	 * @return the acquire draft agreements
	 */
	@Override
	public List<AcquireDraftAgreement> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire draft agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDraftAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire draft agreements
	 * @param end the upper bound of the range of acquire draft agreements (not inclusive)
	 * @return the range of acquire draft agreements
	 */
	@Override
	public List<AcquireDraftAgreement> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire draft agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDraftAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire draft agreements
	 * @param end the upper bound of the range of acquire draft agreements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire draft agreements
	 */
	@Override
	public List<AcquireDraftAgreement> findAll(
		int start, int end,
		OrderByComparator<AcquireDraftAgreement> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire draft agreements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDraftAgreementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire draft agreements
	 * @param end the upper bound of the range of acquire draft agreements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire draft agreements
	 */
	@Override
	public List<AcquireDraftAgreement> findAll(
		int start, int end,
		OrderByComparator<AcquireDraftAgreement> orderByComparator,
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

		List<AcquireDraftAgreement> list = null;

		if (useFinderCache) {
			list = (List<AcquireDraftAgreement>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACQUIREDRAFTAGREEMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACQUIREDRAFTAGREEMENT;

				sql = sql.concat(AcquireDraftAgreementModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcquireDraftAgreement>)QueryUtil.list(
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
	 * Removes all the acquire draft agreements from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcquireDraftAgreement acquireDraftAgreement : findAll()) {
			remove(acquireDraftAgreement);
		}
	}

	/**
	 * Returns the number of acquire draft agreements.
	 *
	 * @return the number of acquire draft agreements
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
					_SQL_COUNT_ACQUIREDRAFTAGREEMENT);

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
		return "acquireDraftId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACQUIREDRAFTAGREEMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcquireDraftAgreementModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acquire draft agreement persistence.
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

		_finderPathFetchBygetAcquire_DA_By_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAcquire_DA_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetAcquire_DA_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAcquire_DA_By_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		AcquireDraftAgreementUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcquireDraftAgreementUtil.setPersistence(null);

		entityCache.removeCache(AcquireDraftAgreementImpl.class.getName());
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

	private static final String _SQL_SELECT_ACQUIREDRAFTAGREEMENT =
		"SELECT acquireDraftAgreement FROM AcquireDraftAgreement acquireDraftAgreement";

	private static final String _SQL_SELECT_ACQUIREDRAFTAGREEMENT_WHERE =
		"SELECT acquireDraftAgreement FROM AcquireDraftAgreement acquireDraftAgreement WHERE ";

	private static final String _SQL_COUNT_ACQUIREDRAFTAGREEMENT =
		"SELECT COUNT(acquireDraftAgreement) FROM AcquireDraftAgreement acquireDraftAgreement";

	private static final String _SQL_COUNT_ACQUIREDRAFTAGREEMENT_WHERE =
		"SELECT COUNT(acquireDraftAgreement) FROM AcquireDraftAgreement acquireDraftAgreement WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"acquireDraftAgreement.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcquireDraftAgreement exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcquireDraftAgreement exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcquireDraftAgreementPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}