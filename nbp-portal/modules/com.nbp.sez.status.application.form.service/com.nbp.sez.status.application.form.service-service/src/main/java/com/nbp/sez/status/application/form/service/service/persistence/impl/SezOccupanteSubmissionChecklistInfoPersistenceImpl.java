/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupanteSubmissionChecklistInfoException;
import com.nbp.sez.status.application.form.service.model.SezOccupanteSubmissionChecklistInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupanteSubmissionChecklistInfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupanteSubmissionChecklistInfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupanteSubmissionChecklistInfoModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupanteSubmissionChecklistInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupanteSubmissionChecklistInfoUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

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
 * The persistence implementation for the sez occupante submission checklist info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezOccupanteSubmissionChecklistInfoPersistence.class)
public class SezOccupanteSubmissionChecklistInfoPersistenceImpl
	extends BasePersistenceImpl<SezOccupanteSubmissionChecklistInfo>
	implements SezOccupanteSubmissionChecklistInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezOccupanteSubmissionChecklistInfoUtil</code> to access the sez occupante submission checklist info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezOccupanteSubmissionChecklistInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetSezStatusByAppId;
	private FinderPath _finderPathCountBygetSezStatusByAppId;

	/**
	 * Returns the sez occupante submission checklist info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupanteSubmissionChecklistInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupante submission checklist info
	 * @throws NoSuchSezOccupanteSubmissionChecklistInfoException if a matching sez occupante submission checklist info could not be found
	 */
	@Override
	public SezOccupanteSubmissionChecklistInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupanteSubmissionChecklistInfoException {

		SezOccupanteSubmissionChecklistInfo
			sezOccupanteSubmissionChecklistInfo = fetchBygetSezStatusByAppId(
				sezStatusApplicationId);

		if (sezOccupanteSubmissionChecklistInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezOccupanteSubmissionChecklistInfoException(
				sb.toString());
		}

		return sezOccupanteSubmissionChecklistInfo;
	}

	/**
	 * Returns the sez occupante submission checklist info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupante submission checklist info, or <code>null</code> if a matching sez occupante submission checklist info could not be found
	 */
	@Override
	public SezOccupanteSubmissionChecklistInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez occupante submission checklist info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupante submission checklist info, or <code>null</code> if a matching sez occupante submission checklist info could not be found
	 */
	@Override
	public SezOccupanteSubmissionChecklistInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {sezStatusApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatusByAppId, finderArgs, this);
		}

		if (result instanceof SezOccupanteSubmissionChecklistInfo) {
			SezOccupanteSubmissionChecklistInfo
				sezOccupanteSubmissionChecklistInfo =
					(SezOccupanteSubmissionChecklistInfo)result;

			if (sezStatusApplicationId !=
					sezOccupanteSubmissionChecklistInfo.
						getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZOCCUPANTESUBMISSIONCHECKLISTINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezOccupanteSubmissionChecklistInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatusByAppId, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									sezStatusApplicationId
								};
							}

							_log.warn(
								"SezOccupanteSubmissionChecklistInfoPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezOccupanteSubmissionChecklistInfo
						sezOccupanteSubmissionChecklistInfo = list.get(0);

					result = sezOccupanteSubmissionChecklistInfo;

					cacheResult(sezOccupanteSubmissionChecklistInfo);
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
			return (SezOccupanteSubmissionChecklistInfo)result;
		}
	}

	/**
	 * Removes the sez occupante submission checklist info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupante submission checklist info that was removed
	 */
	@Override
	public SezOccupanteSubmissionChecklistInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupanteSubmissionChecklistInfoException {

		SezOccupanteSubmissionChecklistInfo
			sezOccupanteSubmissionChecklistInfo = findBygetSezStatusByAppId(
				sezStatusApplicationId);

		return remove(sezOccupanteSubmissionChecklistInfo);
	}

	/**
	 * Returns the number of sez occupante submission checklist infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupante submission checklist infos
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZOCCUPANTESUBMISSIONCHECKLISTINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

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
		_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2 =
			"sezOccupanteSubmissionChecklistInfo.sezStatusApplicationId = ?";

	public SezOccupanteSubmissionChecklistInfoPersistenceImpl() {
		setModelClass(SezOccupanteSubmissionChecklistInfo.class);

		setModelImplClass(SezOccupanteSubmissionChecklistInfoImpl.class);
		setModelPKClass(long.class);

		setTable(SezOccupanteSubmissionChecklistInfoTable.INSTANCE);
	}

	/**
	 * Caches the sez occupante submission checklist info in the entity cache if it is enabled.
	 *
	 * @param sezOccupanteSubmissionChecklistInfo the sez occupante submission checklist info
	 */
	@Override
	public void cacheResult(
		SezOccupanteSubmissionChecklistInfo
			sezOccupanteSubmissionChecklistInfo) {

		entityCache.putResult(
			SezOccupanteSubmissionChecklistInfoImpl.class,
			sezOccupanteSubmissionChecklistInfo.getPrimaryKey(),
			sezOccupanteSubmissionChecklistInfo);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {
				sezOccupanteSubmissionChecklistInfo.getSezStatusApplicationId()
			},
			sezOccupanteSubmissionChecklistInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez occupante submission checklist infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupanteSubmissionChecklistInfos the sez occupante submission checklist infos
	 */
	@Override
	public void cacheResult(
		List<SezOccupanteSubmissionChecklistInfo>
			sezOccupanteSubmissionChecklistInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezOccupanteSubmissionChecklistInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezOccupanteSubmissionChecklistInfo
				sezOccupanteSubmissionChecklistInfo :
					sezOccupanteSubmissionChecklistInfos) {

			if (entityCache.getResult(
					SezOccupanteSubmissionChecklistInfoImpl.class,
					sezOccupanteSubmissionChecklistInfo.getPrimaryKey()) ==
						null) {

				cacheResult(sezOccupanteSubmissionChecklistInfo);
			}
		}
	}

	/**
	 * Clears the cache for all sez occupante submission checklist infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezOccupanteSubmissionChecklistInfoImpl.class);

		finderCache.clearCache(SezOccupanteSubmissionChecklistInfoImpl.class);
	}

	/**
	 * Clears the cache for the sez occupante submission checklist info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezOccupanteSubmissionChecklistInfo
			sezOccupanteSubmissionChecklistInfo) {

		entityCache.removeResult(
			SezOccupanteSubmissionChecklistInfoImpl.class,
			sezOccupanteSubmissionChecklistInfo);
	}

	@Override
	public void clearCache(
		List<SezOccupanteSubmissionChecklistInfo>
			sezOccupanteSubmissionChecklistInfos) {

		for (SezOccupanteSubmissionChecklistInfo
				sezOccupanteSubmissionChecklistInfo :
					sezOccupanteSubmissionChecklistInfos) {

			entityCache.removeResult(
				SezOccupanteSubmissionChecklistInfoImpl.class,
				sezOccupanteSubmissionChecklistInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezOccupanteSubmissionChecklistInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezOccupanteSubmissionChecklistInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezOccupanteSubmissionChecklistInfoModelImpl
			sezOccupanteSubmissionChecklistInfoModelImpl) {

		Object[] args = new Object[] {
			sezOccupanteSubmissionChecklistInfoModelImpl.
				getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezOccupanteSubmissionChecklistInfoModelImpl);
	}

	/**
	 * Creates a new sez occupante submission checklist info with the primary key. Does not add the sez occupante submission checklist info to the database.
	 *
	 * @param sezOccCheckSubmitId the primary key for the new sez occupante submission checklist info
	 * @return the new sez occupante submission checklist info
	 */
	@Override
	public SezOccupanteSubmissionChecklistInfo create(
		long sezOccCheckSubmitId) {

		SezOccupanteSubmissionChecklistInfo
			sezOccupanteSubmissionChecklistInfo =
				new SezOccupanteSubmissionChecklistInfoImpl();

		sezOccupanteSubmissionChecklistInfo.setNew(true);
		sezOccupanteSubmissionChecklistInfo.setPrimaryKey(sezOccCheckSubmitId);

		sezOccupanteSubmissionChecklistInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezOccupanteSubmissionChecklistInfo;
	}

	/**
	 * Removes the sez occupante submission checklist info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccCheckSubmitId the primary key of the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info that was removed
	 * @throws NoSuchSezOccupanteSubmissionChecklistInfoException if a sez occupante submission checklist info with the primary key could not be found
	 */
	@Override
	public SezOccupanteSubmissionChecklistInfo remove(long sezOccCheckSubmitId)
		throws NoSuchSezOccupanteSubmissionChecklistInfoException {

		return remove((Serializable)sezOccCheckSubmitId);
	}

	/**
	 * Removes the sez occupante submission checklist info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info that was removed
	 * @throws NoSuchSezOccupanteSubmissionChecklistInfoException if a sez occupante submission checklist info with the primary key could not be found
	 */
	@Override
	public SezOccupanteSubmissionChecklistInfo remove(Serializable primaryKey)
		throws NoSuchSezOccupanteSubmissionChecklistInfoException {

		Session session = null;

		try {
			session = openSession();

			SezOccupanteSubmissionChecklistInfo
				sezOccupanteSubmissionChecklistInfo =
					(SezOccupanteSubmissionChecklistInfo)session.get(
						SezOccupanteSubmissionChecklistInfoImpl.class,
						primaryKey);

			if (sezOccupanteSubmissionChecklistInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezOccupanteSubmissionChecklistInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezOccupanteSubmissionChecklistInfo);
		}
		catch (NoSuchSezOccupanteSubmissionChecklistInfoException
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
	protected SezOccupanteSubmissionChecklistInfo removeImpl(
		SezOccupanteSubmissionChecklistInfo
			sezOccupanteSubmissionChecklistInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezOccupanteSubmissionChecklistInfo)) {
				sezOccupanteSubmissionChecklistInfo =
					(SezOccupanteSubmissionChecklistInfo)session.get(
						SezOccupanteSubmissionChecklistInfoImpl.class,
						sezOccupanteSubmissionChecklistInfo.getPrimaryKeyObj());
			}

			if (sezOccupanteSubmissionChecklistInfo != null) {
				session.delete(sezOccupanteSubmissionChecklistInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezOccupanteSubmissionChecklistInfo != null) {
			clearCache(sezOccupanteSubmissionChecklistInfo);
		}

		return sezOccupanteSubmissionChecklistInfo;
	}

	@Override
	public SezOccupanteSubmissionChecklistInfo updateImpl(
		SezOccupanteSubmissionChecklistInfo
			sezOccupanteSubmissionChecklistInfo) {

		boolean isNew = sezOccupanteSubmissionChecklistInfo.isNew();

		if (!(sezOccupanteSubmissionChecklistInfo instanceof
				SezOccupanteSubmissionChecklistInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezOccupanteSubmissionChecklistInfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezOccupanteSubmissionChecklistInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezOccupanteSubmissionChecklistInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezOccupanteSubmissionChecklistInfo implementation " +
					sezOccupanteSubmissionChecklistInfo.getClass());
		}

		SezOccupanteSubmissionChecklistInfoModelImpl
			sezOccupanteSubmissionChecklistInfoModelImpl =
				(SezOccupanteSubmissionChecklistInfoModelImpl)
					sezOccupanteSubmissionChecklistInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(sezOccupanteSubmissionChecklistInfo.getCreateDate() == null)) {

			if (serviceContext == null) {
				sezOccupanteSubmissionChecklistInfo.setCreateDate(date);
			}
			else {
				sezOccupanteSubmissionChecklistInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezOccupanteSubmissionChecklistInfoModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				sezOccupanteSubmissionChecklistInfo.setModifiedDate(date);
			}
			else {
				sezOccupanteSubmissionChecklistInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezOccupanteSubmissionChecklistInfo);
			}
			else {
				sezOccupanteSubmissionChecklistInfo =
					(SezOccupanteSubmissionChecklistInfo)session.merge(
						sezOccupanteSubmissionChecklistInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezOccupanteSubmissionChecklistInfoImpl.class,
			sezOccupanteSubmissionChecklistInfoModelImpl, false, true);

		cacheUniqueFindersCache(sezOccupanteSubmissionChecklistInfoModelImpl);

		if (isNew) {
			sezOccupanteSubmissionChecklistInfo.setNew(false);
		}

		sezOccupanteSubmissionChecklistInfo.resetOriginalValues();

		return sezOccupanteSubmissionChecklistInfo;
	}

	/**
	 * Returns the sez occupante submission checklist info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info
	 * @throws NoSuchSezOccupanteSubmissionChecklistInfoException if a sez occupante submission checklist info with the primary key could not be found
	 */
	@Override
	public SezOccupanteSubmissionChecklistInfo findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchSezOccupanteSubmissionChecklistInfoException {

		SezOccupanteSubmissionChecklistInfo
			sezOccupanteSubmissionChecklistInfo = fetchByPrimaryKey(primaryKey);

		if (sezOccupanteSubmissionChecklistInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezOccupanteSubmissionChecklistInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezOccupanteSubmissionChecklistInfo;
	}

	/**
	 * Returns the sez occupante submission checklist info with the primary key or throws a <code>NoSuchSezOccupanteSubmissionChecklistInfoException</code> if it could not be found.
	 *
	 * @param sezOccCheckSubmitId the primary key of the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info
	 * @throws NoSuchSezOccupanteSubmissionChecklistInfoException if a sez occupante submission checklist info with the primary key could not be found
	 */
	@Override
	public SezOccupanteSubmissionChecklistInfo findByPrimaryKey(
			long sezOccCheckSubmitId)
		throws NoSuchSezOccupanteSubmissionChecklistInfoException {

		return findByPrimaryKey((Serializable)sezOccCheckSubmitId);
	}

	/**
	 * Returns the sez occupante submission checklist info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccCheckSubmitId the primary key of the sez occupante submission checklist info
	 * @return the sez occupante submission checklist info, or <code>null</code> if a sez occupante submission checklist info with the primary key could not be found
	 */
	@Override
	public SezOccupanteSubmissionChecklistInfo fetchByPrimaryKey(
		long sezOccCheckSubmitId) {

		return fetchByPrimaryKey((Serializable)sezOccCheckSubmitId);
	}

	/**
	 * Returns all the sez occupante submission checklist infos.
	 *
	 * @return the sez occupante submission checklist infos
	 */
	@Override
	public List<SezOccupanteSubmissionChecklistInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occupante submission checklist infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupanteSubmissionChecklistInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante submission checklist infos
	 * @param end the upper bound of the range of sez occupante submission checklist infos (not inclusive)
	 * @return the range of sez occupante submission checklist infos
	 */
	@Override
	public List<SezOccupanteSubmissionChecklistInfo> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occupante submission checklist infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupanteSubmissionChecklistInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante submission checklist infos
	 * @param end the upper bound of the range of sez occupante submission checklist infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupante submission checklist infos
	 */
	@Override
	public List<SezOccupanteSubmissionChecklistInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupanteSubmissionChecklistInfo>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occupante submission checklist infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupanteSubmissionChecklistInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante submission checklist infos
	 * @param end the upper bound of the range of sez occupante submission checklist infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupante submission checklist infos
	 */
	@Override
	public List<SezOccupanteSubmissionChecklistInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupanteSubmissionChecklistInfo>
			orderByComparator,
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

		List<SezOccupanteSubmissionChecklistInfo> list = null;

		if (useFinderCache) {
			list =
				(List<SezOccupanteSubmissionChecklistInfo>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZOCCUPANTESUBMISSIONCHECKLISTINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZOCCUPANTESUBMISSIONCHECKLISTINFO;

				sql = sql.concat(
					SezOccupanteSubmissionChecklistInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<SezOccupanteSubmissionChecklistInfo>)QueryUtil.list(
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
	 * Removes all the sez occupante submission checklist infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezOccupanteSubmissionChecklistInfo
				sezOccupanteSubmissionChecklistInfo : findAll()) {

			remove(sezOccupanteSubmissionChecklistInfo);
		}
	}

	/**
	 * Returns the number of sez occupante submission checklist infos.
	 *
	 * @return the number of sez occupante submission checklist infos
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
					_SQL_COUNT_SEZOCCUPANTESUBMISSIONCHECKLISTINFO);

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
		return "sezOccCheckSubmitId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZOCCUPANTESUBMISSIONCHECKLISTINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezOccupanteSubmissionChecklistInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez occupante submission checklist info persistence.
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

		_finderPathFetchBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSezStatusByAppId",
			new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		SezOccupanteSubmissionChecklistInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezOccupanteSubmissionChecklistInfoUtil.setPersistence(null);

		entityCache.removeCache(
			SezOccupanteSubmissionChecklistInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String
		_SQL_SELECT_SEZOCCUPANTESUBMISSIONCHECKLISTINFO =
			"SELECT sezOccupanteSubmissionChecklistInfo FROM SezOccupanteSubmissionChecklistInfo sezOccupanteSubmissionChecklistInfo";

	private static final String
		_SQL_SELECT_SEZOCCUPANTESUBMISSIONCHECKLISTINFO_WHERE =
			"SELECT sezOccupanteSubmissionChecklistInfo FROM SezOccupanteSubmissionChecklistInfo sezOccupanteSubmissionChecklistInfo WHERE ";

	private static final String _SQL_COUNT_SEZOCCUPANTESUBMISSIONCHECKLISTINFO =
		"SELECT COUNT(sezOccupanteSubmissionChecklistInfo) FROM SezOccupanteSubmissionChecklistInfo sezOccupanteSubmissionChecklistInfo";

	private static final String
		_SQL_COUNT_SEZOCCUPANTESUBMISSIONCHECKLISTINFO_WHERE =
			"SELECT COUNT(sezOccupanteSubmissionChecklistInfo) FROM SezOccupanteSubmissionChecklistInfo sezOccupanteSubmissionChecklistInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezOccupanteSubmissionChecklistInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezOccupanteSubmissionChecklistInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezOccupanteSubmissionChecklistInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezOccupanteSubmissionChecklistInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}