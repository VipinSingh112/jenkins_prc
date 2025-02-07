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

import com.nbp.hsra.application.service.exception.NoSuchQualityEmploymentInfoException;
import com.nbp.hsra.application.service.model.QualityEmploymentInfo;
import com.nbp.hsra.application.service.model.QualityEmploymentInfoTable;
import com.nbp.hsra.application.service.model.impl.QualityEmploymentInfoImpl;
import com.nbp.hsra.application.service.model.impl.QualityEmploymentInfoModelImpl;
import com.nbp.hsra.application.service.service.persistence.QualityEmploymentInfoPersistence;
import com.nbp.hsra.application.service.service.persistence.QualityEmploymentInfoUtil;
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
 * The persistence implementation for the quality employment info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QualityEmploymentInfoPersistence.class)
public class QualityEmploymentInfoPersistenceImpl
	extends BasePersistenceImpl<QualityEmploymentInfo>
	implements QualityEmploymentInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QualityEmploymentInfoUtil</code> to access the quality employment info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QualityEmploymentInfoImpl.class.getName();

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
	 * Returns the quality employment info where hsraApplicationId = &#63; or throws a <code>NoSuchQualityEmploymentInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality employment info
	 * @throws NoSuchQualityEmploymentInfoException if a matching quality employment info could not be found
	 */
	@Override
	public QualityEmploymentInfo findBygetHsraById(long hsraApplicationId)
		throws NoSuchQualityEmploymentInfoException {

		QualityEmploymentInfo qualityEmploymentInfo = fetchBygetHsraById(
			hsraApplicationId);

		if (qualityEmploymentInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQualityEmploymentInfoException(sb.toString());
		}

		return qualityEmploymentInfo;
	}

	/**
	 * Returns the quality employment info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality employment info, or <code>null</code> if a matching quality employment info could not be found
	 */
	@Override
	public QualityEmploymentInfo fetchBygetHsraById(long hsraApplicationId) {
		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the quality employment info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quality employment info, or <code>null</code> if a matching quality employment info could not be found
	 */
	@Override
	public QualityEmploymentInfo fetchBygetHsraById(
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

		if (result instanceof QualityEmploymentInfo) {
			QualityEmploymentInfo qualityEmploymentInfo =
				(QualityEmploymentInfo)result;

			if (hsraApplicationId !=
					qualityEmploymentInfo.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_QUALITYEMPLOYMENTINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<QualityEmploymentInfo> list = query.list();

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
								"QualityEmploymentInfoPersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QualityEmploymentInfo qualityEmploymentInfo = list.get(0);

					result = qualityEmploymentInfo;

					cacheResult(qualityEmploymentInfo);
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
			return (QualityEmploymentInfo)result;
		}
	}

	/**
	 * Removes the quality employment info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the quality employment info that was removed
	 */
	@Override
	public QualityEmploymentInfo removeBygetHsraById(long hsraApplicationId)
		throws NoSuchQualityEmploymentInfoException {

		QualityEmploymentInfo qualityEmploymentInfo = findBygetHsraById(
			hsraApplicationId);

		return remove(qualityEmploymentInfo);
	}

	/**
	 * Returns the number of quality employment infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching quality employment infos
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUALITYEMPLOYMENTINFO_WHERE);

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
		"qualityEmploymentInfo.hsraApplicationId = ?";

	public QualityEmploymentInfoPersistenceImpl() {
		setModelClass(QualityEmploymentInfo.class);

		setModelImplClass(QualityEmploymentInfoImpl.class);
		setModelPKClass(long.class);

		setTable(QualityEmploymentInfoTable.INSTANCE);
	}

	/**
	 * Caches the quality employment info in the entity cache if it is enabled.
	 *
	 * @param qualityEmploymentInfo the quality employment info
	 */
	@Override
	public void cacheResult(QualityEmploymentInfo qualityEmploymentInfo) {
		entityCache.putResult(
			QualityEmploymentInfoImpl.class,
			qualityEmploymentInfo.getPrimaryKey(), qualityEmploymentInfo);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {qualityEmploymentInfo.getHsraApplicationId()},
			qualityEmploymentInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the quality employment infos in the entity cache if it is enabled.
	 *
	 * @param qualityEmploymentInfos the quality employment infos
	 */
	@Override
	public void cacheResult(
		List<QualityEmploymentInfo> qualityEmploymentInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (qualityEmploymentInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QualityEmploymentInfo qualityEmploymentInfo :
				qualityEmploymentInfos) {

			if (entityCache.getResult(
					QualityEmploymentInfoImpl.class,
					qualityEmploymentInfo.getPrimaryKey()) == null) {

				cacheResult(qualityEmploymentInfo);
			}
		}
	}

	/**
	 * Clears the cache for all quality employment infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QualityEmploymentInfoImpl.class);

		finderCache.clearCache(QualityEmploymentInfoImpl.class);
	}

	/**
	 * Clears the cache for the quality employment info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QualityEmploymentInfo qualityEmploymentInfo) {
		entityCache.removeResult(
			QualityEmploymentInfoImpl.class, qualityEmploymentInfo);
	}

	@Override
	public void clearCache(List<QualityEmploymentInfo> qualityEmploymentInfos) {
		for (QualityEmploymentInfo qualityEmploymentInfo :
				qualityEmploymentInfos) {

			entityCache.removeResult(
				QualityEmploymentInfoImpl.class, qualityEmploymentInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QualityEmploymentInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				QualityEmploymentInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		QualityEmploymentInfoModelImpl qualityEmploymentInfoModelImpl) {

		Object[] args = new Object[] {
			qualityEmploymentInfoModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args,
			qualityEmploymentInfoModelImpl);
	}

	/**
	 * Creates a new quality employment info with the primary key. Does not add the quality employment info to the database.
	 *
	 * @param qualityEmploymentInfoId the primary key for the new quality employment info
	 * @return the new quality employment info
	 */
	@Override
	public QualityEmploymentInfo create(long qualityEmploymentInfoId) {
		QualityEmploymentInfo qualityEmploymentInfo =
			new QualityEmploymentInfoImpl();

		qualityEmploymentInfo.setNew(true);
		qualityEmploymentInfo.setPrimaryKey(qualityEmploymentInfoId);

		qualityEmploymentInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return qualityEmploymentInfo;
	}

	/**
	 * Removes the quality employment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualityEmploymentInfoId the primary key of the quality employment info
	 * @return the quality employment info that was removed
	 * @throws NoSuchQualityEmploymentInfoException if a quality employment info with the primary key could not be found
	 */
	@Override
	public QualityEmploymentInfo remove(long qualityEmploymentInfoId)
		throws NoSuchQualityEmploymentInfoException {

		return remove((Serializable)qualityEmploymentInfoId);
	}

	/**
	 * Removes the quality employment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the quality employment info
	 * @return the quality employment info that was removed
	 * @throws NoSuchQualityEmploymentInfoException if a quality employment info with the primary key could not be found
	 */
	@Override
	public QualityEmploymentInfo remove(Serializable primaryKey)
		throws NoSuchQualityEmploymentInfoException {

		Session session = null;

		try {
			session = openSession();

			QualityEmploymentInfo qualityEmploymentInfo =
				(QualityEmploymentInfo)session.get(
					QualityEmploymentInfoImpl.class, primaryKey);

			if (qualityEmploymentInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQualityEmploymentInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(qualityEmploymentInfo);
		}
		catch (NoSuchQualityEmploymentInfoException noSuchEntityException) {
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
	protected QualityEmploymentInfo removeImpl(
		QualityEmploymentInfo qualityEmploymentInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qualityEmploymentInfo)) {
				qualityEmploymentInfo = (QualityEmploymentInfo)session.get(
					QualityEmploymentInfoImpl.class,
					qualityEmploymentInfo.getPrimaryKeyObj());
			}

			if (qualityEmploymentInfo != null) {
				session.delete(qualityEmploymentInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (qualityEmploymentInfo != null) {
			clearCache(qualityEmploymentInfo);
		}

		return qualityEmploymentInfo;
	}

	@Override
	public QualityEmploymentInfo updateImpl(
		QualityEmploymentInfo qualityEmploymentInfo) {

		boolean isNew = qualityEmploymentInfo.isNew();

		if (!(qualityEmploymentInfo instanceof
				QualityEmploymentInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(qualityEmploymentInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					qualityEmploymentInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in qualityEmploymentInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QualityEmploymentInfo implementation " +
					qualityEmploymentInfo.getClass());
		}

		QualityEmploymentInfoModelImpl qualityEmploymentInfoModelImpl =
			(QualityEmploymentInfoModelImpl)qualityEmploymentInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (qualityEmploymentInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				qualityEmploymentInfo.setCreateDate(date);
			}
			else {
				qualityEmploymentInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!qualityEmploymentInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				qualityEmploymentInfo.setModifiedDate(date);
			}
			else {
				qualityEmploymentInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(qualityEmploymentInfo);
			}
			else {
				qualityEmploymentInfo = (QualityEmploymentInfo)session.merge(
					qualityEmploymentInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QualityEmploymentInfoImpl.class, qualityEmploymentInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(qualityEmploymentInfoModelImpl);

		if (isNew) {
			qualityEmploymentInfo.setNew(false);
		}

		qualityEmploymentInfo.resetOriginalValues();

		return qualityEmploymentInfo;
	}

	/**
	 * Returns the quality employment info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the quality employment info
	 * @return the quality employment info
	 * @throws NoSuchQualityEmploymentInfoException if a quality employment info with the primary key could not be found
	 */
	@Override
	public QualityEmploymentInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQualityEmploymentInfoException {

		QualityEmploymentInfo qualityEmploymentInfo = fetchByPrimaryKey(
			primaryKey);

		if (qualityEmploymentInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQualityEmploymentInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return qualityEmploymentInfo;
	}

	/**
	 * Returns the quality employment info with the primary key or throws a <code>NoSuchQualityEmploymentInfoException</code> if it could not be found.
	 *
	 * @param qualityEmploymentInfoId the primary key of the quality employment info
	 * @return the quality employment info
	 * @throws NoSuchQualityEmploymentInfoException if a quality employment info with the primary key could not be found
	 */
	@Override
	public QualityEmploymentInfo findByPrimaryKey(long qualityEmploymentInfoId)
		throws NoSuchQualityEmploymentInfoException {

		return findByPrimaryKey((Serializable)qualityEmploymentInfoId);
	}

	/**
	 * Returns the quality employment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualityEmploymentInfoId the primary key of the quality employment info
	 * @return the quality employment info, or <code>null</code> if a quality employment info with the primary key could not be found
	 */
	@Override
	public QualityEmploymentInfo fetchByPrimaryKey(
		long qualityEmploymentInfoId) {

		return fetchByPrimaryKey((Serializable)qualityEmploymentInfoId);
	}

	/**
	 * Returns all the quality employment infos.
	 *
	 * @return the quality employment infos
	 */
	@Override
	public List<QualityEmploymentInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quality employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality employment infos
	 * @param end the upper bound of the range of quality employment infos (not inclusive)
	 * @return the range of quality employment infos
	 */
	@Override
	public List<QualityEmploymentInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the quality employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality employment infos
	 * @param end the upper bound of the range of quality employment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quality employment infos
	 */
	@Override
	public List<QualityEmploymentInfo> findAll(
		int start, int end,
		OrderByComparator<QualityEmploymentInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quality employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality employment infos
	 * @param end the upper bound of the range of quality employment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quality employment infos
	 */
	@Override
	public List<QualityEmploymentInfo> findAll(
		int start, int end,
		OrderByComparator<QualityEmploymentInfo> orderByComparator,
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

		List<QualityEmploymentInfo> list = null;

		if (useFinderCache) {
			list = (List<QualityEmploymentInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUALITYEMPLOYMENTINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUALITYEMPLOYMENTINFO;

				sql = sql.concat(QualityEmploymentInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QualityEmploymentInfo>)QueryUtil.list(
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
	 * Removes all the quality employment infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QualityEmploymentInfo qualityEmploymentInfo : findAll()) {
			remove(qualityEmploymentInfo);
		}
	}

	/**
	 * Returns the number of quality employment infos.
	 *
	 * @return the number of quality employment infos
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
					_SQL_COUNT_QUALITYEMPLOYMENTINFO);

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
		return "qualityEmploymentInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUALITYEMPLOYMENTINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QualityEmploymentInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the quality employment info persistence.
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

		QualityEmploymentInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QualityEmploymentInfoUtil.setPersistence(null);

		entityCache.removeCache(QualityEmploymentInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_QUALITYEMPLOYMENTINFO =
		"SELECT qualityEmploymentInfo FROM QualityEmploymentInfo qualityEmploymentInfo";

	private static final String _SQL_SELECT_QUALITYEMPLOYMENTINFO_WHERE =
		"SELECT qualityEmploymentInfo FROM QualityEmploymentInfo qualityEmploymentInfo WHERE ";

	private static final String _SQL_COUNT_QUALITYEMPLOYMENTINFO =
		"SELECT COUNT(qualityEmploymentInfo) FROM QualityEmploymentInfo qualityEmploymentInfo";

	private static final String _SQL_COUNT_QUALITYEMPLOYMENTINFO_WHERE =
		"SELECT COUNT(qualityEmploymentInfo) FROM QualityEmploymentInfo qualityEmploymentInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"qualityEmploymentInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QualityEmploymentInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QualityEmploymentInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QualityEmploymentInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}