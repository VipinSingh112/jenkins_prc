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

import com.nbp.hsra.application.service.exception.NoSuchQualityDeclarationInfoException;
import com.nbp.hsra.application.service.model.QualityDeclarationInfo;
import com.nbp.hsra.application.service.model.QualityDeclarationInfoTable;
import com.nbp.hsra.application.service.model.impl.QualityDeclarationInfoImpl;
import com.nbp.hsra.application.service.model.impl.QualityDeclarationInfoModelImpl;
import com.nbp.hsra.application.service.service.persistence.QualityDeclarationInfoPersistence;
import com.nbp.hsra.application.service.service.persistence.QualityDeclarationInfoUtil;
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
 * The persistence implementation for the quality declaration info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QualityDeclarationInfoPersistence.class)
public class QualityDeclarationInfoPersistenceImpl
	extends BasePersistenceImpl<QualityDeclarationInfo>
	implements QualityDeclarationInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QualityDeclarationInfoUtil</code> to access the quality declaration info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QualityDeclarationInfoImpl.class.getName();

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
	 * Returns the quality declaration info where hsraApplicationId = &#63; or throws a <code>NoSuchQualityDeclarationInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality declaration info
	 * @throws NoSuchQualityDeclarationInfoException if a matching quality declaration info could not be found
	 */
	@Override
	public QualityDeclarationInfo findBygetHsraById(long hsraApplicationId)
		throws NoSuchQualityDeclarationInfoException {

		QualityDeclarationInfo qualityDeclarationInfo = fetchBygetHsraById(
			hsraApplicationId);

		if (qualityDeclarationInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQualityDeclarationInfoException(sb.toString());
		}

		return qualityDeclarationInfo;
	}

	/**
	 * Returns the quality declaration info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality declaration info, or <code>null</code> if a matching quality declaration info could not be found
	 */
	@Override
	public QualityDeclarationInfo fetchBygetHsraById(long hsraApplicationId) {
		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the quality declaration info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quality declaration info, or <code>null</code> if a matching quality declaration info could not be found
	 */
	@Override
	public QualityDeclarationInfo fetchBygetHsraById(
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

		if (result instanceof QualityDeclarationInfo) {
			QualityDeclarationInfo qualityDeclarationInfo =
				(QualityDeclarationInfo)result;

			if (hsraApplicationId !=
					qualityDeclarationInfo.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_QUALITYDECLARATIONINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<QualityDeclarationInfo> list = query.list();

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
								"QualityDeclarationInfoPersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QualityDeclarationInfo qualityDeclarationInfo = list.get(0);

					result = qualityDeclarationInfo;

					cacheResult(qualityDeclarationInfo);
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
			return (QualityDeclarationInfo)result;
		}
	}

	/**
	 * Removes the quality declaration info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the quality declaration info that was removed
	 */
	@Override
	public QualityDeclarationInfo removeBygetHsraById(long hsraApplicationId)
		throws NoSuchQualityDeclarationInfoException {

		QualityDeclarationInfo qualityDeclarationInfo = findBygetHsraById(
			hsraApplicationId);

		return remove(qualityDeclarationInfo);
	}

	/**
	 * Returns the number of quality declaration infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching quality declaration infos
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUALITYDECLARATIONINFO_WHERE);

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
		"qualityDeclarationInfo.hsraApplicationId = ?";

	public QualityDeclarationInfoPersistenceImpl() {
		setModelClass(QualityDeclarationInfo.class);

		setModelImplClass(QualityDeclarationInfoImpl.class);
		setModelPKClass(long.class);

		setTable(QualityDeclarationInfoTable.INSTANCE);
	}

	/**
	 * Caches the quality declaration info in the entity cache if it is enabled.
	 *
	 * @param qualityDeclarationInfo the quality declaration info
	 */
	@Override
	public void cacheResult(QualityDeclarationInfo qualityDeclarationInfo) {
		entityCache.putResult(
			QualityDeclarationInfoImpl.class,
			qualityDeclarationInfo.getPrimaryKey(), qualityDeclarationInfo);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {qualityDeclarationInfo.getHsraApplicationId()},
			qualityDeclarationInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the quality declaration infos in the entity cache if it is enabled.
	 *
	 * @param qualityDeclarationInfos the quality declaration infos
	 */
	@Override
	public void cacheResult(
		List<QualityDeclarationInfo> qualityDeclarationInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (qualityDeclarationInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QualityDeclarationInfo qualityDeclarationInfo :
				qualityDeclarationInfos) {

			if (entityCache.getResult(
					QualityDeclarationInfoImpl.class,
					qualityDeclarationInfo.getPrimaryKey()) == null) {

				cacheResult(qualityDeclarationInfo);
			}
		}
	}

	/**
	 * Clears the cache for all quality declaration infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QualityDeclarationInfoImpl.class);

		finderCache.clearCache(QualityDeclarationInfoImpl.class);
	}

	/**
	 * Clears the cache for the quality declaration info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QualityDeclarationInfo qualityDeclarationInfo) {
		entityCache.removeResult(
			QualityDeclarationInfoImpl.class, qualityDeclarationInfo);
	}

	@Override
	public void clearCache(
		List<QualityDeclarationInfo> qualityDeclarationInfos) {

		for (QualityDeclarationInfo qualityDeclarationInfo :
				qualityDeclarationInfos) {

			entityCache.removeResult(
				QualityDeclarationInfoImpl.class, qualityDeclarationInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QualityDeclarationInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				QualityDeclarationInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		QualityDeclarationInfoModelImpl qualityDeclarationInfoModelImpl) {

		Object[] args = new Object[] {
			qualityDeclarationInfoModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args,
			qualityDeclarationInfoModelImpl);
	}

	/**
	 * Creates a new quality declaration info with the primary key. Does not add the quality declaration info to the database.
	 *
	 * @param qualityDeclarationInfoId the primary key for the new quality declaration info
	 * @return the new quality declaration info
	 */
	@Override
	public QualityDeclarationInfo create(long qualityDeclarationInfoId) {
		QualityDeclarationInfo qualityDeclarationInfo =
			new QualityDeclarationInfoImpl();

		qualityDeclarationInfo.setNew(true);
		qualityDeclarationInfo.setPrimaryKey(qualityDeclarationInfoId);

		qualityDeclarationInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return qualityDeclarationInfo;
	}

	/**
	 * Removes the quality declaration info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualityDeclarationInfoId the primary key of the quality declaration info
	 * @return the quality declaration info that was removed
	 * @throws NoSuchQualityDeclarationInfoException if a quality declaration info with the primary key could not be found
	 */
	@Override
	public QualityDeclarationInfo remove(long qualityDeclarationInfoId)
		throws NoSuchQualityDeclarationInfoException {

		return remove((Serializable)qualityDeclarationInfoId);
	}

	/**
	 * Removes the quality declaration info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the quality declaration info
	 * @return the quality declaration info that was removed
	 * @throws NoSuchQualityDeclarationInfoException if a quality declaration info with the primary key could not be found
	 */
	@Override
	public QualityDeclarationInfo remove(Serializable primaryKey)
		throws NoSuchQualityDeclarationInfoException {

		Session session = null;

		try {
			session = openSession();

			QualityDeclarationInfo qualityDeclarationInfo =
				(QualityDeclarationInfo)session.get(
					QualityDeclarationInfoImpl.class, primaryKey);

			if (qualityDeclarationInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQualityDeclarationInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(qualityDeclarationInfo);
		}
		catch (NoSuchQualityDeclarationInfoException noSuchEntityException) {
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
	protected QualityDeclarationInfo removeImpl(
		QualityDeclarationInfo qualityDeclarationInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qualityDeclarationInfo)) {
				qualityDeclarationInfo = (QualityDeclarationInfo)session.get(
					QualityDeclarationInfoImpl.class,
					qualityDeclarationInfo.getPrimaryKeyObj());
			}

			if (qualityDeclarationInfo != null) {
				session.delete(qualityDeclarationInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (qualityDeclarationInfo != null) {
			clearCache(qualityDeclarationInfo);
		}

		return qualityDeclarationInfo;
	}

	@Override
	public QualityDeclarationInfo updateImpl(
		QualityDeclarationInfo qualityDeclarationInfo) {

		boolean isNew = qualityDeclarationInfo.isNew();

		if (!(qualityDeclarationInfo instanceof
				QualityDeclarationInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(qualityDeclarationInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					qualityDeclarationInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in qualityDeclarationInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QualityDeclarationInfo implementation " +
					qualityDeclarationInfo.getClass());
		}

		QualityDeclarationInfoModelImpl qualityDeclarationInfoModelImpl =
			(QualityDeclarationInfoModelImpl)qualityDeclarationInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (qualityDeclarationInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				qualityDeclarationInfo.setCreateDate(date);
			}
			else {
				qualityDeclarationInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!qualityDeclarationInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				qualityDeclarationInfo.setModifiedDate(date);
			}
			else {
				qualityDeclarationInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(qualityDeclarationInfo);
			}
			else {
				qualityDeclarationInfo = (QualityDeclarationInfo)session.merge(
					qualityDeclarationInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QualityDeclarationInfoImpl.class, qualityDeclarationInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(qualityDeclarationInfoModelImpl);

		if (isNew) {
			qualityDeclarationInfo.setNew(false);
		}

		qualityDeclarationInfo.resetOriginalValues();

		return qualityDeclarationInfo;
	}

	/**
	 * Returns the quality declaration info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the quality declaration info
	 * @return the quality declaration info
	 * @throws NoSuchQualityDeclarationInfoException if a quality declaration info with the primary key could not be found
	 */
	@Override
	public QualityDeclarationInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQualityDeclarationInfoException {

		QualityDeclarationInfo qualityDeclarationInfo = fetchByPrimaryKey(
			primaryKey);

		if (qualityDeclarationInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQualityDeclarationInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return qualityDeclarationInfo;
	}

	/**
	 * Returns the quality declaration info with the primary key or throws a <code>NoSuchQualityDeclarationInfoException</code> if it could not be found.
	 *
	 * @param qualityDeclarationInfoId the primary key of the quality declaration info
	 * @return the quality declaration info
	 * @throws NoSuchQualityDeclarationInfoException if a quality declaration info with the primary key could not be found
	 */
	@Override
	public QualityDeclarationInfo findByPrimaryKey(
			long qualityDeclarationInfoId)
		throws NoSuchQualityDeclarationInfoException {

		return findByPrimaryKey((Serializable)qualityDeclarationInfoId);
	}

	/**
	 * Returns the quality declaration info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualityDeclarationInfoId the primary key of the quality declaration info
	 * @return the quality declaration info, or <code>null</code> if a quality declaration info with the primary key could not be found
	 */
	@Override
	public QualityDeclarationInfo fetchByPrimaryKey(
		long qualityDeclarationInfoId) {

		return fetchByPrimaryKey((Serializable)qualityDeclarationInfoId);
	}

	/**
	 * Returns all the quality declaration infos.
	 *
	 * @return the quality declaration infos
	 */
	@Override
	public List<QualityDeclarationInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quality declaration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityDeclarationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality declaration infos
	 * @param end the upper bound of the range of quality declaration infos (not inclusive)
	 * @return the range of quality declaration infos
	 */
	@Override
	public List<QualityDeclarationInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the quality declaration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityDeclarationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality declaration infos
	 * @param end the upper bound of the range of quality declaration infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quality declaration infos
	 */
	@Override
	public List<QualityDeclarationInfo> findAll(
		int start, int end,
		OrderByComparator<QualityDeclarationInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quality declaration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityDeclarationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality declaration infos
	 * @param end the upper bound of the range of quality declaration infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quality declaration infos
	 */
	@Override
	public List<QualityDeclarationInfo> findAll(
		int start, int end,
		OrderByComparator<QualityDeclarationInfo> orderByComparator,
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

		List<QualityDeclarationInfo> list = null;

		if (useFinderCache) {
			list = (List<QualityDeclarationInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUALITYDECLARATIONINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUALITYDECLARATIONINFO;

				sql = sql.concat(QualityDeclarationInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QualityDeclarationInfo>)QueryUtil.list(
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
	 * Removes all the quality declaration infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QualityDeclarationInfo qualityDeclarationInfo : findAll()) {
			remove(qualityDeclarationInfo);
		}
	}

	/**
	 * Returns the number of quality declaration infos.
	 *
	 * @return the number of quality declaration infos
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
					_SQL_COUNT_QUALITYDECLARATIONINFO);

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
		return "qualityDeclarationInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUALITYDECLARATIONINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QualityDeclarationInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the quality declaration info persistence.
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

		QualityDeclarationInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QualityDeclarationInfoUtil.setPersistence(null);

		entityCache.removeCache(QualityDeclarationInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_QUALITYDECLARATIONINFO =
		"SELECT qualityDeclarationInfo FROM QualityDeclarationInfo qualityDeclarationInfo";

	private static final String _SQL_SELECT_QUALITYDECLARATIONINFO_WHERE =
		"SELECT qualityDeclarationInfo FROM QualityDeclarationInfo qualityDeclarationInfo WHERE ";

	private static final String _SQL_COUNT_QUALITYDECLARATIONINFO =
		"SELECT COUNT(qualityDeclarationInfo) FROM QualityDeclarationInfo qualityDeclarationInfo";

	private static final String _SQL_COUNT_QUALITYDECLARATIONINFO_WHERE =
		"SELECT COUNT(qualityDeclarationInfo) FROM QualityDeclarationInfo qualityDeclarationInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"qualityDeclarationInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QualityDeclarationInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QualityDeclarationInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QualityDeclarationInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}