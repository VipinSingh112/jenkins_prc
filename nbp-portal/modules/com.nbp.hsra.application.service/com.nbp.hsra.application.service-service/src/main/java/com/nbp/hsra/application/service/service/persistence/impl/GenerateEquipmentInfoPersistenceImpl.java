/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence.impl;

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

import com.nbp.hsra.application.service.exception.NoSuchGenerateEquipmentInfoException;
import com.nbp.hsra.application.service.model.GenerateEquipmentInfo;
import com.nbp.hsra.application.service.model.GenerateEquipmentInfoTable;
import com.nbp.hsra.application.service.model.impl.GenerateEquipmentInfoImpl;
import com.nbp.hsra.application.service.model.impl.GenerateEquipmentInfoModelImpl;
import com.nbp.hsra.application.service.service.persistence.GenerateEquipmentInfoPersistence;
import com.nbp.hsra.application.service.service.persistence.GenerateEquipmentInfoUtil;
import com.nbp.hsra.application.service.service.persistence.impl.constants.HSRA_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the generate equipment info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = GenerateEquipmentInfoPersistence.class)
public class GenerateEquipmentInfoPersistenceImpl
	extends BasePersistenceImpl<GenerateEquipmentInfo>
	implements GenerateEquipmentInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>GenerateEquipmentInfoUtil</code> to access the generate equipment info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		GenerateEquipmentInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHsraById;
	private FinderPath _finderPathCountBygetHsraById;

	/**
	 * Returns the generate equipment info where hsraApplicationId = &#63; or throws a <code>NoSuchGenerateEquipmentInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching generate equipment info
	 * @throws NoSuchGenerateEquipmentInfoException if a matching generate equipment info could not be found
	 */
	@Override
	public GenerateEquipmentInfo findBygetHsraById(long hsraApplicationId)
		throws NoSuchGenerateEquipmentInfoException {

		GenerateEquipmentInfo generateEquipmentInfo = fetchBygetHsraById(
			hsraApplicationId);

		if (generateEquipmentInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchGenerateEquipmentInfoException(sb.toString());
		}

		return generateEquipmentInfo;
	}

	/**
	 * Returns the generate equipment info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching generate equipment info, or <code>null</code> if a matching generate equipment info could not be found
	 */
	@Override
	public GenerateEquipmentInfo fetchBygetHsraById(long hsraApplicationId) {
		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the generate equipment info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching generate equipment info, or <code>null</code> if a matching generate equipment info could not be found
	 */
	@Override
	public GenerateEquipmentInfo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {hsraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHsraById, finderArgs, this);
		}

		if (result instanceof GenerateEquipmentInfo) {
			GenerateEquipmentInfo generateEquipmentInfo =
				(GenerateEquipmentInfo)result;

			if (hsraApplicationId !=
					generateEquipmentInfo.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_GENERATEEQUIPMENTINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<GenerateEquipmentInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHsraById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {hsraApplicationId};
							}

							_log.warn(
								"GenerateEquipmentInfoPersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					GenerateEquipmentInfo generateEquipmentInfo = list.get(0);

					result = generateEquipmentInfo;

					cacheResult(generateEquipmentInfo);
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
			return (GenerateEquipmentInfo)result;
		}
	}

	/**
	 * Removes the generate equipment info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the generate equipment info that was removed
	 */
	@Override
	public GenerateEquipmentInfo removeBygetHsraById(long hsraApplicationId)
		throws NoSuchGenerateEquipmentInfoException {

		GenerateEquipmentInfo generateEquipmentInfo = findBygetHsraById(
			hsraApplicationId);

		return remove(generateEquipmentInfo);
	}

	/**
	 * Returns the number of generate equipment infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching generate equipment infos
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_GENERATEEQUIPMENTINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

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

	private static final String _FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2 =
		"generateEquipmentInfo.hsraApplicationId = ?";

	public GenerateEquipmentInfoPersistenceImpl() {
		setModelClass(GenerateEquipmentInfo.class);

		setModelImplClass(GenerateEquipmentInfoImpl.class);
		setModelPKClass(long.class);

		setTable(GenerateEquipmentInfoTable.INSTANCE);
	}

	/**
	 * Caches the generate equipment info in the entity cache if it is enabled.
	 *
	 * @param generateEquipmentInfo the generate equipment info
	 */
	@Override
	public void cacheResult(GenerateEquipmentInfo generateEquipmentInfo) {
		entityCache.putResult(
			GenerateEquipmentInfoImpl.class,
			generateEquipmentInfo.getPrimaryKey(), generateEquipmentInfo);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {generateEquipmentInfo.getHsraApplicationId()},
			generateEquipmentInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the generate equipment infos in the entity cache if it is enabled.
	 *
	 * @param generateEquipmentInfos the generate equipment infos
	 */
	@Override
	public void cacheResult(
		List<GenerateEquipmentInfo> generateEquipmentInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (generateEquipmentInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (GenerateEquipmentInfo generateEquipmentInfo :
				generateEquipmentInfos) {

			if (entityCache.getResult(
					GenerateEquipmentInfoImpl.class,
					generateEquipmentInfo.getPrimaryKey()) == null) {

				cacheResult(generateEquipmentInfo);
			}
		}
	}

	/**
	 * Clears the cache for all generate equipment infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(GenerateEquipmentInfoImpl.class);

		finderCache.clearCache(GenerateEquipmentInfoImpl.class);
	}

	/**
	 * Clears the cache for the generate equipment info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(GenerateEquipmentInfo generateEquipmentInfo) {
		entityCache.removeResult(
			GenerateEquipmentInfoImpl.class, generateEquipmentInfo);
	}

	@Override
	public void clearCache(List<GenerateEquipmentInfo> generateEquipmentInfos) {
		for (GenerateEquipmentInfo generateEquipmentInfo :
				generateEquipmentInfos) {

			entityCache.removeResult(
				GenerateEquipmentInfoImpl.class, generateEquipmentInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(GenerateEquipmentInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				GenerateEquipmentInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		GenerateEquipmentInfoModelImpl generateEquipmentInfoModelImpl) {

		Object[] args = new Object[] {
			generateEquipmentInfoModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args,
			generateEquipmentInfoModelImpl);
	}

	/**
	 * Creates a new generate equipment info with the primary key. Does not add the generate equipment info to the database.
	 *
	 * @param GenerateEquipmentInfoId the primary key for the new generate equipment info
	 * @return the new generate equipment info
	 */
	@Override
	public GenerateEquipmentInfo create(long GenerateEquipmentInfoId) {
		GenerateEquipmentInfo generateEquipmentInfo =
			new GenerateEquipmentInfoImpl();

		generateEquipmentInfo.setNew(true);
		generateEquipmentInfo.setPrimaryKey(GenerateEquipmentInfoId);

		generateEquipmentInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return generateEquipmentInfo;
	}

	/**
	 * Removes the generate equipment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param GenerateEquipmentInfoId the primary key of the generate equipment info
	 * @return the generate equipment info that was removed
	 * @throws NoSuchGenerateEquipmentInfoException if a generate equipment info with the primary key could not be found
	 */
	@Override
	public GenerateEquipmentInfo remove(long GenerateEquipmentInfoId)
		throws NoSuchGenerateEquipmentInfoException {

		return remove((Serializable)GenerateEquipmentInfoId);
	}

	/**
	 * Removes the generate equipment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the generate equipment info
	 * @return the generate equipment info that was removed
	 * @throws NoSuchGenerateEquipmentInfoException if a generate equipment info with the primary key could not be found
	 */
	@Override
	public GenerateEquipmentInfo remove(Serializable primaryKey)
		throws NoSuchGenerateEquipmentInfoException {

		Session session = null;

		try {
			session = openSession();

			GenerateEquipmentInfo generateEquipmentInfo =
				(GenerateEquipmentInfo)session.get(
					GenerateEquipmentInfoImpl.class, primaryKey);

			if (generateEquipmentInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchGenerateEquipmentInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(generateEquipmentInfo);
		}
		catch (NoSuchGenerateEquipmentInfoException noSuchEntityException) {
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
	protected GenerateEquipmentInfo removeImpl(
		GenerateEquipmentInfo generateEquipmentInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(generateEquipmentInfo)) {
				generateEquipmentInfo = (GenerateEquipmentInfo)session.get(
					GenerateEquipmentInfoImpl.class,
					generateEquipmentInfo.getPrimaryKeyObj());
			}

			if (generateEquipmentInfo != null) {
				session.delete(generateEquipmentInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (generateEquipmentInfo != null) {
			clearCache(generateEquipmentInfo);
		}

		return generateEquipmentInfo;
	}

	@Override
	public GenerateEquipmentInfo updateImpl(
		GenerateEquipmentInfo generateEquipmentInfo) {

		boolean isNew = generateEquipmentInfo.isNew();

		if (!(generateEquipmentInfo instanceof
				GenerateEquipmentInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(generateEquipmentInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					generateEquipmentInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in generateEquipmentInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom GenerateEquipmentInfo implementation " +
					generateEquipmentInfo.getClass());
		}

		GenerateEquipmentInfoModelImpl generateEquipmentInfoModelImpl =
			(GenerateEquipmentInfoModelImpl)generateEquipmentInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (generateEquipmentInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				generateEquipmentInfo.setCreateDate(date);
			}
			else {
				generateEquipmentInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!generateEquipmentInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				generateEquipmentInfo.setModifiedDate(date);
			}
			else {
				generateEquipmentInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(generateEquipmentInfo);
			}
			else {
				generateEquipmentInfo = (GenerateEquipmentInfo)session.merge(
					generateEquipmentInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			GenerateEquipmentInfoImpl.class, generateEquipmentInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(generateEquipmentInfoModelImpl);

		if (isNew) {
			generateEquipmentInfo.setNew(false);
		}

		generateEquipmentInfo.resetOriginalValues();

		return generateEquipmentInfo;
	}

	/**
	 * Returns the generate equipment info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the generate equipment info
	 * @return the generate equipment info
	 * @throws NoSuchGenerateEquipmentInfoException if a generate equipment info with the primary key could not be found
	 */
	@Override
	public GenerateEquipmentInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchGenerateEquipmentInfoException {

		GenerateEquipmentInfo generateEquipmentInfo = fetchByPrimaryKey(
			primaryKey);

		if (generateEquipmentInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchGenerateEquipmentInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return generateEquipmentInfo;
	}

	/**
	 * Returns the generate equipment info with the primary key or throws a <code>NoSuchGenerateEquipmentInfoException</code> if it could not be found.
	 *
	 * @param GenerateEquipmentInfoId the primary key of the generate equipment info
	 * @return the generate equipment info
	 * @throws NoSuchGenerateEquipmentInfoException if a generate equipment info with the primary key could not be found
	 */
	@Override
	public GenerateEquipmentInfo findByPrimaryKey(long GenerateEquipmentInfoId)
		throws NoSuchGenerateEquipmentInfoException {

		return findByPrimaryKey((Serializable)GenerateEquipmentInfoId);
	}

	/**
	 * Returns the generate equipment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param GenerateEquipmentInfoId the primary key of the generate equipment info
	 * @return the generate equipment info, or <code>null</code> if a generate equipment info with the primary key could not be found
	 */
	@Override
	public GenerateEquipmentInfo fetchByPrimaryKey(
		long GenerateEquipmentInfoId) {

		return fetchByPrimaryKey((Serializable)GenerateEquipmentInfoId);
	}

	/**
	 * Returns all the generate equipment infos.
	 *
	 * @return the generate equipment infos
	 */
	@Override
	public List<GenerateEquipmentInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the generate equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenerateEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of generate equipment infos
	 * @param end the upper bound of the range of generate equipment infos (not inclusive)
	 * @return the range of generate equipment infos
	 */
	@Override
	public List<GenerateEquipmentInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the generate equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenerateEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of generate equipment infos
	 * @param end the upper bound of the range of generate equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of generate equipment infos
	 */
	@Override
	public List<GenerateEquipmentInfo> findAll(
		int start, int end,
		OrderByComparator<GenerateEquipmentInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the generate equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenerateEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of generate equipment infos
	 * @param end the upper bound of the range of generate equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of generate equipment infos
	 */
	@Override
	public List<GenerateEquipmentInfo> findAll(
		int start, int end,
		OrderByComparator<GenerateEquipmentInfo> orderByComparator,
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

		List<GenerateEquipmentInfo> list = null;

		if (useFinderCache) {
			list = (List<GenerateEquipmentInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_GENERATEEQUIPMENTINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_GENERATEEQUIPMENTINFO;

				sql = sql.concat(GenerateEquipmentInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<GenerateEquipmentInfo>)QueryUtil.list(
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
	 * Removes all the generate equipment infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (GenerateEquipmentInfo generateEquipmentInfo : findAll()) {
			remove(generateEquipmentInfo);
		}
	}

	/**
	 * Returns the number of generate equipment infos.
	 *
	 * @return the number of generate equipment infos
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
					_SQL_COUNT_GENERATEEQUIPMENTINFO);

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
		return "GenerateEquipmentInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_GENERATEEQUIPMENTINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return GenerateEquipmentInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the generate equipment info persistence.
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

		_finderPathFetchBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		GenerateEquipmentInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		GenerateEquipmentInfoUtil.setPersistence(null);

		entityCache.removeCache(GenerateEquipmentInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_GENERATEEQUIPMENTINFO =
		"SELECT generateEquipmentInfo FROM GenerateEquipmentInfo generateEquipmentInfo";

	private static final String _SQL_SELECT_GENERATEEQUIPMENTINFO_WHERE =
		"SELECT generateEquipmentInfo FROM GenerateEquipmentInfo generateEquipmentInfo WHERE ";

	private static final String _SQL_COUNT_GENERATEEQUIPMENTINFO =
		"SELECT COUNT(generateEquipmentInfo) FROM GenerateEquipmentInfo generateEquipmentInfo";

	private static final String _SQL_COUNT_GENERATEEQUIPMENTINFO_WHERE =
		"SELECT COUNT(generateEquipmentInfo) FROM GenerateEquipmentInfo generateEquipmentInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"generateEquipmentInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No GenerateEquipmentInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No GenerateEquipmentInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		GenerateEquipmentInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}