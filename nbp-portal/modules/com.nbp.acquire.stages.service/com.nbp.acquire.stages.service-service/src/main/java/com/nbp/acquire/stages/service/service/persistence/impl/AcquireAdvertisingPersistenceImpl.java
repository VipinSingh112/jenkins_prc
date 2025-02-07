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

import com.nbp.acquire.stages.service.exception.NoSuchAcquireAdvertisingException;
import com.nbp.acquire.stages.service.model.AcquireAdvertising;
import com.nbp.acquire.stages.service.model.AcquireAdvertisingTable;
import com.nbp.acquire.stages.service.model.impl.AcquireAdvertisingImpl;
import com.nbp.acquire.stages.service.model.impl.AcquireAdvertisingModelImpl;
import com.nbp.acquire.stages.service.service.persistence.AcquireAdvertisingPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireAdvertisingUtil;
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
 * The persistence implementation for the acquire advertising service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcquireAdvertisingPersistence.class)
public class AcquireAdvertisingPersistenceImpl
	extends BasePersistenceImpl<AcquireAdvertising>
	implements AcquireAdvertisingPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcquireAdvertisingUtil</code> to access the acquire advertising persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcquireAdvertisingImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetAcquireAdvertisingBy_CaseId;
	private FinderPath _finderPathCountBygetAcquireAdvertisingBy_CaseId;

	/**
	 * Returns the acquire advertising where caseId = &#63; or throws a <code>NoSuchAcquireAdvertisingException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire advertising
	 * @throws NoSuchAcquireAdvertisingException if a matching acquire advertising could not be found
	 */
	@Override
	public AcquireAdvertising findBygetAcquireAdvertisingBy_CaseId(
			String caseId)
		throws NoSuchAcquireAdvertisingException {

		AcquireAdvertising acquireAdvertising =
			fetchBygetAcquireAdvertisingBy_CaseId(caseId);

		if (acquireAdvertising == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireAdvertisingException(sb.toString());
		}

		return acquireAdvertising;
	}

	/**
	 * Returns the acquire advertising where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire advertising, or <code>null</code> if a matching acquire advertising could not be found
	 */
	@Override
	public AcquireAdvertising fetchBygetAcquireAdvertisingBy_CaseId(
		String caseId) {

		return fetchBygetAcquireAdvertisingBy_CaseId(caseId, true);
	}

	/**
	 * Returns the acquire advertising where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire advertising, or <code>null</code> if a matching acquire advertising could not be found
	 */
	@Override
	public AcquireAdvertising fetchBygetAcquireAdvertisingBy_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquireAdvertisingBy_CaseId, finderArgs,
				this);
		}

		if (result instanceof AcquireAdvertising) {
			AcquireAdvertising acquireAdvertising = (AcquireAdvertising)result;

			if (!Objects.equals(caseId, acquireAdvertising.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIREADVERTISING_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREADVERTISINGBY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREADVERTISINGBY_CASEID_CASEID_2);
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

				List<AcquireAdvertising> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquireAdvertisingBy_CaseId,
							finderArgs, list);
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
								"AcquireAdvertisingPersistenceImpl.fetchBygetAcquireAdvertisingBy_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireAdvertising acquireAdvertising = list.get(0);

					result = acquireAdvertising;

					cacheResult(acquireAdvertising);
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
			return (AcquireAdvertising)result;
		}
	}

	/**
	 * Removes the acquire advertising where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire advertising that was removed
	 */
	@Override
	public AcquireAdvertising removeBygetAcquireAdvertisingBy_CaseId(
			String caseId)
		throws NoSuchAcquireAdvertisingException {

		AcquireAdvertising acquireAdvertising =
			findBygetAcquireAdvertisingBy_CaseId(caseId);

		return remove(acquireAdvertising);
	}

	/**
	 * Returns the number of acquire advertisings where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire advertisings
	 */
	@Override
	public int countBygetAcquireAdvertisingBy_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath =
			_finderPathCountBygetAcquireAdvertisingBy_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREADVERTISING_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREADVERTISINGBY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREADVERTISINGBY_CASEID_CASEID_2);
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

	private static final String
		_FINDER_COLUMN_GETACQUIREADVERTISINGBY_CASEID_CASEID_2 =
			"acquireAdvertising.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETACQUIREADVERTISINGBY_CASEID_CASEID_3 =
			"(acquireAdvertising.caseId IS NULL OR acquireAdvertising.caseId = '')";

	public AcquireAdvertisingPersistenceImpl() {
		setModelClass(AcquireAdvertising.class);

		setModelImplClass(AcquireAdvertisingImpl.class);
		setModelPKClass(long.class);

		setTable(AcquireAdvertisingTable.INSTANCE);
	}

	/**
	 * Caches the acquire advertising in the entity cache if it is enabled.
	 *
	 * @param acquireAdvertising the acquire advertising
	 */
	@Override
	public void cacheResult(AcquireAdvertising acquireAdvertising) {
		entityCache.putResult(
			AcquireAdvertisingImpl.class, acquireAdvertising.getPrimaryKey(),
			acquireAdvertising);

		finderCache.putResult(
			_finderPathFetchBygetAcquireAdvertisingBy_CaseId,
			new Object[] {acquireAdvertising.getCaseId()}, acquireAdvertising);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acquire advertisings in the entity cache if it is enabled.
	 *
	 * @param acquireAdvertisings the acquire advertisings
	 */
	@Override
	public void cacheResult(List<AcquireAdvertising> acquireAdvertisings) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acquireAdvertisings.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcquireAdvertising acquireAdvertising : acquireAdvertisings) {
			if (entityCache.getResult(
					AcquireAdvertisingImpl.class,
					acquireAdvertising.getPrimaryKey()) == null) {

				cacheResult(acquireAdvertising);
			}
		}
	}

	/**
	 * Clears the cache for all acquire advertisings.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcquireAdvertisingImpl.class);

		finderCache.clearCache(AcquireAdvertisingImpl.class);
	}

	/**
	 * Clears the cache for the acquire advertising.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AcquireAdvertising acquireAdvertising) {
		entityCache.removeResult(
			AcquireAdvertisingImpl.class, acquireAdvertising);
	}

	@Override
	public void clearCache(List<AcquireAdvertising> acquireAdvertisings) {
		for (AcquireAdvertising acquireAdvertising : acquireAdvertisings) {
			entityCache.removeResult(
				AcquireAdvertisingImpl.class, acquireAdvertising);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcquireAdvertisingImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AcquireAdvertisingImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AcquireAdvertisingModelImpl acquireAdvertisingModelImpl) {

		Object[] args = new Object[] {acquireAdvertisingModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetAcquireAdvertisingBy_CaseId, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquireAdvertisingBy_CaseId, args,
			acquireAdvertisingModelImpl);
	}

	/**
	 * Creates a new acquire advertising with the primary key. Does not add the acquire advertising to the database.
	 *
	 * @param acquireAdvertisingId the primary key for the new acquire advertising
	 * @return the new acquire advertising
	 */
	@Override
	public AcquireAdvertising create(long acquireAdvertisingId) {
		AcquireAdvertising acquireAdvertising = new AcquireAdvertisingImpl();

		acquireAdvertising.setNew(true);
		acquireAdvertising.setPrimaryKey(acquireAdvertisingId);

		acquireAdvertising.setCompanyId(CompanyThreadLocal.getCompanyId());

		return acquireAdvertising;
	}

	/**
	 * Removes the acquire advertising with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireAdvertisingId the primary key of the acquire advertising
	 * @return the acquire advertising that was removed
	 * @throws NoSuchAcquireAdvertisingException if a acquire advertising with the primary key could not be found
	 */
	@Override
	public AcquireAdvertising remove(long acquireAdvertisingId)
		throws NoSuchAcquireAdvertisingException {

		return remove((Serializable)acquireAdvertisingId);
	}

	/**
	 * Removes the acquire advertising with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acquire advertising
	 * @return the acquire advertising that was removed
	 * @throws NoSuchAcquireAdvertisingException if a acquire advertising with the primary key could not be found
	 */
	@Override
	public AcquireAdvertising remove(Serializable primaryKey)
		throws NoSuchAcquireAdvertisingException {

		Session session = null;

		try {
			session = openSession();

			AcquireAdvertising acquireAdvertising =
				(AcquireAdvertising)session.get(
					AcquireAdvertisingImpl.class, primaryKey);

			if (acquireAdvertising == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcquireAdvertisingException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acquireAdvertising);
		}
		catch (NoSuchAcquireAdvertisingException noSuchEntityException) {
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
	protected AcquireAdvertising removeImpl(
		AcquireAdvertising acquireAdvertising) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acquireAdvertising)) {
				acquireAdvertising = (AcquireAdvertising)session.get(
					AcquireAdvertisingImpl.class,
					acquireAdvertising.getPrimaryKeyObj());
			}

			if (acquireAdvertising != null) {
				session.delete(acquireAdvertising);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acquireAdvertising != null) {
			clearCache(acquireAdvertising);
		}

		return acquireAdvertising;
	}

	@Override
	public AcquireAdvertising updateImpl(
		AcquireAdvertising acquireAdvertising) {

		boolean isNew = acquireAdvertising.isNew();

		if (!(acquireAdvertising instanceof AcquireAdvertisingModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(acquireAdvertising.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					acquireAdvertising);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acquireAdvertising proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcquireAdvertising implementation " +
					acquireAdvertising.getClass());
		}

		AcquireAdvertisingModelImpl acquireAdvertisingModelImpl =
			(AcquireAdvertisingModelImpl)acquireAdvertising;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (acquireAdvertising.getCreateDate() == null)) {
			if (serviceContext == null) {
				acquireAdvertising.setCreateDate(date);
			}
			else {
				acquireAdvertising.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!acquireAdvertisingModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				acquireAdvertising.setModifiedDate(date);
			}
			else {
				acquireAdvertising.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acquireAdvertising);
			}
			else {
				acquireAdvertising = (AcquireAdvertising)session.merge(
					acquireAdvertising);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcquireAdvertisingImpl.class, acquireAdvertisingModelImpl, false,
			true);

		cacheUniqueFindersCache(acquireAdvertisingModelImpl);

		if (isNew) {
			acquireAdvertising.setNew(false);
		}

		acquireAdvertising.resetOriginalValues();

		return acquireAdvertising;
	}

	/**
	 * Returns the acquire advertising with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acquire advertising
	 * @return the acquire advertising
	 * @throws NoSuchAcquireAdvertisingException if a acquire advertising with the primary key could not be found
	 */
	@Override
	public AcquireAdvertising findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcquireAdvertisingException {

		AcquireAdvertising acquireAdvertising = fetchByPrimaryKey(primaryKey);

		if (acquireAdvertising == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcquireAdvertisingException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acquireAdvertising;
	}

	/**
	 * Returns the acquire advertising with the primary key or throws a <code>NoSuchAcquireAdvertisingException</code> if it could not be found.
	 *
	 * @param acquireAdvertisingId the primary key of the acquire advertising
	 * @return the acquire advertising
	 * @throws NoSuchAcquireAdvertisingException if a acquire advertising with the primary key could not be found
	 */
	@Override
	public AcquireAdvertising findByPrimaryKey(long acquireAdvertisingId)
		throws NoSuchAcquireAdvertisingException {

		return findByPrimaryKey((Serializable)acquireAdvertisingId);
	}

	/**
	 * Returns the acquire advertising with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireAdvertisingId the primary key of the acquire advertising
	 * @return the acquire advertising, or <code>null</code> if a acquire advertising with the primary key could not be found
	 */
	@Override
	public AcquireAdvertising fetchByPrimaryKey(long acquireAdvertisingId) {
		return fetchByPrimaryKey((Serializable)acquireAdvertisingId);
	}

	/**
	 * Returns all the acquire advertisings.
	 *
	 * @return the acquire advertisings
	 */
	@Override
	public List<AcquireAdvertising> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire advertisings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireAdvertisingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire advertisings
	 * @param end the upper bound of the range of acquire advertisings (not inclusive)
	 * @return the range of acquire advertisings
	 */
	@Override
	public List<AcquireAdvertising> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire advertisings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireAdvertisingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire advertisings
	 * @param end the upper bound of the range of acquire advertisings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire advertisings
	 */
	@Override
	public List<AcquireAdvertising> findAll(
		int start, int end,
		OrderByComparator<AcquireAdvertising> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire advertisings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireAdvertisingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire advertisings
	 * @param end the upper bound of the range of acquire advertisings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire advertisings
	 */
	@Override
	public List<AcquireAdvertising> findAll(
		int start, int end,
		OrderByComparator<AcquireAdvertising> orderByComparator,
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

		List<AcquireAdvertising> list = null;

		if (useFinderCache) {
			list = (List<AcquireAdvertising>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACQUIREADVERTISING);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACQUIREADVERTISING;

				sql = sql.concat(AcquireAdvertisingModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcquireAdvertising>)QueryUtil.list(
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
	 * Removes all the acquire advertisings from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcquireAdvertising acquireAdvertising : findAll()) {
			remove(acquireAdvertising);
		}
	}

	/**
	 * Returns the number of acquire advertisings.
	 *
	 * @return the number of acquire advertisings
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
					_SQL_COUNT_ACQUIREADVERTISING);

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
		return "acquireAdvertisingId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACQUIREADVERTISING;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcquireAdvertisingModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acquire advertising persistence.
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

		_finderPathFetchBygetAcquireAdvertisingBy_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAcquireAdvertisingBy_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetAcquireAdvertisingBy_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAcquireAdvertisingBy_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		AcquireAdvertisingUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcquireAdvertisingUtil.setPersistence(null);

		entityCache.removeCache(AcquireAdvertisingImpl.class.getName());
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

	private static final String _SQL_SELECT_ACQUIREADVERTISING =
		"SELECT acquireAdvertising FROM AcquireAdvertising acquireAdvertising";

	private static final String _SQL_SELECT_ACQUIREADVERTISING_WHERE =
		"SELECT acquireAdvertising FROM AcquireAdvertising acquireAdvertising WHERE ";

	private static final String _SQL_COUNT_ACQUIREADVERTISING =
		"SELECT COUNT(acquireAdvertising) FROM AcquireAdvertising acquireAdvertising";

	private static final String _SQL_COUNT_ACQUIREADVERTISING_WHERE =
		"SELECT COUNT(acquireAdvertising) FROM AcquireAdvertising acquireAdvertising WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "acquireAdvertising.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcquireAdvertising exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcquireAdvertising exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcquireAdvertisingPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}