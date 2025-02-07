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

import com.nbp.hsra.application.service.exception.NoSuchQualityApplicantDetailException;
import com.nbp.hsra.application.service.model.QualityApplicantDetail;
import com.nbp.hsra.application.service.model.QualityApplicantDetailTable;
import com.nbp.hsra.application.service.model.impl.QualityApplicantDetailImpl;
import com.nbp.hsra.application.service.model.impl.QualityApplicantDetailModelImpl;
import com.nbp.hsra.application.service.service.persistence.QualityApplicantDetailPersistence;
import com.nbp.hsra.application.service.service.persistence.QualityApplicantDetailUtil;
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
 * The persistence implementation for the quality applicant detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QualityApplicantDetailPersistence.class)
public class QualityApplicantDetailPersistenceImpl
	extends BasePersistenceImpl<QualityApplicantDetail>
	implements QualityApplicantDetailPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QualityApplicantDetailUtil</code> to access the quality applicant detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QualityApplicantDetailImpl.class.getName();

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
	 * Returns the quality applicant detail where hsraApplicationId = &#63; or throws a <code>NoSuchQualityApplicantDetailException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality applicant detail
	 * @throws NoSuchQualityApplicantDetailException if a matching quality applicant detail could not be found
	 */
	@Override
	public QualityApplicantDetail findBygetHsraById(long hsraApplicationId)
		throws NoSuchQualityApplicantDetailException {

		QualityApplicantDetail qualityApplicantDetail = fetchBygetHsraById(
			hsraApplicationId);

		if (qualityApplicantDetail == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQualityApplicantDetailException(sb.toString());
		}

		return qualityApplicantDetail;
	}

	/**
	 * Returns the quality applicant detail where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality applicant detail, or <code>null</code> if a matching quality applicant detail could not be found
	 */
	@Override
	public QualityApplicantDetail fetchBygetHsraById(long hsraApplicationId) {
		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the quality applicant detail where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quality applicant detail, or <code>null</code> if a matching quality applicant detail could not be found
	 */
	@Override
	public QualityApplicantDetail fetchBygetHsraById(
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

		if (result instanceof QualityApplicantDetail) {
			QualityApplicantDetail qualityApplicantDetail =
				(QualityApplicantDetail)result;

			if (hsraApplicationId !=
					qualityApplicantDetail.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_QUALITYAPPLICANTDETAIL_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<QualityApplicantDetail> list = query.list();

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
								"QualityApplicantDetailPersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QualityApplicantDetail qualityApplicantDetail = list.get(0);

					result = qualityApplicantDetail;

					cacheResult(qualityApplicantDetail);
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
			return (QualityApplicantDetail)result;
		}
	}

	/**
	 * Removes the quality applicant detail where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the quality applicant detail that was removed
	 */
	@Override
	public QualityApplicantDetail removeBygetHsraById(long hsraApplicationId)
		throws NoSuchQualityApplicantDetailException {

		QualityApplicantDetail qualityApplicantDetail = findBygetHsraById(
			hsraApplicationId);

		return remove(qualityApplicantDetail);
	}

	/**
	 * Returns the number of quality applicant details where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching quality applicant details
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUALITYAPPLICANTDETAIL_WHERE);

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
		"qualityApplicantDetail.hsraApplicationId = ?";

	public QualityApplicantDetailPersistenceImpl() {
		setModelClass(QualityApplicantDetail.class);

		setModelImplClass(QualityApplicantDetailImpl.class);
		setModelPKClass(long.class);

		setTable(QualityApplicantDetailTable.INSTANCE);
	}

	/**
	 * Caches the quality applicant detail in the entity cache if it is enabled.
	 *
	 * @param qualityApplicantDetail the quality applicant detail
	 */
	@Override
	public void cacheResult(QualityApplicantDetail qualityApplicantDetail) {
		entityCache.putResult(
			QualityApplicantDetailImpl.class,
			qualityApplicantDetail.getPrimaryKey(), qualityApplicantDetail);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {qualityApplicantDetail.getHsraApplicationId()},
			qualityApplicantDetail);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the quality applicant details in the entity cache if it is enabled.
	 *
	 * @param qualityApplicantDetails the quality applicant details
	 */
	@Override
	public void cacheResult(
		List<QualityApplicantDetail> qualityApplicantDetails) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (qualityApplicantDetails.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QualityApplicantDetail qualityApplicantDetail :
				qualityApplicantDetails) {

			if (entityCache.getResult(
					QualityApplicantDetailImpl.class,
					qualityApplicantDetail.getPrimaryKey()) == null) {

				cacheResult(qualityApplicantDetail);
			}
		}
	}

	/**
	 * Clears the cache for all quality applicant details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QualityApplicantDetailImpl.class);

		finderCache.clearCache(QualityApplicantDetailImpl.class);
	}

	/**
	 * Clears the cache for the quality applicant detail.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QualityApplicantDetail qualityApplicantDetail) {
		entityCache.removeResult(
			QualityApplicantDetailImpl.class, qualityApplicantDetail);
	}

	@Override
	public void clearCache(
		List<QualityApplicantDetail> qualityApplicantDetails) {

		for (QualityApplicantDetail qualityApplicantDetail :
				qualityApplicantDetails) {

			entityCache.removeResult(
				QualityApplicantDetailImpl.class, qualityApplicantDetail);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QualityApplicantDetailImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				QualityApplicantDetailImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		QualityApplicantDetailModelImpl qualityApplicantDetailModelImpl) {

		Object[] args = new Object[] {
			qualityApplicantDetailModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args,
			qualityApplicantDetailModelImpl);
	}

	/**
	 * Creates a new quality applicant detail with the primary key. Does not add the quality applicant detail to the database.
	 *
	 * @param qualityApplicantDetailId the primary key for the new quality applicant detail
	 * @return the new quality applicant detail
	 */
	@Override
	public QualityApplicantDetail create(long qualityApplicantDetailId) {
		QualityApplicantDetail qualityApplicantDetail =
			new QualityApplicantDetailImpl();

		qualityApplicantDetail.setNew(true);
		qualityApplicantDetail.setPrimaryKey(qualityApplicantDetailId);

		qualityApplicantDetail.setCompanyId(CompanyThreadLocal.getCompanyId());

		return qualityApplicantDetail;
	}

	/**
	 * Removes the quality applicant detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualityApplicantDetailId the primary key of the quality applicant detail
	 * @return the quality applicant detail that was removed
	 * @throws NoSuchQualityApplicantDetailException if a quality applicant detail with the primary key could not be found
	 */
	@Override
	public QualityApplicantDetail remove(long qualityApplicantDetailId)
		throws NoSuchQualityApplicantDetailException {

		return remove((Serializable)qualityApplicantDetailId);
	}

	/**
	 * Removes the quality applicant detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the quality applicant detail
	 * @return the quality applicant detail that was removed
	 * @throws NoSuchQualityApplicantDetailException if a quality applicant detail with the primary key could not be found
	 */
	@Override
	public QualityApplicantDetail remove(Serializable primaryKey)
		throws NoSuchQualityApplicantDetailException {

		Session session = null;

		try {
			session = openSession();

			QualityApplicantDetail qualityApplicantDetail =
				(QualityApplicantDetail)session.get(
					QualityApplicantDetailImpl.class, primaryKey);

			if (qualityApplicantDetail == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQualityApplicantDetailException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(qualityApplicantDetail);
		}
		catch (NoSuchQualityApplicantDetailException noSuchEntityException) {
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
	protected QualityApplicantDetail removeImpl(
		QualityApplicantDetail qualityApplicantDetail) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(qualityApplicantDetail)) {
				qualityApplicantDetail = (QualityApplicantDetail)session.get(
					QualityApplicantDetailImpl.class,
					qualityApplicantDetail.getPrimaryKeyObj());
			}

			if (qualityApplicantDetail != null) {
				session.delete(qualityApplicantDetail);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (qualityApplicantDetail != null) {
			clearCache(qualityApplicantDetail);
		}

		return qualityApplicantDetail;
	}

	@Override
	public QualityApplicantDetail updateImpl(
		QualityApplicantDetail qualityApplicantDetail) {

		boolean isNew = qualityApplicantDetail.isNew();

		if (!(qualityApplicantDetail instanceof
				QualityApplicantDetailModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(qualityApplicantDetail.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					qualityApplicantDetail);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in qualityApplicantDetail proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QualityApplicantDetail implementation " +
					qualityApplicantDetail.getClass());
		}

		QualityApplicantDetailModelImpl qualityApplicantDetailModelImpl =
			(QualityApplicantDetailModelImpl)qualityApplicantDetail;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (qualityApplicantDetail.getCreateDate() == null)) {
			if (serviceContext == null) {
				qualityApplicantDetail.setCreateDate(date);
			}
			else {
				qualityApplicantDetail.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!qualityApplicantDetailModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				qualityApplicantDetail.setModifiedDate(date);
			}
			else {
				qualityApplicantDetail.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(qualityApplicantDetail);
			}
			else {
				qualityApplicantDetail = (QualityApplicantDetail)session.merge(
					qualityApplicantDetail);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QualityApplicantDetailImpl.class, qualityApplicantDetailModelImpl,
			false, true);

		cacheUniqueFindersCache(qualityApplicantDetailModelImpl);

		if (isNew) {
			qualityApplicantDetail.setNew(false);
		}

		qualityApplicantDetail.resetOriginalValues();

		return qualityApplicantDetail;
	}

	/**
	 * Returns the quality applicant detail with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the quality applicant detail
	 * @return the quality applicant detail
	 * @throws NoSuchQualityApplicantDetailException if a quality applicant detail with the primary key could not be found
	 */
	@Override
	public QualityApplicantDetail findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQualityApplicantDetailException {

		QualityApplicantDetail qualityApplicantDetail = fetchByPrimaryKey(
			primaryKey);

		if (qualityApplicantDetail == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQualityApplicantDetailException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return qualityApplicantDetail;
	}

	/**
	 * Returns the quality applicant detail with the primary key or throws a <code>NoSuchQualityApplicantDetailException</code> if it could not be found.
	 *
	 * @param qualityApplicantDetailId the primary key of the quality applicant detail
	 * @return the quality applicant detail
	 * @throws NoSuchQualityApplicantDetailException if a quality applicant detail with the primary key could not be found
	 */
	@Override
	public QualityApplicantDetail findByPrimaryKey(
			long qualityApplicantDetailId)
		throws NoSuchQualityApplicantDetailException {

		return findByPrimaryKey((Serializable)qualityApplicantDetailId);
	}

	/**
	 * Returns the quality applicant detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualityApplicantDetailId the primary key of the quality applicant detail
	 * @return the quality applicant detail, or <code>null</code> if a quality applicant detail with the primary key could not be found
	 */
	@Override
	public QualityApplicantDetail fetchByPrimaryKey(
		long qualityApplicantDetailId) {

		return fetchByPrimaryKey((Serializable)qualityApplicantDetailId);
	}

	/**
	 * Returns all the quality applicant details.
	 *
	 * @return the quality applicant details
	 */
	@Override
	public List<QualityApplicantDetail> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quality applicant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityApplicantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality applicant details
	 * @param end the upper bound of the range of quality applicant details (not inclusive)
	 * @return the range of quality applicant details
	 */
	@Override
	public List<QualityApplicantDetail> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the quality applicant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityApplicantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality applicant details
	 * @param end the upper bound of the range of quality applicant details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quality applicant details
	 */
	@Override
	public List<QualityApplicantDetail> findAll(
		int start, int end,
		OrderByComparator<QualityApplicantDetail> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quality applicant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityApplicantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality applicant details
	 * @param end the upper bound of the range of quality applicant details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quality applicant details
	 */
	@Override
	public List<QualityApplicantDetail> findAll(
		int start, int end,
		OrderByComparator<QualityApplicantDetail> orderByComparator,
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

		List<QualityApplicantDetail> list = null;

		if (useFinderCache) {
			list = (List<QualityApplicantDetail>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUALITYAPPLICANTDETAIL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUALITYAPPLICANTDETAIL;

				sql = sql.concat(QualityApplicantDetailModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QualityApplicantDetail>)QueryUtil.list(
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
	 * Removes all the quality applicant details from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QualityApplicantDetail qualityApplicantDetail : findAll()) {
			remove(qualityApplicantDetail);
		}
	}

	/**
	 * Returns the number of quality applicant details.
	 *
	 * @return the number of quality applicant details
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
					_SQL_COUNT_QUALITYAPPLICANTDETAIL);

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
		return "qualityApplicantDetailId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUALITYAPPLICANTDETAIL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QualityApplicantDetailModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the quality applicant detail persistence.
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

		QualityApplicantDetailUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QualityApplicantDetailUtil.setPersistence(null);

		entityCache.removeCache(QualityApplicantDetailImpl.class.getName());
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

	private static final String _SQL_SELECT_QUALITYAPPLICANTDETAIL =
		"SELECT qualityApplicantDetail FROM QualityApplicantDetail qualityApplicantDetail";

	private static final String _SQL_SELECT_QUALITYAPPLICANTDETAIL_WHERE =
		"SELECT qualityApplicantDetail FROM QualityApplicantDetail qualityApplicantDetail WHERE ";

	private static final String _SQL_COUNT_QUALITYAPPLICANTDETAIL =
		"SELECT COUNT(qualityApplicantDetail) FROM QualityApplicantDetail qualityApplicantDetail";

	private static final String _SQL_COUNT_QUALITYAPPLICANTDETAIL_WHERE =
		"SELECT COUNT(qualityApplicantDetail) FROM QualityApplicantDetail qualityApplicantDetail WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"qualityApplicantDetail.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QualityApplicantDetail exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QualityApplicantDetail exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QualityApplicantDetailPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}