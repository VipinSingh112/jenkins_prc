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

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionConCarriageInfoException;
import com.nbp.jtb.application.form.service.model.AttractionConCarriageInfo;
import com.nbp.jtb.application.form.service.model.AttractionConCarriageInfoTable;
import com.nbp.jtb.application.form.service.model.impl.AttractionConCarriageInfoImpl;
import com.nbp.jtb.application.form.service.model.impl.AttractionConCarriageInfoModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AttractionConCarriageInfoPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionConCarriageInfoUtil;
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
 * The persistence implementation for the attraction con carriage info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AttractionConCarriageInfoPersistence.class)
public class AttractionConCarriageInfoPersistenceImpl
	extends BasePersistenceImpl<AttractionConCarriageInfo>
	implements AttractionConCarriageInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AttractionConCarriageInfoUtil</code> to access the attraction con carriage info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AttractionConCarriageInfoImpl.class.getName();

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
	 * Returns the attraction con carriage info where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionConCarriageInfoException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction con carriage info
	 * @throws NoSuchAttractionConCarriageInfoException if a matching attraction con carriage info could not be found
	 */
	@Override
	public AttractionConCarriageInfo findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionConCarriageInfoException {

		AttractionConCarriageInfo attractionConCarriageInfo =
			fetchBygetJTB_ByApplicationId(jtbApplicationId);

		if (attractionConCarriageInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAttractionConCarriageInfoException(sb.toString());
		}

		return attractionConCarriageInfo;
	}

	/**
	 * Returns the attraction con carriage info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction con carriage info, or <code>null</code> if a matching attraction con carriage info could not be found
	 */
	@Override
	public AttractionConCarriageInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the attraction con carriage info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction con carriage info, or <code>null</code> if a matching attraction con carriage info could not be found
	 */
	@Override
	public AttractionConCarriageInfo fetchBygetJTB_ByApplicationId(
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

		if (result instanceof AttractionConCarriageInfo) {
			AttractionConCarriageInfo attractionConCarriageInfo =
				(AttractionConCarriageInfo)result;

			if (jtbApplicationId !=
					attractionConCarriageInfo.getJtbApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ATTRACTIONCONCARRIAGEINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AttractionConCarriageInfo> list = query.list();

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
								"AttractionConCarriageInfoPersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AttractionConCarriageInfo attractionConCarriageInfo =
						list.get(0);

					result = attractionConCarriageInfo;

					cacheResult(attractionConCarriageInfo);
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
			return (AttractionConCarriageInfo)result;
		}
	}

	/**
	 * Removes the attraction con carriage info where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction con carriage info that was removed
	 */
	@Override
	public AttractionConCarriageInfo removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionConCarriageInfoException {

		AttractionConCarriageInfo attractionConCarriageInfo =
			findBygetJTB_ByApplicationId(jtbApplicationId);

		return remove(attractionConCarriageInfo);
	}

	/**
	 * Returns the number of attraction con carriage infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction con carriage infos
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ATTRACTIONCONCARRIAGEINFO_WHERE);

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
			"attractionConCarriageInfo.jtbApplicationId = ?";

	public AttractionConCarriageInfoPersistenceImpl() {
		setModelClass(AttractionConCarriageInfo.class);

		setModelImplClass(AttractionConCarriageInfoImpl.class);
		setModelPKClass(long.class);

		setTable(AttractionConCarriageInfoTable.INSTANCE);
	}

	/**
	 * Caches the attraction con carriage info in the entity cache if it is enabled.
	 *
	 * @param attractionConCarriageInfo the attraction con carriage info
	 */
	@Override
	public void cacheResult(
		AttractionConCarriageInfo attractionConCarriageInfo) {

		entityCache.putResult(
			AttractionConCarriageInfoImpl.class,
			attractionConCarriageInfo.getPrimaryKey(),
			attractionConCarriageInfo);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {attractionConCarriageInfo.getJtbApplicationId()},
			attractionConCarriageInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the attraction con carriage infos in the entity cache if it is enabled.
	 *
	 * @param attractionConCarriageInfos the attraction con carriage infos
	 */
	@Override
	public void cacheResult(
		List<AttractionConCarriageInfo> attractionConCarriageInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (attractionConCarriageInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AttractionConCarriageInfo attractionConCarriageInfo :
				attractionConCarriageInfos) {

			if (entityCache.getResult(
					AttractionConCarriageInfoImpl.class,
					attractionConCarriageInfo.getPrimaryKey()) == null) {

				cacheResult(attractionConCarriageInfo);
			}
		}
	}

	/**
	 * Clears the cache for all attraction con carriage infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AttractionConCarriageInfoImpl.class);

		finderCache.clearCache(AttractionConCarriageInfoImpl.class);
	}

	/**
	 * Clears the cache for the attraction con carriage info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AttractionConCarriageInfo attractionConCarriageInfo) {

		entityCache.removeResult(
			AttractionConCarriageInfoImpl.class, attractionConCarriageInfo);
	}

	@Override
	public void clearCache(
		List<AttractionConCarriageInfo> attractionConCarriageInfos) {

		for (AttractionConCarriageInfo attractionConCarriageInfo :
				attractionConCarriageInfos) {

			entityCache.removeResult(
				AttractionConCarriageInfoImpl.class, attractionConCarriageInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AttractionConCarriageInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AttractionConCarriageInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AttractionConCarriageInfoModelImpl attractionConCarriageInfoModelImpl) {

		Object[] args = new Object[] {
			attractionConCarriageInfoModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			attractionConCarriageInfoModelImpl);
	}

	/**
	 * Creates a new attraction con carriage info with the primary key. Does not add the attraction con carriage info to the database.
	 *
	 * @param attractionConCarriageInfoId the primary key for the new attraction con carriage info
	 * @return the new attraction con carriage info
	 */
	@Override
	public AttractionConCarriageInfo create(long attractionConCarriageInfoId) {
		AttractionConCarriageInfo attractionConCarriageInfo =
			new AttractionConCarriageInfoImpl();

		attractionConCarriageInfo.setNew(true);
		attractionConCarriageInfo.setPrimaryKey(attractionConCarriageInfoId);

		attractionConCarriageInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return attractionConCarriageInfo;
	}

	/**
	 * Removes the attraction con carriage info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionConCarriageInfoId the primary key of the attraction con carriage info
	 * @return the attraction con carriage info that was removed
	 * @throws NoSuchAttractionConCarriageInfoException if a attraction con carriage info with the primary key could not be found
	 */
	@Override
	public AttractionConCarriageInfo remove(long attractionConCarriageInfoId)
		throws NoSuchAttractionConCarriageInfoException {

		return remove((Serializable)attractionConCarriageInfoId);
	}

	/**
	 * Removes the attraction con carriage info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attraction con carriage info
	 * @return the attraction con carriage info that was removed
	 * @throws NoSuchAttractionConCarriageInfoException if a attraction con carriage info with the primary key could not be found
	 */
	@Override
	public AttractionConCarriageInfo remove(Serializable primaryKey)
		throws NoSuchAttractionConCarriageInfoException {

		Session session = null;

		try {
			session = openSession();

			AttractionConCarriageInfo attractionConCarriageInfo =
				(AttractionConCarriageInfo)session.get(
					AttractionConCarriageInfoImpl.class, primaryKey);

			if (attractionConCarriageInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttractionConCarriageInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(attractionConCarriageInfo);
		}
		catch (NoSuchAttractionConCarriageInfoException noSuchEntityException) {
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
	protected AttractionConCarriageInfo removeImpl(
		AttractionConCarriageInfo attractionConCarriageInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attractionConCarriageInfo)) {
				attractionConCarriageInfo =
					(AttractionConCarriageInfo)session.get(
						AttractionConCarriageInfoImpl.class,
						attractionConCarriageInfo.getPrimaryKeyObj());
			}

			if (attractionConCarriageInfo != null) {
				session.delete(attractionConCarriageInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (attractionConCarriageInfo != null) {
			clearCache(attractionConCarriageInfo);
		}

		return attractionConCarriageInfo;
	}

	@Override
	public AttractionConCarriageInfo updateImpl(
		AttractionConCarriageInfo attractionConCarriageInfo) {

		boolean isNew = attractionConCarriageInfo.isNew();

		if (!(attractionConCarriageInfo instanceof
				AttractionConCarriageInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(attractionConCarriageInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					attractionConCarriageInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in attractionConCarriageInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AttractionConCarriageInfo implementation " +
					attractionConCarriageInfo.getClass());
		}

		AttractionConCarriageInfoModelImpl attractionConCarriageInfoModelImpl =
			(AttractionConCarriageInfoModelImpl)attractionConCarriageInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (attractionConCarriageInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				attractionConCarriageInfo.setCreateDate(date);
			}
			else {
				attractionConCarriageInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!attractionConCarriageInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				attractionConCarriageInfo.setModifiedDate(date);
			}
			else {
				attractionConCarriageInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(attractionConCarriageInfo);
			}
			else {
				attractionConCarriageInfo =
					(AttractionConCarriageInfo)session.merge(
						attractionConCarriageInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AttractionConCarriageInfoImpl.class,
			attractionConCarriageInfoModelImpl, false, true);

		cacheUniqueFindersCache(attractionConCarriageInfoModelImpl);

		if (isNew) {
			attractionConCarriageInfo.setNew(false);
		}

		attractionConCarriageInfo.resetOriginalValues();

		return attractionConCarriageInfo;
	}

	/**
	 * Returns the attraction con carriage info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attraction con carriage info
	 * @return the attraction con carriage info
	 * @throws NoSuchAttractionConCarriageInfoException if a attraction con carriage info with the primary key could not be found
	 */
	@Override
	public AttractionConCarriageInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttractionConCarriageInfoException {

		AttractionConCarriageInfo attractionConCarriageInfo = fetchByPrimaryKey(
			primaryKey);

		if (attractionConCarriageInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttractionConCarriageInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return attractionConCarriageInfo;
	}

	/**
	 * Returns the attraction con carriage info with the primary key or throws a <code>NoSuchAttractionConCarriageInfoException</code> if it could not be found.
	 *
	 * @param attractionConCarriageInfoId the primary key of the attraction con carriage info
	 * @return the attraction con carriage info
	 * @throws NoSuchAttractionConCarriageInfoException if a attraction con carriage info with the primary key could not be found
	 */
	@Override
	public AttractionConCarriageInfo findByPrimaryKey(
			long attractionConCarriageInfoId)
		throws NoSuchAttractionConCarriageInfoException {

		return findByPrimaryKey((Serializable)attractionConCarriageInfoId);
	}

	/**
	 * Returns the attraction con carriage info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionConCarriageInfoId the primary key of the attraction con carriage info
	 * @return the attraction con carriage info, or <code>null</code> if a attraction con carriage info with the primary key could not be found
	 */
	@Override
	public AttractionConCarriageInfo fetchByPrimaryKey(
		long attractionConCarriageInfoId) {

		return fetchByPrimaryKey((Serializable)attractionConCarriageInfoId);
	}

	/**
	 * Returns all the attraction con carriage infos.
	 *
	 * @return the attraction con carriage infos
	 */
	@Override
	public List<AttractionConCarriageInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attraction con carriage infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionConCarriageInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction con carriage infos
	 * @param end the upper bound of the range of attraction con carriage infos (not inclusive)
	 * @return the range of attraction con carriage infos
	 */
	@Override
	public List<AttractionConCarriageInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attraction con carriage infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionConCarriageInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction con carriage infos
	 * @param end the upper bound of the range of attraction con carriage infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction con carriage infos
	 */
	@Override
	public List<AttractionConCarriageInfo> findAll(
		int start, int end,
		OrderByComparator<AttractionConCarriageInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the attraction con carriage infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionConCarriageInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction con carriage infos
	 * @param end the upper bound of the range of attraction con carriage infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction con carriage infos
	 */
	@Override
	public List<AttractionConCarriageInfo> findAll(
		int start, int end,
		OrderByComparator<AttractionConCarriageInfo> orderByComparator,
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

		List<AttractionConCarriageInfo> list = null;

		if (useFinderCache) {
			list = (List<AttractionConCarriageInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ATTRACTIONCONCARRIAGEINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ATTRACTIONCONCARRIAGEINFO;

				sql = sql.concat(
					AttractionConCarriageInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AttractionConCarriageInfo>)QueryUtil.list(
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
	 * Removes all the attraction con carriage infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AttractionConCarriageInfo attractionConCarriageInfo : findAll()) {
			remove(attractionConCarriageInfo);
		}
	}

	/**
	 * Returns the number of attraction con carriage infos.
	 *
	 * @return the number of attraction con carriage infos
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
					_SQL_COUNT_ATTRACTIONCONCARRIAGEINFO);

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
		return "attractionConCarriageInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ATTRACTIONCONCARRIAGEINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AttractionConCarriageInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the attraction con carriage info persistence.
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

		AttractionConCarriageInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AttractionConCarriageInfoUtil.setPersistence(null);

		entityCache.removeCache(AttractionConCarriageInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_ATTRACTIONCONCARRIAGEINFO =
		"SELECT attractionConCarriageInfo FROM AttractionConCarriageInfo attractionConCarriageInfo";

	private static final String _SQL_SELECT_ATTRACTIONCONCARRIAGEINFO_WHERE =
		"SELECT attractionConCarriageInfo FROM AttractionConCarriageInfo attractionConCarriageInfo WHERE ";

	private static final String _SQL_COUNT_ATTRACTIONCONCARRIAGEINFO =
		"SELECT COUNT(attractionConCarriageInfo) FROM AttractionConCarriageInfo attractionConCarriageInfo";

	private static final String _SQL_COUNT_ATTRACTIONCONCARRIAGEINFO_WHERE =
		"SELECT COUNT(attractionConCarriageInfo) FROM AttractionConCarriageInfo attractionConCarriageInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"attractionConCarriageInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AttractionConCarriageInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AttractionConCarriageInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AttractionConCarriageInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}