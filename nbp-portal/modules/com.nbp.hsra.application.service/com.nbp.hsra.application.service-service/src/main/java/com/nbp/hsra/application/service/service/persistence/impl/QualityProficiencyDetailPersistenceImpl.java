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

import com.nbp.hsra.application.service.exception.NoSuchQualityProficiencyDetailException;
import com.nbp.hsra.application.service.model.QualityProficiencyDetail;
import com.nbp.hsra.application.service.model.QualityProficiencyDetailTable;
import com.nbp.hsra.application.service.model.impl.QualityProficiencyDetailImpl;
import com.nbp.hsra.application.service.model.impl.QualityProficiencyDetailModelImpl;
import com.nbp.hsra.application.service.service.persistence.QualityProficiencyDetailPersistence;
import com.nbp.hsra.application.service.service.persistence.QualityProficiencyDetailUtil;
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
 * The persistence implementation for the quality proficiency detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QualityProficiencyDetailPersistence.class)
public class QualityProficiencyDetailPersistenceImpl
	extends BasePersistenceImpl<QualityProficiencyDetail>
	implements QualityProficiencyDetailPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QualityProficiencyDetailUtil</code> to access the quality proficiency detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QualityProficiencyDetailImpl.class.getName();

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
	 * Returns the quality proficiency detail where hsraApplicationId = &#63; or throws a <code>NoSuchQualityProficiencyDetailException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality proficiency detail
	 * @throws NoSuchQualityProficiencyDetailException if a matching quality proficiency detail could not be found
	 */
	@Override
	public QualityProficiencyDetail findBygetHsraById(long hsraApplicationId)
		throws NoSuchQualityProficiencyDetailException {

		QualityProficiencyDetail qualityProficiencyDetail = fetchBygetHsraById(
			hsraApplicationId);

		if (qualityProficiencyDetail == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQualityProficiencyDetailException(sb.toString());
		}

		return qualityProficiencyDetail;
	}

	/**
	 * Returns the quality proficiency detail where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality proficiency detail, or <code>null</code> if a matching quality proficiency detail could not be found
	 */
	@Override
	public QualityProficiencyDetail fetchBygetHsraById(long hsraApplicationId) {
		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the quality proficiency detail where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quality proficiency detail, or <code>null</code> if a matching quality proficiency detail could not be found
	 */
	@Override
	public QualityProficiencyDetail fetchBygetHsraById(
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

		if (result instanceof QualityProficiencyDetail) {
			QualityProficiencyDetail qualityProficiencyDetail =
				(QualityProficiencyDetail)result;

			if (hsraApplicationId !=
					qualityProficiencyDetail.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_QUALITYPROFICIENCYDETAIL_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<QualityProficiencyDetail> list = query.list();

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
								"QualityProficiencyDetailPersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QualityProficiencyDetail qualityProficiencyDetail =
						list.get(0);

					result = qualityProficiencyDetail;

					cacheResult(qualityProficiencyDetail);
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
			return (QualityProficiencyDetail)result;
		}
	}

	/**
	 * Removes the quality proficiency detail where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the quality proficiency detail that was removed
	 */
	@Override
	public QualityProficiencyDetail removeBygetHsraById(long hsraApplicationId)
		throws NoSuchQualityProficiencyDetailException {

		QualityProficiencyDetail qualityProficiencyDetail = findBygetHsraById(
			hsraApplicationId);

		return remove(qualityProficiencyDetail);
	}

	/**
	 * Returns the number of quality proficiency details where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching quality proficiency details
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUALITYPROFICIENCYDETAIL_WHERE);

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
		"qualityProficiencyDetail.hsraApplicationId = ?";

	public QualityProficiencyDetailPersistenceImpl() {
		setModelClass(QualityProficiencyDetail.class);

		setModelImplClass(QualityProficiencyDetailImpl.class);
		setModelPKClass(long.class);

		setTable(QualityProficiencyDetailTable.INSTANCE);
	}

	/**
	 * Caches the quality proficiency detail in the entity cache if it is enabled.
	 *
	 * @param qualityProficiencyDetail the quality proficiency detail
	 */
	@Override
	public void cacheResult(QualityProficiencyDetail qualityProficiencyDetail) {
		entityCache.putResult(
			QualityProficiencyDetailImpl.class,
			qualityProficiencyDetail.getPrimaryKey(), qualityProficiencyDetail);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {qualityProficiencyDetail.getHsraApplicationId()},
			qualityProficiencyDetail);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the quality proficiency details in the entity cache if it is enabled.
	 *
	 * @param qualityProficiencyDetails the quality proficiency details
	 */
	@Override
	public void cacheResult(
		List<QualityProficiencyDetail> qualityProficiencyDetails) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (qualityProficiencyDetails.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QualityProficiencyDetail qualityProficiencyDetail :
				qualityProficiencyDetails) {

			if (entityCache.getResult(
					QualityProficiencyDetailImpl.class,
					qualityProficiencyDetail.getPrimaryKey()) == null) {

				cacheResult(qualityProficiencyDetail);
			}
		}
	}

	/**
	 * Clears the cache for all quality proficiency details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QualityProficiencyDetailImpl.class);

		finderCache.clearCache(QualityProficiencyDetailImpl.class);
	}

	/**
	 * Clears the cache for the quality proficiency detail.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QualityProficiencyDetail qualityProficiencyDetail) {
		entityCache.removeResult(
			QualityProficiencyDetailImpl.class, qualityProficiencyDetail);
	}

	@Override
	public void clearCache(
		List<QualityProficiencyDetail> qualityProficiencyDetails) {

		for (QualityProficiencyDetail qualityProficiencyDetail :
				qualityProficiencyDetails) {

			entityCache.removeResult(
				QualityProficiencyDetailImpl.class, qualityProficiencyDetail);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QualityProficiencyDetailImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				QualityProficiencyDetailImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		QualityProficiencyDetailModelImpl qualityProficiencyDetailModelImpl) {

		Object[] args = new Object[] {
			qualityProficiencyDetailModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args,
			qualityProficiencyDetailModelImpl);
	}

	/**
	 * Creates a new quality proficiency detail with the primary key. Does not add the quality proficiency detail to the database.
	 *
	 * @param qualityProficiDetailId the primary key for the new quality proficiency detail
	 * @return the new quality proficiency detail
	 */
	@Override
	public QualityProficiencyDetail create(long qualityProficiDetailId) {
		QualityProficiencyDetail qualityProficiencyDetail =
			new QualityProficiencyDetailImpl();

		qualityProficiencyDetail.setNew(true);
		qualityProficiencyDetail.setPrimaryKey(qualityProficiDetailId);

		qualityProficiencyDetail.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return qualityProficiencyDetail;
	}

	/**
	 * Removes the quality proficiency detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualityProficiDetailId the primary key of the quality proficiency detail
	 * @return the quality proficiency detail that was removed
	 * @throws NoSuchQualityProficiencyDetailException if a quality proficiency detail with the primary key could not be found
	 */
	@Override
	public QualityProficiencyDetail remove(long qualityProficiDetailId)
		throws NoSuchQualityProficiencyDetailException {

		return remove((Serializable)qualityProficiDetailId);
	}

	/**
	 * Removes the quality proficiency detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the quality proficiency detail
	 * @return the quality proficiency detail that was removed
	 * @throws NoSuchQualityProficiencyDetailException if a quality proficiency detail with the primary key could not be found
	 */
	@Override
	public QualityProficiencyDetail remove(Serializable primaryKey)
		throws NoSuchQualityProficiencyDetailException {

		Session session = null;

		try {
			session = openSession();

			QualityProficiencyDetail qualityProficiencyDetail =
				(QualityProficiencyDetail)session.get(
					QualityProficiencyDetailImpl.class, primaryKey);

			if (qualityProficiencyDetail == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQualityProficiencyDetailException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(qualityProficiencyDetail);
		}
		catch (NoSuchQualityProficiencyDetailException noSuchEntityException) {
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
	protected QualityProficiencyDetail removeImpl(
		QualityProficiencyDetail qualityProficiencyDetail) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qualityProficiencyDetail)) {
				qualityProficiencyDetail =
					(QualityProficiencyDetail)session.get(
						QualityProficiencyDetailImpl.class,
						qualityProficiencyDetail.getPrimaryKeyObj());
			}

			if (qualityProficiencyDetail != null) {
				session.delete(qualityProficiencyDetail);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (qualityProficiencyDetail != null) {
			clearCache(qualityProficiencyDetail);
		}

		return qualityProficiencyDetail;
	}

	@Override
	public QualityProficiencyDetail updateImpl(
		QualityProficiencyDetail qualityProficiencyDetail) {

		boolean isNew = qualityProficiencyDetail.isNew();

		if (!(qualityProficiencyDetail instanceof
				QualityProficiencyDetailModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(qualityProficiencyDetail.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					qualityProficiencyDetail);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in qualityProficiencyDetail proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QualityProficiencyDetail implementation " +
					qualityProficiencyDetail.getClass());
		}

		QualityProficiencyDetailModelImpl qualityProficiencyDetailModelImpl =
			(QualityProficiencyDetailModelImpl)qualityProficiencyDetail;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (qualityProficiencyDetail.getCreateDate() == null)) {
			if (serviceContext == null) {
				qualityProficiencyDetail.setCreateDate(date);
			}
			else {
				qualityProficiencyDetail.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!qualityProficiencyDetailModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				qualityProficiencyDetail.setModifiedDate(date);
			}
			else {
				qualityProficiencyDetail.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(qualityProficiencyDetail);
			}
			else {
				qualityProficiencyDetail =
					(QualityProficiencyDetail)session.merge(
						qualityProficiencyDetail);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QualityProficiencyDetailImpl.class,
			qualityProficiencyDetailModelImpl, false, true);

		cacheUniqueFindersCache(qualityProficiencyDetailModelImpl);

		if (isNew) {
			qualityProficiencyDetail.setNew(false);
		}

		qualityProficiencyDetail.resetOriginalValues();

		return qualityProficiencyDetail;
	}

	/**
	 * Returns the quality proficiency detail with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the quality proficiency detail
	 * @return the quality proficiency detail
	 * @throws NoSuchQualityProficiencyDetailException if a quality proficiency detail with the primary key could not be found
	 */
	@Override
	public QualityProficiencyDetail findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQualityProficiencyDetailException {

		QualityProficiencyDetail qualityProficiencyDetail = fetchByPrimaryKey(
			primaryKey);

		if (qualityProficiencyDetail == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQualityProficiencyDetailException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return qualityProficiencyDetail;
	}

	/**
	 * Returns the quality proficiency detail with the primary key or throws a <code>NoSuchQualityProficiencyDetailException</code> if it could not be found.
	 *
	 * @param qualityProficiDetailId the primary key of the quality proficiency detail
	 * @return the quality proficiency detail
	 * @throws NoSuchQualityProficiencyDetailException if a quality proficiency detail with the primary key could not be found
	 */
	@Override
	public QualityProficiencyDetail findByPrimaryKey(
			long qualityProficiDetailId)
		throws NoSuchQualityProficiencyDetailException {

		return findByPrimaryKey((Serializable)qualityProficiDetailId);
	}

	/**
	 * Returns the quality proficiency detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualityProficiDetailId the primary key of the quality proficiency detail
	 * @return the quality proficiency detail, or <code>null</code> if a quality proficiency detail with the primary key could not be found
	 */
	@Override
	public QualityProficiencyDetail fetchByPrimaryKey(
		long qualityProficiDetailId) {

		return fetchByPrimaryKey((Serializable)qualityProficiDetailId);
	}

	/**
	 * Returns all the quality proficiency details.
	 *
	 * @return the quality proficiency details
	 */
	@Override
	public List<QualityProficiencyDetail> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quality proficiency details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityProficiencyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality proficiency details
	 * @param end the upper bound of the range of quality proficiency details (not inclusive)
	 * @return the range of quality proficiency details
	 */
	@Override
	public List<QualityProficiencyDetail> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the quality proficiency details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityProficiencyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality proficiency details
	 * @param end the upper bound of the range of quality proficiency details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quality proficiency details
	 */
	@Override
	public List<QualityProficiencyDetail> findAll(
		int start, int end,
		OrderByComparator<QualityProficiencyDetail> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quality proficiency details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityProficiencyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality proficiency details
	 * @param end the upper bound of the range of quality proficiency details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quality proficiency details
	 */
	@Override
	public List<QualityProficiencyDetail> findAll(
		int start, int end,
		OrderByComparator<QualityProficiencyDetail> orderByComparator,
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

		List<QualityProficiencyDetail> list = null;

		if (useFinderCache) {
			list = (List<QualityProficiencyDetail>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUALITYPROFICIENCYDETAIL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUALITYPROFICIENCYDETAIL;

				sql = sql.concat(
					QualityProficiencyDetailModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QualityProficiencyDetail>)QueryUtil.list(
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
	 * Removes all the quality proficiency details from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QualityProficiencyDetail qualityProficiencyDetail : findAll()) {
			remove(qualityProficiencyDetail);
		}
	}

	/**
	 * Returns the number of quality proficiency details.
	 *
	 * @return the number of quality proficiency details
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
					_SQL_COUNT_QUALITYPROFICIENCYDETAIL);

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
		return "qualityProficiDetailId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUALITYPROFICIENCYDETAIL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QualityProficiencyDetailModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the quality proficiency detail persistence.
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

		QualityProficiencyDetailUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QualityProficiencyDetailUtil.setPersistence(null);

		entityCache.removeCache(QualityProficiencyDetailImpl.class.getName());
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

	private static final String _SQL_SELECT_QUALITYPROFICIENCYDETAIL =
		"SELECT qualityProficiencyDetail FROM QualityProficiencyDetail qualityProficiencyDetail";

	private static final String _SQL_SELECT_QUALITYPROFICIENCYDETAIL_WHERE =
		"SELECT qualityProficiencyDetail FROM QualityProficiencyDetail qualityProficiencyDetail WHERE ";

	private static final String _SQL_COUNT_QUALITYPROFICIENCYDETAIL =
		"SELECT COUNT(qualityProficiencyDetail) FROM QualityProficiencyDetail qualityProficiencyDetail";

	private static final String _SQL_COUNT_QUALITYPROFICIENCYDETAIL_WHERE =
		"SELECT COUNT(qualityProficiencyDetail) FROM QualityProficiencyDetail qualityProficiencyDetail WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"qualityProficiencyDetail.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QualityProficiencyDetail exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QualityProficiencyDetail exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QualityProficiencyDetailPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}