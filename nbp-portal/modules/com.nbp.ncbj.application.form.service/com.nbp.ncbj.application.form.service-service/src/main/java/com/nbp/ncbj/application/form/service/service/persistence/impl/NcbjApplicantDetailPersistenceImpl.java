/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence.impl;

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

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjApplicantDetailException;
import com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail;
import com.nbp.ncbj.application.form.service.model.NcbjApplicantDetailTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjApplicantDetailImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjApplicantDetailModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjApplicantDetailPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjApplicantDetailUtil;
import com.nbp.ncbj.application.form.service.service.persistence.impl.constants.FOOPersistenceConstants;

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
 * The persistence implementation for the ncbj applicant detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjApplicantDetailPersistence.class)
public class NcbjApplicantDetailPersistenceImpl
	extends BasePersistenceImpl<NcbjApplicantDetail>
	implements NcbjApplicantDetailPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjApplicantDetailUtil</code> to access the ncbj applicant detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjApplicantDetailImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetNCBJById;
	private FinderPath _finderPathCountBygetNCBJById;

	/**
	 * Returns the ncbj applicant detail where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjApplicantDetailException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj applicant detail
	 * @throws NoSuchNcbjApplicantDetailException if a matching ncbj applicant detail could not be found
	 */
	@Override
	public NcbjApplicantDetail findBygetNCBJById(long ncbjApplicationId)
		throws NoSuchNcbjApplicantDetailException {

		NcbjApplicantDetail ncbjApplicantDetail = fetchBygetNCBJById(
			ncbjApplicationId);

		if (ncbjApplicantDetail == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjApplicantDetailException(sb.toString());
		}

		return ncbjApplicantDetail;
	}

	/**
	 * Returns the ncbj applicant detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj applicant detail, or <code>null</code> if a matching ncbj applicant detail could not be found
	 */
	@Override
	public NcbjApplicantDetail fetchBygetNCBJById(long ncbjApplicationId) {
		return fetchBygetNCBJById(ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj applicant detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj applicant detail, or <code>null</code> if a matching ncbj applicant detail could not be found
	 */
	@Override
	public NcbjApplicantDetail fetchBygetNCBJById(
		long ncbjApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ncbjApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNCBJById, finderArgs, this);
		}

		if (result instanceof NcbjApplicantDetail) {
			NcbjApplicantDetail ncbjApplicantDetail =
				(NcbjApplicantDetail)result;

			if (ncbjApplicationId !=
					ncbjApplicantDetail.getNcbjApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJAPPLICANTDETAIL_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				List<NcbjApplicantDetail> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNCBJById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ncbjApplicationId};
							}

							_log.warn(
								"NcbjApplicantDetailPersistenceImpl.fetchBygetNCBJById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjApplicantDetail ncbjApplicantDetail = list.get(0);

					result = ncbjApplicantDetail;

					cacheResult(ncbjApplicantDetail);
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
			return (NcbjApplicantDetail)result;
		}
	}

	/**
	 * Removes the ncbj applicant detail where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj applicant detail that was removed
	 */
	@Override
	public NcbjApplicantDetail removeBygetNCBJById(long ncbjApplicationId)
		throws NoSuchNcbjApplicantDetailException {

		NcbjApplicantDetail ncbjApplicantDetail = findBygetNCBJById(
			ncbjApplicationId);

		return remove(ncbjApplicantDetail);
	}

	/**
	 * Returns the number of ncbj applicant details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj applicant details
	 */
	@Override
	public int countBygetNCBJById(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJById;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJAPPLICANTDETAIL_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

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

	private static final String _FINDER_COLUMN_GETNCBJBYID_NCBJAPPLICATIONID_2 =
		"ncbjApplicantDetail.ncbjApplicationId = ?";

	public NcbjApplicantDetailPersistenceImpl() {
		setModelClass(NcbjApplicantDetail.class);

		setModelImplClass(NcbjApplicantDetailImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjApplicantDetailTable.INSTANCE);
	}

	/**
	 * Caches the ncbj applicant detail in the entity cache if it is enabled.
	 *
	 * @param ncbjApplicantDetail the ncbj applicant detail
	 */
	@Override
	public void cacheResult(NcbjApplicantDetail ncbjApplicantDetail) {
		entityCache.putResult(
			NcbjApplicantDetailImpl.class, ncbjApplicantDetail.getPrimaryKey(),
			ncbjApplicantDetail);

		finderCache.putResult(
			_finderPathFetchBygetNCBJById,
			new Object[] {ncbjApplicantDetail.getNcbjApplicationId()},
			ncbjApplicantDetail);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj applicant details in the entity cache if it is enabled.
	 *
	 * @param ncbjApplicantDetails the ncbj applicant details
	 */
	@Override
	public void cacheResult(List<NcbjApplicantDetail> ncbjApplicantDetails) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjApplicantDetails.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjApplicantDetail ncbjApplicantDetail : ncbjApplicantDetails) {
			if (entityCache.getResult(
					NcbjApplicantDetailImpl.class,
					ncbjApplicantDetail.getPrimaryKey()) == null) {

				cacheResult(ncbjApplicantDetail);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj applicant details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjApplicantDetailImpl.class);

		finderCache.clearCache(NcbjApplicantDetailImpl.class);
	}

	/**
	 * Clears the cache for the ncbj applicant detail.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjApplicantDetail ncbjApplicantDetail) {
		entityCache.removeResult(
			NcbjApplicantDetailImpl.class, ncbjApplicantDetail);
	}

	@Override
	public void clearCache(List<NcbjApplicantDetail> ncbjApplicantDetails) {
		for (NcbjApplicantDetail ncbjApplicantDetail : ncbjApplicantDetails) {
			entityCache.removeResult(
				NcbjApplicantDetailImpl.class, ncbjApplicantDetail);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjApplicantDetailImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NcbjApplicantDetailImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjApplicantDetailModelImpl ncbjApplicantDetailModelImpl) {

		Object[] args = new Object[] {
			ncbjApplicantDetailModelImpl.getNcbjApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNCBJById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNCBJById, args, ncbjApplicantDetailModelImpl);
	}

	/**
	 * Creates a new ncbj applicant detail with the primary key. Does not add the ncbj applicant detail to the database.
	 *
	 * @param ncbjApplicantDetailId the primary key for the new ncbj applicant detail
	 * @return the new ncbj applicant detail
	 */
	@Override
	public NcbjApplicantDetail create(long ncbjApplicantDetailId) {
		NcbjApplicantDetail ncbjApplicantDetail = new NcbjApplicantDetailImpl();

		ncbjApplicantDetail.setNew(true);
		ncbjApplicantDetail.setPrimaryKey(ncbjApplicantDetailId);

		ncbjApplicantDetail.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjApplicantDetail;
	}

	/**
	 * Removes the ncbj applicant detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjApplicantDetailId the primary key of the ncbj applicant detail
	 * @return the ncbj applicant detail that was removed
	 * @throws NoSuchNcbjApplicantDetailException if a ncbj applicant detail with the primary key could not be found
	 */
	@Override
	public NcbjApplicantDetail remove(long ncbjApplicantDetailId)
		throws NoSuchNcbjApplicantDetailException {

		return remove((Serializable)ncbjApplicantDetailId);
	}

	/**
	 * Removes the ncbj applicant detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj applicant detail
	 * @return the ncbj applicant detail that was removed
	 * @throws NoSuchNcbjApplicantDetailException if a ncbj applicant detail with the primary key could not be found
	 */
	@Override
	public NcbjApplicantDetail remove(Serializable primaryKey)
		throws NoSuchNcbjApplicantDetailException {

		Session session = null;

		try {
			session = openSession();

			NcbjApplicantDetail ncbjApplicantDetail =
				(NcbjApplicantDetail)session.get(
					NcbjApplicantDetailImpl.class, primaryKey);

			if (ncbjApplicantDetail == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjApplicantDetailException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjApplicantDetail);
		}
		catch (NoSuchNcbjApplicantDetailException noSuchEntityException) {
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
	protected NcbjApplicantDetail removeImpl(
		NcbjApplicantDetail ncbjApplicantDetail) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjApplicantDetail)) {
				ncbjApplicantDetail = (NcbjApplicantDetail)session.get(
					NcbjApplicantDetailImpl.class,
					ncbjApplicantDetail.getPrimaryKeyObj());
			}

			if (ncbjApplicantDetail != null) {
				session.delete(ncbjApplicantDetail);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjApplicantDetail != null) {
			clearCache(ncbjApplicantDetail);
		}

		return ncbjApplicantDetail;
	}

	@Override
	public NcbjApplicantDetail updateImpl(
		NcbjApplicantDetail ncbjApplicantDetail) {

		boolean isNew = ncbjApplicantDetail.isNew();

		if (!(ncbjApplicantDetail instanceof NcbjApplicantDetailModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjApplicantDetail.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjApplicantDetail);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjApplicantDetail proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjApplicantDetail implementation " +
					ncbjApplicantDetail.getClass());
		}

		NcbjApplicantDetailModelImpl ncbjApplicantDetailModelImpl =
			(NcbjApplicantDetailModelImpl)ncbjApplicantDetail;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjApplicantDetail.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjApplicantDetail.setCreateDate(date);
			}
			else {
				ncbjApplicantDetail.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjApplicantDetailModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjApplicantDetail.setModifiedDate(date);
			}
			else {
				ncbjApplicantDetail.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjApplicantDetail);
			}
			else {
				ncbjApplicantDetail = (NcbjApplicantDetail)session.merge(
					ncbjApplicantDetail);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjApplicantDetailImpl.class, ncbjApplicantDetailModelImpl, false,
			true);

		cacheUniqueFindersCache(ncbjApplicantDetailModelImpl);

		if (isNew) {
			ncbjApplicantDetail.setNew(false);
		}

		ncbjApplicantDetail.resetOriginalValues();

		return ncbjApplicantDetail;
	}

	/**
	 * Returns the ncbj applicant detail with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj applicant detail
	 * @return the ncbj applicant detail
	 * @throws NoSuchNcbjApplicantDetailException if a ncbj applicant detail with the primary key could not be found
	 */
	@Override
	public NcbjApplicantDetail findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjApplicantDetailException {

		NcbjApplicantDetail ncbjApplicantDetail = fetchByPrimaryKey(primaryKey);

		if (ncbjApplicantDetail == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjApplicantDetailException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjApplicantDetail;
	}

	/**
	 * Returns the ncbj applicant detail with the primary key or throws a <code>NoSuchNcbjApplicantDetailException</code> if it could not be found.
	 *
	 * @param ncbjApplicantDetailId the primary key of the ncbj applicant detail
	 * @return the ncbj applicant detail
	 * @throws NoSuchNcbjApplicantDetailException if a ncbj applicant detail with the primary key could not be found
	 */
	@Override
	public NcbjApplicantDetail findByPrimaryKey(long ncbjApplicantDetailId)
		throws NoSuchNcbjApplicantDetailException {

		return findByPrimaryKey((Serializable)ncbjApplicantDetailId);
	}

	/**
	 * Returns the ncbj applicant detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjApplicantDetailId the primary key of the ncbj applicant detail
	 * @return the ncbj applicant detail, or <code>null</code> if a ncbj applicant detail with the primary key could not be found
	 */
	@Override
	public NcbjApplicantDetail fetchByPrimaryKey(long ncbjApplicantDetailId) {
		return fetchByPrimaryKey((Serializable)ncbjApplicantDetailId);
	}

	/**
	 * Returns all the ncbj applicant details.
	 *
	 * @return the ncbj applicant details
	 */
	@Override
	public List<NcbjApplicantDetail> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj applicant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj applicant details
	 * @param end the upper bound of the range of ncbj applicant details (not inclusive)
	 * @return the range of ncbj applicant details
	 */
	@Override
	public List<NcbjApplicantDetail> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj applicant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj applicant details
	 * @param end the upper bound of the range of ncbj applicant details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj applicant details
	 */
	@Override
	public List<NcbjApplicantDetail> findAll(
		int start, int end,
		OrderByComparator<NcbjApplicantDetail> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj applicant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj applicant details
	 * @param end the upper bound of the range of ncbj applicant details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj applicant details
	 */
	@Override
	public List<NcbjApplicantDetail> findAll(
		int start, int end,
		OrderByComparator<NcbjApplicantDetail> orderByComparator,
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

		List<NcbjApplicantDetail> list = null;

		if (useFinderCache) {
			list = (List<NcbjApplicantDetail>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJAPPLICANTDETAIL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJAPPLICANTDETAIL;

				sql = sql.concat(NcbjApplicantDetailModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjApplicantDetail>)QueryUtil.list(
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
	 * Removes all the ncbj applicant details from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjApplicantDetail ncbjApplicantDetail : findAll()) {
			remove(ncbjApplicantDetail);
		}
	}

	/**
	 * Returns the number of ncbj applicant details.
	 *
	 * @return the number of ncbj applicant details
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
					_SQL_COUNT_NCBJAPPLICANTDETAIL);

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
		return "ncbjApplicantDetailId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJAPPLICANTDETAIL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjApplicantDetailModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj applicant detail persistence.
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

		_finderPathFetchBygetNCBJById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNCBJById",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathCountBygetNCBJById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNCBJById",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, false);

		NcbjApplicantDetailUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjApplicantDetailUtil.setPersistence(null);

		entityCache.removeCache(NcbjApplicantDetailImpl.class.getName());
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCBJAPPLICANTDETAIL =
		"SELECT ncbjApplicantDetail FROM NcbjApplicantDetail ncbjApplicantDetail";

	private static final String _SQL_SELECT_NCBJAPPLICANTDETAIL_WHERE =
		"SELECT ncbjApplicantDetail FROM NcbjApplicantDetail ncbjApplicantDetail WHERE ";

	private static final String _SQL_COUNT_NCBJAPPLICANTDETAIL =
		"SELECT COUNT(ncbjApplicantDetail) FROM NcbjApplicantDetail ncbjApplicantDetail";

	private static final String _SQL_COUNT_NCBJAPPLICANTDETAIL_WHERE =
		"SELECT COUNT(ncbjApplicantDetail) FROM NcbjApplicantDetail ncbjApplicantDetail WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ncbjApplicantDetail.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjApplicantDetail exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjApplicantDetail exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjApplicantDetailPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}