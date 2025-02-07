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

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjCompanyDetailException;
import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetail;
import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjCompanyDetailPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjCompanyDetailUtil;
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
 * The persistence implementation for the ncbj company detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjCompanyDetailPersistence.class)
public class NcbjCompanyDetailPersistenceImpl
	extends BasePersistenceImpl<NcbjCompanyDetail>
	implements NcbjCompanyDetailPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjCompanyDetailUtil</code> to access the ncbj company detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjCompanyDetailImpl.class.getName();

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
	 * Returns the ncbj company detail where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjCompanyDetailException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company detail
	 * @throws NoSuchNcbjCompanyDetailException if a matching ncbj company detail could not be found
	 */
	@Override
	public NcbjCompanyDetail findBygetNCBJById(long ncbjApplicationId)
		throws NoSuchNcbjCompanyDetailException {

		NcbjCompanyDetail ncbjCompanyDetail = fetchBygetNCBJById(
			ncbjApplicationId);

		if (ncbjCompanyDetail == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjCompanyDetailException(sb.toString());
		}

		return ncbjCompanyDetail;
	}

	/**
	 * Returns the ncbj company detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company detail, or <code>null</code> if a matching ncbj company detail could not be found
	 */
	@Override
	public NcbjCompanyDetail fetchBygetNCBJById(long ncbjApplicationId) {
		return fetchBygetNCBJById(ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj company detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj company detail, or <code>null</code> if a matching ncbj company detail could not be found
	 */
	@Override
	public NcbjCompanyDetail fetchBygetNCBJById(
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

		if (result instanceof NcbjCompanyDetail) {
			NcbjCompanyDetail ncbjCompanyDetail = (NcbjCompanyDetail)result;

			if (ncbjApplicationId != ncbjCompanyDetail.getNcbjApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJCOMPANYDETAIL_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				List<NcbjCompanyDetail> list = query.list();

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
								"NcbjCompanyDetailPersistenceImpl.fetchBygetNCBJById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjCompanyDetail ncbjCompanyDetail = list.get(0);

					result = ncbjCompanyDetail;

					cacheResult(ncbjCompanyDetail);
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
			return (NcbjCompanyDetail)result;
		}
	}

	/**
	 * Removes the ncbj company detail where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj company detail that was removed
	 */
	@Override
	public NcbjCompanyDetail removeBygetNCBJById(long ncbjApplicationId)
		throws NoSuchNcbjCompanyDetailException {

		NcbjCompanyDetail ncbjCompanyDetail = findBygetNCBJById(
			ncbjApplicationId);

		return remove(ncbjCompanyDetail);
	}

	/**
	 * Returns the number of ncbj company details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj company details
	 */
	@Override
	public int countBygetNCBJById(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJById;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJCOMPANYDETAIL_WHERE);

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
		"ncbjCompanyDetail.ncbjApplicationId = ?";

	public NcbjCompanyDetailPersistenceImpl() {
		setModelClass(NcbjCompanyDetail.class);

		setModelImplClass(NcbjCompanyDetailImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjCompanyDetailTable.INSTANCE);
	}

	/**
	 * Caches the ncbj company detail in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyDetail the ncbj company detail
	 */
	@Override
	public void cacheResult(NcbjCompanyDetail ncbjCompanyDetail) {
		entityCache.putResult(
			NcbjCompanyDetailImpl.class, ncbjCompanyDetail.getPrimaryKey(),
			ncbjCompanyDetail);

		finderCache.putResult(
			_finderPathFetchBygetNCBJById,
			new Object[] {ncbjCompanyDetail.getNcbjApplicationId()},
			ncbjCompanyDetail);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj company details in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyDetails the ncbj company details
	 */
	@Override
	public void cacheResult(List<NcbjCompanyDetail> ncbjCompanyDetails) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjCompanyDetails.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjCompanyDetail ncbjCompanyDetail : ncbjCompanyDetails) {
			if (entityCache.getResult(
					NcbjCompanyDetailImpl.class,
					ncbjCompanyDetail.getPrimaryKey()) == null) {

				cacheResult(ncbjCompanyDetail);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj company details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjCompanyDetailImpl.class);

		finderCache.clearCache(NcbjCompanyDetailImpl.class);
	}

	/**
	 * Clears the cache for the ncbj company detail.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjCompanyDetail ncbjCompanyDetail) {
		entityCache.removeResult(
			NcbjCompanyDetailImpl.class, ncbjCompanyDetail);
	}

	@Override
	public void clearCache(List<NcbjCompanyDetail> ncbjCompanyDetails) {
		for (NcbjCompanyDetail ncbjCompanyDetail : ncbjCompanyDetails) {
			entityCache.removeResult(
				NcbjCompanyDetailImpl.class, ncbjCompanyDetail);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjCompanyDetailImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NcbjCompanyDetailImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjCompanyDetailModelImpl ncbjCompanyDetailModelImpl) {

		Object[] args = new Object[] {
			ncbjCompanyDetailModelImpl.getNcbjApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNCBJById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNCBJById, args, ncbjCompanyDetailModelImpl);
	}

	/**
	 * Creates a new ncbj company detail with the primary key. Does not add the ncbj company detail to the database.
	 *
	 * @param ncbjCompanyDetailId the primary key for the new ncbj company detail
	 * @return the new ncbj company detail
	 */
	@Override
	public NcbjCompanyDetail create(long ncbjCompanyDetailId) {
		NcbjCompanyDetail ncbjCompanyDetail = new NcbjCompanyDetailImpl();

		ncbjCompanyDetail.setNew(true);
		ncbjCompanyDetail.setPrimaryKey(ncbjCompanyDetailId);

		ncbjCompanyDetail.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjCompanyDetail;
	}

	/**
	 * Removes the ncbj company detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjCompanyDetailId the primary key of the ncbj company detail
	 * @return the ncbj company detail that was removed
	 * @throws NoSuchNcbjCompanyDetailException if a ncbj company detail with the primary key could not be found
	 */
	@Override
	public NcbjCompanyDetail remove(long ncbjCompanyDetailId)
		throws NoSuchNcbjCompanyDetailException {

		return remove((Serializable)ncbjCompanyDetailId);
	}

	/**
	 * Removes the ncbj company detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj company detail
	 * @return the ncbj company detail that was removed
	 * @throws NoSuchNcbjCompanyDetailException if a ncbj company detail with the primary key could not be found
	 */
	@Override
	public NcbjCompanyDetail remove(Serializable primaryKey)
		throws NoSuchNcbjCompanyDetailException {

		Session session = null;

		try {
			session = openSession();

			NcbjCompanyDetail ncbjCompanyDetail =
				(NcbjCompanyDetail)session.get(
					NcbjCompanyDetailImpl.class, primaryKey);

			if (ncbjCompanyDetail == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjCompanyDetailException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjCompanyDetail);
		}
		catch (NoSuchNcbjCompanyDetailException noSuchEntityException) {
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
	protected NcbjCompanyDetail removeImpl(
		NcbjCompanyDetail ncbjCompanyDetail) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjCompanyDetail)) {
				ncbjCompanyDetail = (NcbjCompanyDetail)session.get(
					NcbjCompanyDetailImpl.class,
					ncbjCompanyDetail.getPrimaryKeyObj());
			}

			if (ncbjCompanyDetail != null) {
				session.delete(ncbjCompanyDetail);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjCompanyDetail != null) {
			clearCache(ncbjCompanyDetail);
		}

		return ncbjCompanyDetail;
	}

	@Override
	public NcbjCompanyDetail updateImpl(NcbjCompanyDetail ncbjCompanyDetail) {
		boolean isNew = ncbjCompanyDetail.isNew();

		if (!(ncbjCompanyDetail instanceof NcbjCompanyDetailModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjCompanyDetail.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjCompanyDetail);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjCompanyDetail proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjCompanyDetail implementation " +
					ncbjCompanyDetail.getClass());
		}

		NcbjCompanyDetailModelImpl ncbjCompanyDetailModelImpl =
			(NcbjCompanyDetailModelImpl)ncbjCompanyDetail;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjCompanyDetail.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjCompanyDetail.setCreateDate(date);
			}
			else {
				ncbjCompanyDetail.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjCompanyDetailModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjCompanyDetail.setModifiedDate(date);
			}
			else {
				ncbjCompanyDetail.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjCompanyDetail);
			}
			else {
				ncbjCompanyDetail = (NcbjCompanyDetail)session.merge(
					ncbjCompanyDetail);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjCompanyDetailImpl.class, ncbjCompanyDetailModelImpl, false,
			true);

		cacheUniqueFindersCache(ncbjCompanyDetailModelImpl);

		if (isNew) {
			ncbjCompanyDetail.setNew(false);
		}

		ncbjCompanyDetail.resetOriginalValues();

		return ncbjCompanyDetail;
	}

	/**
	 * Returns the ncbj company detail with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj company detail
	 * @return the ncbj company detail
	 * @throws NoSuchNcbjCompanyDetailException if a ncbj company detail with the primary key could not be found
	 */
	@Override
	public NcbjCompanyDetail findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjCompanyDetailException {

		NcbjCompanyDetail ncbjCompanyDetail = fetchByPrimaryKey(primaryKey);

		if (ncbjCompanyDetail == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjCompanyDetailException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjCompanyDetail;
	}

	/**
	 * Returns the ncbj company detail with the primary key or throws a <code>NoSuchNcbjCompanyDetailException</code> if it could not be found.
	 *
	 * @param ncbjCompanyDetailId the primary key of the ncbj company detail
	 * @return the ncbj company detail
	 * @throws NoSuchNcbjCompanyDetailException if a ncbj company detail with the primary key could not be found
	 */
	@Override
	public NcbjCompanyDetail findByPrimaryKey(long ncbjCompanyDetailId)
		throws NoSuchNcbjCompanyDetailException {

		return findByPrimaryKey((Serializable)ncbjCompanyDetailId);
	}

	/**
	 * Returns the ncbj company detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjCompanyDetailId the primary key of the ncbj company detail
	 * @return the ncbj company detail, or <code>null</code> if a ncbj company detail with the primary key could not be found
	 */
	@Override
	public NcbjCompanyDetail fetchByPrimaryKey(long ncbjCompanyDetailId) {
		return fetchByPrimaryKey((Serializable)ncbjCompanyDetailId);
	}

	/**
	 * Returns all the ncbj company details.
	 *
	 * @return the ncbj company details
	 */
	@Override
	public List<NcbjCompanyDetail> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj company details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company details
	 * @param end the upper bound of the range of ncbj company details (not inclusive)
	 * @return the range of ncbj company details
	 */
	@Override
	public List<NcbjCompanyDetail> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj company details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company details
	 * @param end the upper bound of the range of ncbj company details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj company details
	 */
	@Override
	public List<NcbjCompanyDetail> findAll(
		int start, int end,
		OrderByComparator<NcbjCompanyDetail> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj company details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company details
	 * @param end the upper bound of the range of ncbj company details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj company details
	 */
	@Override
	public List<NcbjCompanyDetail> findAll(
		int start, int end,
		OrderByComparator<NcbjCompanyDetail> orderByComparator,
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

		List<NcbjCompanyDetail> list = null;

		if (useFinderCache) {
			list = (List<NcbjCompanyDetail>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJCOMPANYDETAIL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJCOMPANYDETAIL;

				sql = sql.concat(NcbjCompanyDetailModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjCompanyDetail>)QueryUtil.list(
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
	 * Removes all the ncbj company details from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjCompanyDetail ncbjCompanyDetail : findAll()) {
			remove(ncbjCompanyDetail);
		}
	}

	/**
	 * Returns the number of ncbj company details.
	 *
	 * @return the number of ncbj company details
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NCBJCOMPANYDETAIL);

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
		return "ncbjCompanyDetailId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJCOMPANYDETAIL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjCompanyDetailModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj company detail persistence.
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

		NcbjCompanyDetailUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjCompanyDetailUtil.setPersistence(null);

		entityCache.removeCache(NcbjCompanyDetailImpl.class.getName());
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

	private static final String _SQL_SELECT_NCBJCOMPANYDETAIL =
		"SELECT ncbjCompanyDetail FROM NcbjCompanyDetail ncbjCompanyDetail";

	private static final String _SQL_SELECT_NCBJCOMPANYDETAIL_WHERE =
		"SELECT ncbjCompanyDetail FROM NcbjCompanyDetail ncbjCompanyDetail WHERE ";

	private static final String _SQL_COUNT_NCBJCOMPANYDETAIL =
		"SELECT COUNT(ncbjCompanyDetail) FROM NcbjCompanyDetail ncbjCompanyDetail";

	private static final String _SQL_COUNT_NCBJCOMPANYDETAIL_WHERE =
		"SELECT COUNT(ncbjCompanyDetail) FROM NcbjCompanyDetail ncbjCompanyDetail WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ncbjCompanyDetail.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjCompanyDetail exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjCompanyDetail exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjCompanyDetailPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}