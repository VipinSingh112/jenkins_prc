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

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionGenDeclareInfoException;
import com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo;
import com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfoTable;
import com.nbp.jtb.application.form.service.model.impl.AttractionGenDeclareInfoImpl;
import com.nbp.jtb.application.form.service.model.impl.AttractionGenDeclareInfoModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AttractionGenDeclareInfoPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionGenDeclareInfoUtil;
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
 * The persistence implementation for the attraction gen declare info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AttractionGenDeclareInfoPersistence.class)
public class AttractionGenDeclareInfoPersistenceImpl
	extends BasePersistenceImpl<AttractionGenDeclareInfo>
	implements AttractionGenDeclareInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AttractionGenDeclareInfoUtil</code> to access the attraction gen declare info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AttractionGenDeclareInfoImpl.class.getName();

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
	 * Returns the attraction gen declare info where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionGenDeclareInfoException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction gen declare info
	 * @throws NoSuchAttractionGenDeclareInfoException if a matching attraction gen declare info could not be found
	 */
	@Override
	public AttractionGenDeclareInfo findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionGenDeclareInfoException {

		AttractionGenDeclareInfo attractionGenDeclareInfo =
			fetchBygetJTB_ByApplicationId(jtbApplicationId);

		if (attractionGenDeclareInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAttractionGenDeclareInfoException(sb.toString());
		}

		return attractionGenDeclareInfo;
	}

	/**
	 * Returns the attraction gen declare info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction gen declare info, or <code>null</code> if a matching attraction gen declare info could not be found
	 */
	@Override
	public AttractionGenDeclareInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the attraction gen declare info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction gen declare info, or <code>null</code> if a matching attraction gen declare info could not be found
	 */
	@Override
	public AttractionGenDeclareInfo fetchBygetJTB_ByApplicationId(
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

		if (result instanceof AttractionGenDeclareInfo) {
			AttractionGenDeclareInfo attractionGenDeclareInfo =
				(AttractionGenDeclareInfo)result;

			if (jtbApplicationId !=
					attractionGenDeclareInfo.getJtbApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ATTRACTIONGENDECLAREINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AttractionGenDeclareInfo> list = query.list();

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
								"AttractionGenDeclareInfoPersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AttractionGenDeclareInfo attractionGenDeclareInfo =
						list.get(0);

					result = attractionGenDeclareInfo;

					cacheResult(attractionGenDeclareInfo);
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
			return (AttractionGenDeclareInfo)result;
		}
	}

	/**
	 * Removes the attraction gen declare info where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction gen declare info that was removed
	 */
	@Override
	public AttractionGenDeclareInfo removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionGenDeclareInfoException {

		AttractionGenDeclareInfo attractionGenDeclareInfo =
			findBygetJTB_ByApplicationId(jtbApplicationId);

		return remove(attractionGenDeclareInfo);
	}

	/**
	 * Returns the number of attraction gen declare infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction gen declare infos
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ATTRACTIONGENDECLAREINFO_WHERE);

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
			"attractionGenDeclareInfo.jtbApplicationId = ?";

	public AttractionGenDeclareInfoPersistenceImpl() {
		setModelClass(AttractionGenDeclareInfo.class);

		setModelImplClass(AttractionGenDeclareInfoImpl.class);
		setModelPKClass(long.class);

		setTable(AttractionGenDeclareInfoTable.INSTANCE);
	}

	/**
	 * Caches the attraction gen declare info in the entity cache if it is enabled.
	 *
	 * @param attractionGenDeclareInfo the attraction gen declare info
	 */
	@Override
	public void cacheResult(AttractionGenDeclareInfo attractionGenDeclareInfo) {
		entityCache.putResult(
			AttractionGenDeclareInfoImpl.class,
			attractionGenDeclareInfo.getPrimaryKey(), attractionGenDeclareInfo);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {attractionGenDeclareInfo.getJtbApplicationId()},
			attractionGenDeclareInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the attraction gen declare infos in the entity cache if it is enabled.
	 *
	 * @param attractionGenDeclareInfos the attraction gen declare infos
	 */
	@Override
	public void cacheResult(
		List<AttractionGenDeclareInfo> attractionGenDeclareInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (attractionGenDeclareInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AttractionGenDeclareInfo attractionGenDeclareInfo :
				attractionGenDeclareInfos) {

			if (entityCache.getResult(
					AttractionGenDeclareInfoImpl.class,
					attractionGenDeclareInfo.getPrimaryKey()) == null) {

				cacheResult(attractionGenDeclareInfo);
			}
		}
	}

	/**
	 * Clears the cache for all attraction gen declare infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AttractionGenDeclareInfoImpl.class);

		finderCache.clearCache(AttractionGenDeclareInfoImpl.class);
	}

	/**
	 * Clears the cache for the attraction gen declare info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AttractionGenDeclareInfo attractionGenDeclareInfo) {
		entityCache.removeResult(
			AttractionGenDeclareInfoImpl.class, attractionGenDeclareInfo);
	}

	@Override
	public void clearCache(
		List<AttractionGenDeclareInfo> attractionGenDeclareInfos) {

		for (AttractionGenDeclareInfo attractionGenDeclareInfo :
				attractionGenDeclareInfos) {

			entityCache.removeResult(
				AttractionGenDeclareInfoImpl.class, attractionGenDeclareInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AttractionGenDeclareInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AttractionGenDeclareInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AttractionGenDeclareInfoModelImpl attractionGenDeclareInfoModelImpl) {

		Object[] args = new Object[] {
			attractionGenDeclareInfoModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			attractionGenDeclareInfoModelImpl);
	}

	/**
	 * Creates a new attraction gen declare info with the primary key. Does not add the attraction gen declare info to the database.
	 *
	 * @param attractionGenDeclareInfoId the primary key for the new attraction gen declare info
	 * @return the new attraction gen declare info
	 */
	@Override
	public AttractionGenDeclareInfo create(long attractionGenDeclareInfoId) {
		AttractionGenDeclareInfo attractionGenDeclareInfo =
			new AttractionGenDeclareInfoImpl();

		attractionGenDeclareInfo.setNew(true);
		attractionGenDeclareInfo.setPrimaryKey(attractionGenDeclareInfoId);

		attractionGenDeclareInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return attractionGenDeclareInfo;
	}

	/**
	 * Removes the attraction gen declare info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionGenDeclareInfoId the primary key of the attraction gen declare info
	 * @return the attraction gen declare info that was removed
	 * @throws NoSuchAttractionGenDeclareInfoException if a attraction gen declare info with the primary key could not be found
	 */
	@Override
	public AttractionGenDeclareInfo remove(long attractionGenDeclareInfoId)
		throws NoSuchAttractionGenDeclareInfoException {

		return remove((Serializable)attractionGenDeclareInfoId);
	}

	/**
	 * Removes the attraction gen declare info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attraction gen declare info
	 * @return the attraction gen declare info that was removed
	 * @throws NoSuchAttractionGenDeclareInfoException if a attraction gen declare info with the primary key could not be found
	 */
	@Override
	public AttractionGenDeclareInfo remove(Serializable primaryKey)
		throws NoSuchAttractionGenDeclareInfoException {

		Session session = null;

		try {
			session = openSession();

			AttractionGenDeclareInfo attractionGenDeclareInfo =
				(AttractionGenDeclareInfo)session.get(
					AttractionGenDeclareInfoImpl.class, primaryKey);

			if (attractionGenDeclareInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttractionGenDeclareInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(attractionGenDeclareInfo);
		}
		catch (NoSuchAttractionGenDeclareInfoException noSuchEntityException) {
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
	protected AttractionGenDeclareInfo removeImpl(
		AttractionGenDeclareInfo attractionGenDeclareInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attractionGenDeclareInfo)) {
				attractionGenDeclareInfo =
					(AttractionGenDeclareInfo)session.get(
						AttractionGenDeclareInfoImpl.class,
						attractionGenDeclareInfo.getPrimaryKeyObj());
			}

			if (attractionGenDeclareInfo != null) {
				session.delete(attractionGenDeclareInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (attractionGenDeclareInfo != null) {
			clearCache(attractionGenDeclareInfo);
		}

		return attractionGenDeclareInfo;
	}

	@Override
	public AttractionGenDeclareInfo updateImpl(
		AttractionGenDeclareInfo attractionGenDeclareInfo) {

		boolean isNew = attractionGenDeclareInfo.isNew();

		if (!(attractionGenDeclareInfo instanceof
				AttractionGenDeclareInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(attractionGenDeclareInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					attractionGenDeclareInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in attractionGenDeclareInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AttractionGenDeclareInfo implementation " +
					attractionGenDeclareInfo.getClass());
		}

		AttractionGenDeclareInfoModelImpl attractionGenDeclareInfoModelImpl =
			(AttractionGenDeclareInfoModelImpl)attractionGenDeclareInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (attractionGenDeclareInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				attractionGenDeclareInfo.setCreateDate(date);
			}
			else {
				attractionGenDeclareInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!attractionGenDeclareInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				attractionGenDeclareInfo.setModifiedDate(date);
			}
			else {
				attractionGenDeclareInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(attractionGenDeclareInfo);
			}
			else {
				attractionGenDeclareInfo =
					(AttractionGenDeclareInfo)session.merge(
						attractionGenDeclareInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AttractionGenDeclareInfoImpl.class,
			attractionGenDeclareInfoModelImpl, false, true);

		cacheUniqueFindersCache(attractionGenDeclareInfoModelImpl);

		if (isNew) {
			attractionGenDeclareInfo.setNew(false);
		}

		attractionGenDeclareInfo.resetOriginalValues();

		return attractionGenDeclareInfo;
	}

	/**
	 * Returns the attraction gen declare info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attraction gen declare info
	 * @return the attraction gen declare info
	 * @throws NoSuchAttractionGenDeclareInfoException if a attraction gen declare info with the primary key could not be found
	 */
	@Override
	public AttractionGenDeclareInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttractionGenDeclareInfoException {

		AttractionGenDeclareInfo attractionGenDeclareInfo = fetchByPrimaryKey(
			primaryKey);

		if (attractionGenDeclareInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttractionGenDeclareInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return attractionGenDeclareInfo;
	}

	/**
	 * Returns the attraction gen declare info with the primary key or throws a <code>NoSuchAttractionGenDeclareInfoException</code> if it could not be found.
	 *
	 * @param attractionGenDeclareInfoId the primary key of the attraction gen declare info
	 * @return the attraction gen declare info
	 * @throws NoSuchAttractionGenDeclareInfoException if a attraction gen declare info with the primary key could not be found
	 */
	@Override
	public AttractionGenDeclareInfo findByPrimaryKey(
			long attractionGenDeclareInfoId)
		throws NoSuchAttractionGenDeclareInfoException {

		return findByPrimaryKey((Serializable)attractionGenDeclareInfoId);
	}

	/**
	 * Returns the attraction gen declare info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionGenDeclareInfoId the primary key of the attraction gen declare info
	 * @return the attraction gen declare info, or <code>null</code> if a attraction gen declare info with the primary key could not be found
	 */
	@Override
	public AttractionGenDeclareInfo fetchByPrimaryKey(
		long attractionGenDeclareInfoId) {

		return fetchByPrimaryKey((Serializable)attractionGenDeclareInfoId);
	}

	/**
	 * Returns all the attraction gen declare infos.
	 *
	 * @return the attraction gen declare infos
	 */
	@Override
	public List<AttractionGenDeclareInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attraction gen declare infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionGenDeclareInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction gen declare infos
	 * @param end the upper bound of the range of attraction gen declare infos (not inclusive)
	 * @return the range of attraction gen declare infos
	 */
	@Override
	public List<AttractionGenDeclareInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attraction gen declare infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionGenDeclareInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction gen declare infos
	 * @param end the upper bound of the range of attraction gen declare infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction gen declare infos
	 */
	@Override
	public List<AttractionGenDeclareInfo> findAll(
		int start, int end,
		OrderByComparator<AttractionGenDeclareInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the attraction gen declare infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionGenDeclareInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction gen declare infos
	 * @param end the upper bound of the range of attraction gen declare infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction gen declare infos
	 */
	@Override
	public List<AttractionGenDeclareInfo> findAll(
		int start, int end,
		OrderByComparator<AttractionGenDeclareInfo> orderByComparator,
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

		List<AttractionGenDeclareInfo> list = null;

		if (useFinderCache) {
			list = (List<AttractionGenDeclareInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ATTRACTIONGENDECLAREINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ATTRACTIONGENDECLAREINFO;

				sql = sql.concat(
					AttractionGenDeclareInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AttractionGenDeclareInfo>)QueryUtil.list(
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
	 * Removes all the attraction gen declare infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AttractionGenDeclareInfo attractionGenDeclareInfo : findAll()) {
			remove(attractionGenDeclareInfo);
		}
	}

	/**
	 * Returns the number of attraction gen declare infos.
	 *
	 * @return the number of attraction gen declare infos
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
					_SQL_COUNT_ATTRACTIONGENDECLAREINFO);

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
		return "attractionGenDeclareInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ATTRACTIONGENDECLAREINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AttractionGenDeclareInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the attraction gen declare info persistence.
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

		AttractionGenDeclareInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AttractionGenDeclareInfoUtil.setPersistence(null);

		entityCache.removeCache(AttractionGenDeclareInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_ATTRACTIONGENDECLAREINFO =
		"SELECT attractionGenDeclareInfo FROM AttractionGenDeclareInfo attractionGenDeclareInfo";

	private static final String _SQL_SELECT_ATTRACTIONGENDECLAREINFO_WHERE =
		"SELECT attractionGenDeclareInfo FROM AttractionGenDeclareInfo attractionGenDeclareInfo WHERE ";

	private static final String _SQL_COUNT_ATTRACTIONGENDECLAREINFO =
		"SELECT COUNT(attractionGenDeclareInfo) FROM AttractionGenDeclareInfo attractionGenDeclareInfo";

	private static final String _SQL_COUNT_ATTRACTIONGENDECLAREINFO_WHERE =
		"SELECT COUNT(attractionGenDeclareInfo) FROM AttractionGenDeclareInfo attractionGenDeclareInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"attractionGenDeclareInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AttractionGenDeclareInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AttractionGenDeclareInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AttractionGenDeclareInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}