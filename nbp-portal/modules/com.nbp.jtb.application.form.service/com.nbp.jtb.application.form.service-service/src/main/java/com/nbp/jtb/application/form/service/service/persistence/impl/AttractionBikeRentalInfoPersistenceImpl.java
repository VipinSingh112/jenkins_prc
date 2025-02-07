/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence.impl;

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

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionBikeRentalInfoException;
import com.nbp.jtb.application.form.service.model.AttractionBikeRentalInfo;
import com.nbp.jtb.application.form.service.model.AttractionBikeRentalInfoTable;
import com.nbp.jtb.application.form.service.model.impl.AttractionBikeRentalInfoImpl;
import com.nbp.jtb.application.form.service.model.impl.AttractionBikeRentalInfoModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AttractionBikeRentalInfoPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionBikeRentalInfoUtil;
import com.nbp.jtb.application.form.service.service.persistence.impl.constants.JTB_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the attraction bike rental info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AttractionBikeRentalInfoPersistence.class)
public class AttractionBikeRentalInfoPersistenceImpl
	extends BasePersistenceImpl<AttractionBikeRentalInfo>
	implements AttractionBikeRentalInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AttractionBikeRentalInfoUtil</code> to access the attraction bike rental info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AttractionBikeRentalInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJTB_ByApplicationId;
	private FinderPath _finderPathCountBygetJTB_ByApplicationId;

	/**
	 * Returns the attraction bike rental info where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionBikeRentalInfoException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction bike rental info
	 * @throws NoSuchAttractionBikeRentalInfoException if a matching attraction bike rental info could not be found
	 */
	@Override
	public AttractionBikeRentalInfo findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionBikeRentalInfoException {

		AttractionBikeRentalInfo attractionBikeRentalInfo =
			fetchBygetJTB_ByApplicationId(jtbApplicationId);

		if (attractionBikeRentalInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAttractionBikeRentalInfoException(sb.toString());
		}

		return attractionBikeRentalInfo;
	}

	/**
	 * Returns the attraction bike rental info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction bike rental info, or <code>null</code> if a matching attraction bike rental info could not be found
	 */
	@Override
	public AttractionBikeRentalInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the attraction bike rental info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction bike rental info, or <code>null</code> if a matching attraction bike rental info could not be found
	 */
	@Override
	public AttractionBikeRentalInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jtbApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJTB_ByApplicationId, finderArgs, this);
		}

		if (result instanceof AttractionBikeRentalInfo) {
			AttractionBikeRentalInfo attractionBikeRentalInfo =
				(AttractionBikeRentalInfo)result;

			if (jtbApplicationId !=
					attractionBikeRentalInfo.getJtbApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ATTRACTIONBIKERENTALINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AttractionBikeRentalInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJTB_ByApplicationId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {jtbApplicationId};
							}

							_log.warn(
								"AttractionBikeRentalInfoPersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AttractionBikeRentalInfo attractionBikeRentalInfo =
						list.get(0);

					result = attractionBikeRentalInfo;

					cacheResult(attractionBikeRentalInfo);
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
			return (AttractionBikeRentalInfo)result;
		}
	}

	/**
	 * Removes the attraction bike rental info where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction bike rental info that was removed
	 */
	@Override
	public AttractionBikeRentalInfo removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionBikeRentalInfoException {

		AttractionBikeRentalInfo attractionBikeRentalInfo =
			findBygetJTB_ByApplicationId(jtbApplicationId);

		return remove(attractionBikeRentalInfo);
	}

	/**
	 * Returns the number of attraction bike rental infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction bike rental infos
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ATTRACTIONBIKERENTALINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

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
		_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2 =
			"attractionBikeRentalInfo.jtbApplicationId = ?";

	public AttractionBikeRentalInfoPersistenceImpl() {
		setModelClass(AttractionBikeRentalInfo.class);

		setModelImplClass(AttractionBikeRentalInfoImpl.class);
		setModelPKClass(long.class);

		setTable(AttractionBikeRentalInfoTable.INSTANCE);
	}

	/**
	 * Caches the attraction bike rental info in the entity cache if it is enabled.
	 *
	 * @param attractionBikeRentalInfo the attraction bike rental info
	 */
	@Override
	public void cacheResult(AttractionBikeRentalInfo attractionBikeRentalInfo) {
		entityCache.putResult(
			AttractionBikeRentalInfoImpl.class,
			attractionBikeRentalInfo.getPrimaryKey(), attractionBikeRentalInfo);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {attractionBikeRentalInfo.getJtbApplicationId()},
			attractionBikeRentalInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the attraction bike rental infos in the entity cache if it is enabled.
	 *
	 * @param attractionBikeRentalInfos the attraction bike rental infos
	 */
	@Override
	public void cacheResult(
		List<AttractionBikeRentalInfo> attractionBikeRentalInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (attractionBikeRentalInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AttractionBikeRentalInfo attractionBikeRentalInfo :
				attractionBikeRentalInfos) {

			if (entityCache.getResult(
					AttractionBikeRentalInfoImpl.class,
					attractionBikeRentalInfo.getPrimaryKey()) == null) {

				cacheResult(attractionBikeRentalInfo);
			}
		}
	}

	/**
	 * Clears the cache for all attraction bike rental infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AttractionBikeRentalInfoImpl.class);

		finderCache.clearCache(AttractionBikeRentalInfoImpl.class);
	}

	/**
	 * Clears the cache for the attraction bike rental info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AttractionBikeRentalInfo attractionBikeRentalInfo) {
		entityCache.removeResult(
			AttractionBikeRentalInfoImpl.class, attractionBikeRentalInfo);
	}

	@Override
	public void clearCache(
		List<AttractionBikeRentalInfo> attractionBikeRentalInfos) {

		for (AttractionBikeRentalInfo attractionBikeRentalInfo :
				attractionBikeRentalInfos) {

			entityCache.removeResult(
				AttractionBikeRentalInfoImpl.class, attractionBikeRentalInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AttractionBikeRentalInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AttractionBikeRentalInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AttractionBikeRentalInfoModelImpl attractionBikeRentalInfoModelImpl) {

		Object[] args = new Object[] {
			attractionBikeRentalInfoModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			attractionBikeRentalInfoModelImpl);
	}

	/**
	 * Creates a new attraction bike rental info with the primary key. Does not add the attraction bike rental info to the database.
	 *
	 * @param attractionBikeRentalInfoId the primary key for the new attraction bike rental info
	 * @return the new attraction bike rental info
	 */
	@Override
	public AttractionBikeRentalInfo create(long attractionBikeRentalInfoId) {
		AttractionBikeRentalInfo attractionBikeRentalInfo =
			new AttractionBikeRentalInfoImpl();

		attractionBikeRentalInfo.setNew(true);
		attractionBikeRentalInfo.setPrimaryKey(attractionBikeRentalInfoId);

		attractionBikeRentalInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return attractionBikeRentalInfo;
	}

	/**
	 * Removes the attraction bike rental info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionBikeRentalInfoId the primary key of the attraction bike rental info
	 * @return the attraction bike rental info that was removed
	 * @throws NoSuchAttractionBikeRentalInfoException if a attraction bike rental info with the primary key could not be found
	 */
	@Override
	public AttractionBikeRentalInfo remove(long attractionBikeRentalInfoId)
		throws NoSuchAttractionBikeRentalInfoException {

		return remove((Serializable)attractionBikeRentalInfoId);
	}

	/**
	 * Removes the attraction bike rental info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attraction bike rental info
	 * @return the attraction bike rental info that was removed
	 * @throws NoSuchAttractionBikeRentalInfoException if a attraction bike rental info with the primary key could not be found
	 */
	@Override
	public AttractionBikeRentalInfo remove(Serializable primaryKey)
		throws NoSuchAttractionBikeRentalInfoException {

		Session session = null;

		try {
			session = openSession();

			AttractionBikeRentalInfo attractionBikeRentalInfo =
				(AttractionBikeRentalInfo)session.get(
					AttractionBikeRentalInfoImpl.class, primaryKey);

			if (attractionBikeRentalInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttractionBikeRentalInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(attractionBikeRentalInfo);
		}
		catch (NoSuchAttractionBikeRentalInfoException noSuchEntityException) {
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
	protected AttractionBikeRentalInfo removeImpl(
		AttractionBikeRentalInfo attractionBikeRentalInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attractionBikeRentalInfo)) {
				attractionBikeRentalInfo =
					(AttractionBikeRentalInfo)session.get(
						AttractionBikeRentalInfoImpl.class,
						attractionBikeRentalInfo.getPrimaryKeyObj());
			}

			if (attractionBikeRentalInfo != null) {
				session.delete(attractionBikeRentalInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (attractionBikeRentalInfo != null) {
			clearCache(attractionBikeRentalInfo);
		}

		return attractionBikeRentalInfo;
	}

	@Override
	public AttractionBikeRentalInfo updateImpl(
		AttractionBikeRentalInfo attractionBikeRentalInfo) {

		boolean isNew = attractionBikeRentalInfo.isNew();

		if (!(attractionBikeRentalInfo instanceof
				AttractionBikeRentalInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(attractionBikeRentalInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					attractionBikeRentalInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in attractionBikeRentalInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AttractionBikeRentalInfo implementation " +
					attractionBikeRentalInfo.getClass());
		}

		AttractionBikeRentalInfoModelImpl attractionBikeRentalInfoModelImpl =
			(AttractionBikeRentalInfoModelImpl)attractionBikeRentalInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (attractionBikeRentalInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				attractionBikeRentalInfo.setCreateDate(date);
			}
			else {
				attractionBikeRentalInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!attractionBikeRentalInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				attractionBikeRentalInfo.setModifiedDate(date);
			}
			else {
				attractionBikeRentalInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(attractionBikeRentalInfo);
			}
			else {
				attractionBikeRentalInfo =
					(AttractionBikeRentalInfo)session.merge(
						attractionBikeRentalInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AttractionBikeRentalInfoImpl.class,
			attractionBikeRentalInfoModelImpl, false, true);

		cacheUniqueFindersCache(attractionBikeRentalInfoModelImpl);

		if (isNew) {
			attractionBikeRentalInfo.setNew(false);
		}

		attractionBikeRentalInfo.resetOriginalValues();

		return attractionBikeRentalInfo;
	}

	/**
	 * Returns the attraction bike rental info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attraction bike rental info
	 * @return the attraction bike rental info
	 * @throws NoSuchAttractionBikeRentalInfoException if a attraction bike rental info with the primary key could not be found
	 */
	@Override
	public AttractionBikeRentalInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttractionBikeRentalInfoException {

		AttractionBikeRentalInfo attractionBikeRentalInfo = fetchByPrimaryKey(
			primaryKey);

		if (attractionBikeRentalInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttractionBikeRentalInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return attractionBikeRentalInfo;
	}

	/**
	 * Returns the attraction bike rental info with the primary key or throws a <code>NoSuchAttractionBikeRentalInfoException</code> if it could not be found.
	 *
	 * @param attractionBikeRentalInfoId the primary key of the attraction bike rental info
	 * @return the attraction bike rental info
	 * @throws NoSuchAttractionBikeRentalInfoException if a attraction bike rental info with the primary key could not be found
	 */
	@Override
	public AttractionBikeRentalInfo findByPrimaryKey(
			long attractionBikeRentalInfoId)
		throws NoSuchAttractionBikeRentalInfoException {

		return findByPrimaryKey((Serializable)attractionBikeRentalInfoId);
	}

	/**
	 * Returns the attraction bike rental info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionBikeRentalInfoId the primary key of the attraction bike rental info
	 * @return the attraction bike rental info, or <code>null</code> if a attraction bike rental info with the primary key could not be found
	 */
	@Override
	public AttractionBikeRentalInfo fetchByPrimaryKey(
		long attractionBikeRentalInfoId) {

		return fetchByPrimaryKey((Serializable)attractionBikeRentalInfoId);
	}

	/**
	 * Returns all the attraction bike rental infos.
	 *
	 * @return the attraction bike rental infos
	 */
	@Override
	public List<AttractionBikeRentalInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attraction bike rental infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionBikeRentalInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction bike rental infos
	 * @param end the upper bound of the range of attraction bike rental infos (not inclusive)
	 * @return the range of attraction bike rental infos
	 */
	@Override
	public List<AttractionBikeRentalInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attraction bike rental infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionBikeRentalInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction bike rental infos
	 * @param end the upper bound of the range of attraction bike rental infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction bike rental infos
	 */
	@Override
	public List<AttractionBikeRentalInfo> findAll(
		int start, int end,
		OrderByComparator<AttractionBikeRentalInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the attraction bike rental infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionBikeRentalInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction bike rental infos
	 * @param end the upper bound of the range of attraction bike rental infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction bike rental infos
	 */
	@Override
	public List<AttractionBikeRentalInfo> findAll(
		int start, int end,
		OrderByComparator<AttractionBikeRentalInfo> orderByComparator,
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

		List<AttractionBikeRentalInfo> list = null;

		if (useFinderCache) {
			list = (List<AttractionBikeRentalInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ATTRACTIONBIKERENTALINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ATTRACTIONBIKERENTALINFO;

				sql = sql.concat(
					AttractionBikeRentalInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AttractionBikeRentalInfo>)QueryUtil.list(
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
	 * Removes all the attraction bike rental infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AttractionBikeRentalInfo attractionBikeRentalInfo : findAll()) {
			remove(attractionBikeRentalInfo);
		}
	}

	/**
	 * Returns the number of attraction bike rental infos.
	 *
	 * @return the number of attraction bike rental infos
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
					_SQL_COUNT_ATTRACTIONBIKERENTALINFO);

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
		return "attractionBikeRentalInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ATTRACTIONBIKERENTALINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AttractionBikeRentalInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the attraction bike rental info persistence.
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

		_finderPathFetchBygetJTB_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJTB_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, true);

		_finderPathCountBygetJTB_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJTB_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, false);

		AttractionBikeRentalInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AttractionBikeRentalInfoUtil.setPersistence(null);

		entityCache.removeCache(AttractionBikeRentalInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ATTRACTIONBIKERENTALINFO =
		"SELECT attractionBikeRentalInfo FROM AttractionBikeRentalInfo attractionBikeRentalInfo";

	private static final String _SQL_SELECT_ATTRACTIONBIKERENTALINFO_WHERE =
		"SELECT attractionBikeRentalInfo FROM AttractionBikeRentalInfo attractionBikeRentalInfo WHERE ";

	private static final String _SQL_COUNT_ATTRACTIONBIKERENTALINFO =
		"SELECT COUNT(attractionBikeRentalInfo) FROM AttractionBikeRentalInfo attractionBikeRentalInfo";

	private static final String _SQL_COUNT_ATTRACTIONBIKERENTALINFO_WHERE =
		"SELECT COUNT(attractionBikeRentalInfo) FROM AttractionBikeRentalInfo attractionBikeRentalInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"attractionBikeRentalInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AttractionBikeRentalInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AttractionBikeRentalInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AttractionBikeRentalInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}