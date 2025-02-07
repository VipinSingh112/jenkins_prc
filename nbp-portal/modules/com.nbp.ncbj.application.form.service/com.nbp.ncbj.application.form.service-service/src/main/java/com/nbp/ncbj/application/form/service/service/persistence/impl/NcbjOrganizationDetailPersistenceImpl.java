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

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjOrganizationDetailException;
import com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail;
import com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetailTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjOrganizationDetailImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjOrganizationDetailModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjOrganizationDetailPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjOrganizationDetailUtil;
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
 * The persistence implementation for the ncbj organization detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjOrganizationDetailPersistence.class)
public class NcbjOrganizationDetailPersistenceImpl
	extends BasePersistenceImpl<NcbjOrganizationDetail>
	implements NcbjOrganizationDetailPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjOrganizationDetailUtil</code> to access the ncbj organization detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjOrganizationDetailImpl.class.getName();

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
	 * Returns the ncbj organization detail where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjOrganizationDetailException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj organization detail
	 * @throws NoSuchNcbjOrganizationDetailException if a matching ncbj organization detail could not be found
	 */
	@Override
	public NcbjOrganizationDetail findBygetNCBJById(long ncbjApplicationId)
		throws NoSuchNcbjOrganizationDetailException {

		NcbjOrganizationDetail ncbjOrganizationDetail = fetchBygetNCBJById(
			ncbjApplicationId);

		if (ncbjOrganizationDetail == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjOrganizationDetailException(sb.toString());
		}

		return ncbjOrganizationDetail;
	}

	/**
	 * Returns the ncbj organization detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj organization detail, or <code>null</code> if a matching ncbj organization detail could not be found
	 */
	@Override
	public NcbjOrganizationDetail fetchBygetNCBJById(long ncbjApplicationId) {
		return fetchBygetNCBJById(ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj organization detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj organization detail, or <code>null</code> if a matching ncbj organization detail could not be found
	 */
	@Override
	public NcbjOrganizationDetail fetchBygetNCBJById(
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

		if (result instanceof NcbjOrganizationDetail) {
			NcbjOrganizationDetail ncbjOrganizationDetail =
				(NcbjOrganizationDetail)result;

			if (ncbjApplicationId !=
					ncbjOrganizationDetail.getNcbjApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJORGANIZATIONDETAIL_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				List<NcbjOrganizationDetail> list = query.list();

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
								"NcbjOrganizationDetailPersistenceImpl.fetchBygetNCBJById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjOrganizationDetail ncbjOrganizationDetail = list.get(0);

					result = ncbjOrganizationDetail;

					cacheResult(ncbjOrganizationDetail);
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
			return (NcbjOrganizationDetail)result;
		}
	}

	/**
	 * Removes the ncbj organization detail where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj organization detail that was removed
	 */
	@Override
	public NcbjOrganizationDetail removeBygetNCBJById(long ncbjApplicationId)
		throws NoSuchNcbjOrganizationDetailException {

		NcbjOrganizationDetail ncbjOrganizationDetail = findBygetNCBJById(
			ncbjApplicationId);

		return remove(ncbjOrganizationDetail);
	}

	/**
	 * Returns the number of ncbj organization details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj organization details
	 */
	@Override
	public int countBygetNCBJById(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJById;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJORGANIZATIONDETAIL_WHERE);

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
		"ncbjOrganizationDetail.ncbjApplicationId = ?";

	private FinderPath _finderPathFetchBygetNCBJ_ByAppId;
	private FinderPath _finderPathCountBygetNCBJ_ByAppId;

	/**
	 * Returns the ncbj organization detail where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjOrganizationDetailException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj organization detail
	 * @throws NoSuchNcbjOrganizationDetailException if a matching ncbj organization detail could not be found
	 */
	@Override
	public NcbjOrganizationDetail findBygetNCBJ_ByAppId(long ncbjApplicationId)
		throws NoSuchNcbjOrganizationDetailException {

		NcbjOrganizationDetail ncbjOrganizationDetail = fetchBygetNCBJ_ByAppId(
			ncbjApplicationId);

		if (ncbjOrganizationDetail == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjOrganizationDetailException(sb.toString());
		}

		return ncbjOrganizationDetail;
	}

	/**
	 * Returns the ncbj organization detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj organization detail, or <code>null</code> if a matching ncbj organization detail could not be found
	 */
	@Override
	public NcbjOrganizationDetail fetchBygetNCBJ_ByAppId(
		long ncbjApplicationId) {

		return fetchBygetNCBJ_ByAppId(ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj organization detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj organization detail, or <code>null</code> if a matching ncbj organization detail could not be found
	 */
	@Override
	public NcbjOrganizationDetail fetchBygetNCBJ_ByAppId(
		long ncbjApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ncbjApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNCBJ_ByAppId, finderArgs, this);
		}

		if (result instanceof NcbjOrganizationDetail) {
			NcbjOrganizationDetail ncbjOrganizationDetail =
				(NcbjOrganizationDetail)result;

			if (ncbjApplicationId !=
					ncbjOrganizationDetail.getNcbjApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJORGANIZATIONDETAIL_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJ_BYAPPID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				List<NcbjOrganizationDetail> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNCBJ_ByAppId, finderArgs,
							list);
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
								"NcbjOrganizationDetailPersistenceImpl.fetchBygetNCBJ_ByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjOrganizationDetail ncbjOrganizationDetail = list.get(0);

					result = ncbjOrganizationDetail;

					cacheResult(ncbjOrganizationDetail);
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
			return (NcbjOrganizationDetail)result;
		}
	}

	/**
	 * Removes the ncbj organization detail where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj organization detail that was removed
	 */
	@Override
	public NcbjOrganizationDetail removeBygetNCBJ_ByAppId(
			long ncbjApplicationId)
		throws NoSuchNcbjOrganizationDetailException {

		NcbjOrganizationDetail ncbjOrganizationDetail = findBygetNCBJ_ByAppId(
			ncbjApplicationId);

		return remove(ncbjOrganizationDetail);
	}

	/**
	 * Returns the number of ncbj organization details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj organization details
	 */
	@Override
	public int countBygetNCBJ_ByAppId(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJ_ByAppId;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJORGANIZATIONDETAIL_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJ_BYAPPID_NCBJAPPLICATIONID_2);

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

	private static final String
		_FINDER_COLUMN_GETNCBJ_BYAPPID_NCBJAPPLICATIONID_2 =
			"ncbjOrganizationDetail.ncbjApplicationId = ?";

	public NcbjOrganizationDetailPersistenceImpl() {
		setModelClass(NcbjOrganizationDetail.class);

		setModelImplClass(NcbjOrganizationDetailImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjOrganizationDetailTable.INSTANCE);
	}

	/**
	 * Caches the ncbj organization detail in the entity cache if it is enabled.
	 *
	 * @param ncbjOrganizationDetail the ncbj organization detail
	 */
	@Override
	public void cacheResult(NcbjOrganizationDetail ncbjOrganizationDetail) {
		entityCache.putResult(
			NcbjOrganizationDetailImpl.class,
			ncbjOrganizationDetail.getPrimaryKey(), ncbjOrganizationDetail);

		finderCache.putResult(
			_finderPathFetchBygetNCBJById,
			new Object[] {ncbjOrganizationDetail.getNcbjApplicationId()},
			ncbjOrganizationDetail);

		finderCache.putResult(
			_finderPathFetchBygetNCBJ_ByAppId,
			new Object[] {ncbjOrganizationDetail.getNcbjApplicationId()},
			ncbjOrganizationDetail);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj organization details in the entity cache if it is enabled.
	 *
	 * @param ncbjOrganizationDetails the ncbj organization details
	 */
	@Override
	public void cacheResult(
		List<NcbjOrganizationDetail> ncbjOrganizationDetails) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjOrganizationDetails.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjOrganizationDetail ncbjOrganizationDetail :
				ncbjOrganizationDetails) {

			if (entityCache.getResult(
					NcbjOrganizationDetailImpl.class,
					ncbjOrganizationDetail.getPrimaryKey()) == null) {

				cacheResult(ncbjOrganizationDetail);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj organization details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjOrganizationDetailImpl.class);

		finderCache.clearCache(NcbjOrganizationDetailImpl.class);
	}

	/**
	 * Clears the cache for the ncbj organization detail.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjOrganizationDetail ncbjOrganizationDetail) {
		entityCache.removeResult(
			NcbjOrganizationDetailImpl.class, ncbjOrganizationDetail);
	}

	@Override
	public void clearCache(
		List<NcbjOrganizationDetail> ncbjOrganizationDetails) {

		for (NcbjOrganizationDetail ncbjOrganizationDetail :
				ncbjOrganizationDetails) {

			entityCache.removeResult(
				NcbjOrganizationDetailImpl.class, ncbjOrganizationDetail);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjOrganizationDetailImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				NcbjOrganizationDetailImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjOrganizationDetailModelImpl ncbjOrganizationDetailModelImpl) {

		Object[] args = new Object[] {
			ncbjOrganizationDetailModelImpl.getNcbjApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNCBJById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNCBJById, args,
			ncbjOrganizationDetailModelImpl);

		args = new Object[] {
			ncbjOrganizationDetailModelImpl.getNcbjApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNCBJ_ByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNCBJ_ByAppId, args,
			ncbjOrganizationDetailModelImpl);
	}

	/**
	 * Creates a new ncbj organization detail with the primary key. Does not add the ncbj organization detail to the database.
	 *
	 * @param ncbjOrganizationDetailId the primary key for the new ncbj organization detail
	 * @return the new ncbj organization detail
	 */
	@Override
	public NcbjOrganizationDetail create(long ncbjOrganizationDetailId) {
		NcbjOrganizationDetail ncbjOrganizationDetail =
			new NcbjOrganizationDetailImpl();

		ncbjOrganizationDetail.setNew(true);
		ncbjOrganizationDetail.setPrimaryKey(ncbjOrganizationDetailId);

		ncbjOrganizationDetail.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjOrganizationDetail;
	}

	/**
	 * Removes the ncbj organization detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjOrganizationDetailId the primary key of the ncbj organization detail
	 * @return the ncbj organization detail that was removed
	 * @throws NoSuchNcbjOrganizationDetailException if a ncbj organization detail with the primary key could not be found
	 */
	@Override
	public NcbjOrganizationDetail remove(long ncbjOrganizationDetailId)
		throws NoSuchNcbjOrganizationDetailException {

		return remove((Serializable)ncbjOrganizationDetailId);
	}

	/**
	 * Removes the ncbj organization detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj organization detail
	 * @return the ncbj organization detail that was removed
	 * @throws NoSuchNcbjOrganizationDetailException if a ncbj organization detail with the primary key could not be found
	 */
	@Override
	public NcbjOrganizationDetail remove(Serializable primaryKey)
		throws NoSuchNcbjOrganizationDetailException {

		Session session = null;

		try {
			session = openSession();

			NcbjOrganizationDetail ncbjOrganizationDetail =
				(NcbjOrganizationDetail)session.get(
					NcbjOrganizationDetailImpl.class, primaryKey);

			if (ncbjOrganizationDetail == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjOrganizationDetailException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjOrganizationDetail);
		}
		catch (NoSuchNcbjOrganizationDetailException noSuchEntityException) {
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
	protected NcbjOrganizationDetail removeImpl(
		NcbjOrganizationDetail ncbjOrganizationDetail) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjOrganizationDetail)) {
				ncbjOrganizationDetail = (NcbjOrganizationDetail)session.get(
					NcbjOrganizationDetailImpl.class,
					ncbjOrganizationDetail.getPrimaryKeyObj());
			}

			if (ncbjOrganizationDetail != null) {
				session.delete(ncbjOrganizationDetail);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjOrganizationDetail != null) {
			clearCache(ncbjOrganizationDetail);
		}

		return ncbjOrganizationDetail;
	}

	@Override
	public NcbjOrganizationDetail updateImpl(
		NcbjOrganizationDetail ncbjOrganizationDetail) {

		boolean isNew = ncbjOrganizationDetail.isNew();

		if (!(ncbjOrganizationDetail instanceof
				NcbjOrganizationDetailModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjOrganizationDetail.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjOrganizationDetail);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjOrganizationDetail proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjOrganizationDetail implementation " +
					ncbjOrganizationDetail.getClass());
		}

		NcbjOrganizationDetailModelImpl ncbjOrganizationDetailModelImpl =
			(NcbjOrganizationDetailModelImpl)ncbjOrganizationDetail;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjOrganizationDetail.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjOrganizationDetail.setCreateDate(date);
			}
			else {
				ncbjOrganizationDetail.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjOrganizationDetailModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjOrganizationDetail.setModifiedDate(date);
			}
			else {
				ncbjOrganizationDetail.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjOrganizationDetail);
			}
			else {
				ncbjOrganizationDetail = (NcbjOrganizationDetail)session.merge(
					ncbjOrganizationDetail);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjOrganizationDetailImpl.class, ncbjOrganizationDetailModelImpl,
			false, true);

		cacheUniqueFindersCache(ncbjOrganizationDetailModelImpl);

		if (isNew) {
			ncbjOrganizationDetail.setNew(false);
		}

		ncbjOrganizationDetail.resetOriginalValues();

		return ncbjOrganizationDetail;
	}

	/**
	 * Returns the ncbj organization detail with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj organization detail
	 * @return the ncbj organization detail
	 * @throws NoSuchNcbjOrganizationDetailException if a ncbj organization detail with the primary key could not be found
	 */
	@Override
	public NcbjOrganizationDetail findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjOrganizationDetailException {

		NcbjOrganizationDetail ncbjOrganizationDetail = fetchByPrimaryKey(
			primaryKey);

		if (ncbjOrganizationDetail == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjOrganizationDetailException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjOrganizationDetail;
	}

	/**
	 * Returns the ncbj organization detail with the primary key or throws a <code>NoSuchNcbjOrganizationDetailException</code> if it could not be found.
	 *
	 * @param ncbjOrganizationDetailId the primary key of the ncbj organization detail
	 * @return the ncbj organization detail
	 * @throws NoSuchNcbjOrganizationDetailException if a ncbj organization detail with the primary key could not be found
	 */
	@Override
	public NcbjOrganizationDetail findByPrimaryKey(
			long ncbjOrganizationDetailId)
		throws NoSuchNcbjOrganizationDetailException {

		return findByPrimaryKey((Serializable)ncbjOrganizationDetailId);
	}

	/**
	 * Returns the ncbj organization detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjOrganizationDetailId the primary key of the ncbj organization detail
	 * @return the ncbj organization detail, or <code>null</code> if a ncbj organization detail with the primary key could not be found
	 */
	@Override
	public NcbjOrganizationDetail fetchByPrimaryKey(
		long ncbjOrganizationDetailId) {

		return fetchByPrimaryKey((Serializable)ncbjOrganizationDetailId);
	}

	/**
	 * Returns all the ncbj organization details.
	 *
	 * @return the ncbj organization details
	 */
	@Override
	public List<NcbjOrganizationDetail> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj organization details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjOrganizationDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj organization details
	 * @param end the upper bound of the range of ncbj organization details (not inclusive)
	 * @return the range of ncbj organization details
	 */
	@Override
	public List<NcbjOrganizationDetail> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj organization details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjOrganizationDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj organization details
	 * @param end the upper bound of the range of ncbj organization details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj organization details
	 */
	@Override
	public List<NcbjOrganizationDetail> findAll(
		int start, int end,
		OrderByComparator<NcbjOrganizationDetail> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj organization details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjOrganizationDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj organization details
	 * @param end the upper bound of the range of ncbj organization details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj organization details
	 */
	@Override
	public List<NcbjOrganizationDetail> findAll(
		int start, int end,
		OrderByComparator<NcbjOrganizationDetail> orderByComparator,
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

		List<NcbjOrganizationDetail> list = null;

		if (useFinderCache) {
			list = (List<NcbjOrganizationDetail>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJORGANIZATIONDETAIL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJORGANIZATIONDETAIL;

				sql = sql.concat(NcbjOrganizationDetailModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjOrganizationDetail>)QueryUtil.list(
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
	 * Removes all the ncbj organization details from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjOrganizationDetail ncbjOrganizationDetail : findAll()) {
			remove(ncbjOrganizationDetail);
		}
	}

	/**
	 * Returns the number of ncbj organization details.
	 *
	 * @return the number of ncbj organization details
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
					_SQL_COUNT_NCBJORGANIZATIONDETAIL);

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
		return "ncbjOrganizationDetailId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJORGANIZATIONDETAIL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjOrganizationDetailModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj organization detail persistence.
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

		_finderPathFetchBygetNCBJ_ByAppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNCBJ_ByAppId",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathCountBygetNCBJ_ByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNCBJ_ByAppId",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, false);

		NcbjOrganizationDetailUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjOrganizationDetailUtil.setPersistence(null);

		entityCache.removeCache(NcbjOrganizationDetailImpl.class.getName());
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

	private static final String _SQL_SELECT_NCBJORGANIZATIONDETAIL =
		"SELECT ncbjOrganizationDetail FROM NcbjOrganizationDetail ncbjOrganizationDetail";

	private static final String _SQL_SELECT_NCBJORGANIZATIONDETAIL_WHERE =
		"SELECT ncbjOrganizationDetail FROM NcbjOrganizationDetail ncbjOrganizationDetail WHERE ";

	private static final String _SQL_COUNT_NCBJORGANIZATIONDETAIL =
		"SELECT COUNT(ncbjOrganizationDetail) FROM NcbjOrganizationDetail ncbjOrganizationDetail";

	private static final String _SQL_COUNT_NCBJORGANIZATIONDETAIL_WHERE =
		"SELECT COUNT(ncbjOrganizationDetail) FROM NcbjOrganizationDetail ncbjOrganizationDetail WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"ncbjOrganizationDetail.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjOrganizationDetail exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjOrganizationDetail exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjOrganizationDetailPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}