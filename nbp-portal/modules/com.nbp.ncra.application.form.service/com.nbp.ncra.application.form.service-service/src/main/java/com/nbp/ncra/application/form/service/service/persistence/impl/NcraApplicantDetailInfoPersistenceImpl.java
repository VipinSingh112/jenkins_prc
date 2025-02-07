/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service.persistence.impl;

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

import com.nbp.ncra.application.form.service.exception.NoSuchNcraApplicantDetailInfoException;
import com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo;
import com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfoTable;
import com.nbp.ncra.application.form.service.model.impl.NcraApplicantDetailInfoImpl;
import com.nbp.ncra.application.form.service.model.impl.NcraApplicantDetailInfoModelImpl;
import com.nbp.ncra.application.form.service.service.persistence.NcraApplicantDetailInfoPersistence;
import com.nbp.ncra.application.form.service.service.persistence.NcraApplicantDetailInfoUtil;
import com.nbp.ncra.application.form.service.service.persistence.impl.constants.NCRA_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the ncra applicant detail info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcraApplicantDetailInfoPersistence.class)
public class NcraApplicantDetailInfoPersistenceImpl
	extends BasePersistenceImpl<NcraApplicantDetailInfo>
	implements NcraApplicantDetailInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcraApplicantDetailInfoUtil</code> to access the ncra applicant detail info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcraApplicantDetailInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetNcraDetail_By_App_Id;
	private FinderPath _finderPathCountBygetNcraDetail_By_App_Id;

	/**
	 * Returns the ncra applicant detail info where ncraApplicationId = &#63; or throws a <code>NoSuchNcraApplicantDetailInfoException</code> if it could not be found.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra applicant detail info
	 * @throws NoSuchNcraApplicantDetailInfoException if a matching ncra applicant detail info could not be found
	 */
	@Override
	public NcraApplicantDetailInfo findBygetNcraDetail_By_App_Id(
			long ncraApplicationId)
		throws NoSuchNcraApplicantDetailInfoException {

		NcraApplicantDetailInfo ncraApplicantDetailInfo =
			fetchBygetNcraDetail_By_App_Id(ncraApplicationId);

		if (ncraApplicantDetailInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncraApplicationId=");
			sb.append(ncraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcraApplicantDetailInfoException(sb.toString());
		}

		return ncraApplicantDetailInfo;
	}

	/**
	 * Returns the ncra applicant detail info where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra applicant detail info, or <code>null</code> if a matching ncra applicant detail info could not be found
	 */
	@Override
	public NcraApplicantDetailInfo fetchBygetNcraDetail_By_App_Id(
		long ncraApplicationId) {

		return fetchBygetNcraDetail_By_App_Id(ncraApplicationId, true);
	}

	/**
	 * Returns the ncra applicant detail info where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra applicant detail info, or <code>null</code> if a matching ncra applicant detail info could not be found
	 */
	@Override
	public NcraApplicantDetailInfo fetchBygetNcraDetail_By_App_Id(
		long ncraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ncraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNcraDetail_By_App_Id, finderArgs, this);
		}

		if (result instanceof NcraApplicantDetailInfo) {
			NcraApplicantDetailInfo ncraApplicantDetailInfo =
				(NcraApplicantDetailInfo)result;

			if (ncraApplicationId !=
					ncraApplicantDetailInfo.getNcraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCRAAPPLICANTDETAILINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETNCRADETAIL_BY_APP_ID_NCRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncraApplicationId);

				List<NcraApplicantDetailInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcraDetail_By_App_Id,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ncraApplicationId};
							}

							_log.warn(
								"NcraApplicantDetailInfoPersistenceImpl.fetchBygetNcraDetail_By_App_Id(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcraApplicantDetailInfo ncraApplicantDetailInfo = list.get(
						0);

					result = ncraApplicantDetailInfo;

					cacheResult(ncraApplicantDetailInfo);
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
			return (NcraApplicantDetailInfo)result;
		}
	}

	/**
	 * Removes the ncra applicant detail info where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the ncra applicant detail info that was removed
	 */
	@Override
	public NcraApplicantDetailInfo removeBygetNcraDetail_By_App_Id(
			long ncraApplicationId)
		throws NoSuchNcraApplicantDetailInfoException {

		NcraApplicantDetailInfo ncraApplicantDetailInfo =
			findBygetNcraDetail_By_App_Id(ncraApplicationId);

		return remove(ncraApplicantDetailInfo);
	}

	/**
	 * Returns the number of ncra applicant detail infos where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra applicant detail infos
	 */
	@Override
	public int countBygetNcraDetail_By_App_Id(long ncraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNcraDetail_By_App_Id;

		Object[] finderArgs = new Object[] {ncraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCRAAPPLICANTDETAILINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETNCRADETAIL_BY_APP_ID_NCRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncraApplicationId);

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
		_FINDER_COLUMN_GETNCRADETAIL_BY_APP_ID_NCRAAPPLICATIONID_2 =
			"ncraApplicantDetailInfo.ncraApplicationId = ?";

	public NcraApplicantDetailInfoPersistenceImpl() {
		setModelClass(NcraApplicantDetailInfo.class);

		setModelImplClass(NcraApplicantDetailInfoImpl.class);
		setModelPKClass(long.class);

		setTable(NcraApplicantDetailInfoTable.INSTANCE);
	}

	/**
	 * Caches the ncra applicant detail info in the entity cache if it is enabled.
	 *
	 * @param ncraApplicantDetailInfo the ncra applicant detail info
	 */
	@Override
	public void cacheResult(NcraApplicantDetailInfo ncraApplicantDetailInfo) {
		entityCache.putResult(
			NcraApplicantDetailInfoImpl.class,
			ncraApplicantDetailInfo.getPrimaryKey(), ncraApplicantDetailInfo);

		finderCache.putResult(
			_finderPathFetchBygetNcraDetail_By_App_Id,
			new Object[] {ncraApplicantDetailInfo.getNcraApplicationId()},
			ncraApplicantDetailInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncra applicant detail infos in the entity cache if it is enabled.
	 *
	 * @param ncraApplicantDetailInfos the ncra applicant detail infos
	 */
	@Override
	public void cacheResult(
		List<NcraApplicantDetailInfo> ncraApplicantDetailInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncraApplicantDetailInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcraApplicantDetailInfo ncraApplicantDetailInfo :
				ncraApplicantDetailInfos) {

			if (entityCache.getResult(
					NcraApplicantDetailInfoImpl.class,
					ncraApplicantDetailInfo.getPrimaryKey()) == null) {

				cacheResult(ncraApplicantDetailInfo);
			}
		}
	}

	/**
	 * Clears the cache for all ncra applicant detail infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcraApplicantDetailInfoImpl.class);

		finderCache.clearCache(NcraApplicantDetailInfoImpl.class);
	}

	/**
	 * Clears the cache for the ncra applicant detail info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcraApplicantDetailInfo ncraApplicantDetailInfo) {
		entityCache.removeResult(
			NcraApplicantDetailInfoImpl.class, ncraApplicantDetailInfo);
	}

	@Override
	public void clearCache(
		List<NcraApplicantDetailInfo> ncraApplicantDetailInfos) {

		for (NcraApplicantDetailInfo ncraApplicantDetailInfo :
				ncraApplicantDetailInfos) {

			entityCache.removeResult(
				NcraApplicantDetailInfoImpl.class, ncraApplicantDetailInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcraApplicantDetailInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				NcraApplicantDetailInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcraApplicantDetailInfoModelImpl ncraApplicantDetailInfoModelImpl) {

		Object[] args = new Object[] {
			ncraApplicantDetailInfoModelImpl.getNcraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNcraDetail_By_App_Id, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcraDetail_By_App_Id, args,
			ncraApplicantDetailInfoModelImpl);
	}

	/**
	 * Creates a new ncra applicant detail info with the primary key. Does not add the ncra applicant detail info to the database.
	 *
	 * @param ncraApplicantDetailInfoId the primary key for the new ncra applicant detail info
	 * @return the new ncra applicant detail info
	 */
	@Override
	public NcraApplicantDetailInfo create(long ncraApplicantDetailInfoId) {
		NcraApplicantDetailInfo ncraApplicantDetailInfo =
			new NcraApplicantDetailInfoImpl();

		ncraApplicantDetailInfo.setNew(true);
		ncraApplicantDetailInfo.setPrimaryKey(ncraApplicantDetailInfoId);

		ncraApplicantDetailInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncraApplicantDetailInfo;
	}

	/**
	 * Removes the ncra applicant detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraApplicantDetailInfoId the primary key of the ncra applicant detail info
	 * @return the ncra applicant detail info that was removed
	 * @throws NoSuchNcraApplicantDetailInfoException if a ncra applicant detail info with the primary key could not be found
	 */
	@Override
	public NcraApplicantDetailInfo remove(long ncraApplicantDetailInfoId)
		throws NoSuchNcraApplicantDetailInfoException {

		return remove((Serializable)ncraApplicantDetailInfoId);
	}

	/**
	 * Removes the ncra applicant detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncra applicant detail info
	 * @return the ncra applicant detail info that was removed
	 * @throws NoSuchNcraApplicantDetailInfoException if a ncra applicant detail info with the primary key could not be found
	 */
	@Override
	public NcraApplicantDetailInfo remove(Serializable primaryKey)
		throws NoSuchNcraApplicantDetailInfoException {

		Session session = null;

		try {
			session = openSession();

			NcraApplicantDetailInfo ncraApplicantDetailInfo =
				(NcraApplicantDetailInfo)session.get(
					NcraApplicantDetailInfoImpl.class, primaryKey);

			if (ncraApplicantDetailInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcraApplicantDetailInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncraApplicantDetailInfo);
		}
		catch (NoSuchNcraApplicantDetailInfoException noSuchEntityException) {
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
	protected NcraApplicantDetailInfo removeImpl(
		NcraApplicantDetailInfo ncraApplicantDetailInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncraApplicantDetailInfo)) {
				ncraApplicantDetailInfo = (NcraApplicantDetailInfo)session.get(
					NcraApplicantDetailInfoImpl.class,
					ncraApplicantDetailInfo.getPrimaryKeyObj());
			}

			if (ncraApplicantDetailInfo != null) {
				session.delete(ncraApplicantDetailInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncraApplicantDetailInfo != null) {
			clearCache(ncraApplicantDetailInfo);
		}

		return ncraApplicantDetailInfo;
	}

	@Override
	public NcraApplicantDetailInfo updateImpl(
		NcraApplicantDetailInfo ncraApplicantDetailInfo) {

		boolean isNew = ncraApplicantDetailInfo.isNew();

		if (!(ncraApplicantDetailInfo instanceof
				NcraApplicantDetailInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncraApplicantDetailInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncraApplicantDetailInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncraApplicantDetailInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcraApplicantDetailInfo implementation " +
					ncraApplicantDetailInfo.getClass());
		}

		NcraApplicantDetailInfoModelImpl ncraApplicantDetailInfoModelImpl =
			(NcraApplicantDetailInfoModelImpl)ncraApplicantDetailInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncraApplicantDetailInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncraApplicantDetailInfo.setCreateDate(date);
			}
			else {
				ncraApplicantDetailInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncraApplicantDetailInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncraApplicantDetailInfo.setModifiedDate(date);
			}
			else {
				ncraApplicantDetailInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncraApplicantDetailInfo);
			}
			else {
				ncraApplicantDetailInfo =
					(NcraApplicantDetailInfo)session.merge(
						ncraApplicantDetailInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcraApplicantDetailInfoImpl.class, ncraApplicantDetailInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(ncraApplicantDetailInfoModelImpl);

		if (isNew) {
			ncraApplicantDetailInfo.setNew(false);
		}

		ncraApplicantDetailInfo.resetOriginalValues();

		return ncraApplicantDetailInfo;
	}

	/**
	 * Returns the ncra applicant detail info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncra applicant detail info
	 * @return the ncra applicant detail info
	 * @throws NoSuchNcraApplicantDetailInfoException if a ncra applicant detail info with the primary key could not be found
	 */
	@Override
	public NcraApplicantDetailInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcraApplicantDetailInfoException {

		NcraApplicantDetailInfo ncraApplicantDetailInfo = fetchByPrimaryKey(
			primaryKey);

		if (ncraApplicantDetailInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcraApplicantDetailInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncraApplicantDetailInfo;
	}

	/**
	 * Returns the ncra applicant detail info with the primary key or throws a <code>NoSuchNcraApplicantDetailInfoException</code> if it could not be found.
	 *
	 * @param ncraApplicantDetailInfoId the primary key of the ncra applicant detail info
	 * @return the ncra applicant detail info
	 * @throws NoSuchNcraApplicantDetailInfoException if a ncra applicant detail info with the primary key could not be found
	 */
	@Override
	public NcraApplicantDetailInfo findByPrimaryKey(
			long ncraApplicantDetailInfoId)
		throws NoSuchNcraApplicantDetailInfoException {

		return findByPrimaryKey((Serializable)ncraApplicantDetailInfoId);
	}

	/**
	 * Returns the ncra applicant detail info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraApplicantDetailInfoId the primary key of the ncra applicant detail info
	 * @return the ncra applicant detail info, or <code>null</code> if a ncra applicant detail info with the primary key could not be found
	 */
	@Override
	public NcraApplicantDetailInfo fetchByPrimaryKey(
		long ncraApplicantDetailInfoId) {

		return fetchByPrimaryKey((Serializable)ncraApplicantDetailInfoId);
	}

	/**
	 * Returns all the ncra applicant detail infos.
	 *
	 * @return the ncra applicant detail infos
	 */
	@Override
	public List<NcraApplicantDetailInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra applicant detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicantDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applicant detail infos
	 * @param end the upper bound of the range of ncra applicant detail infos (not inclusive)
	 * @return the range of ncra applicant detail infos
	 */
	@Override
	public List<NcraApplicantDetailInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra applicant detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicantDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applicant detail infos
	 * @param end the upper bound of the range of ncra applicant detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra applicant detail infos
	 */
	@Override
	public List<NcraApplicantDetailInfo> findAll(
		int start, int end,
		OrderByComparator<NcraApplicantDetailInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra applicant detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicantDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applicant detail infos
	 * @param end the upper bound of the range of ncra applicant detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra applicant detail infos
	 */
	@Override
	public List<NcraApplicantDetailInfo> findAll(
		int start, int end,
		OrderByComparator<NcraApplicantDetailInfo> orderByComparator,
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

		List<NcraApplicantDetailInfo> list = null;

		if (useFinderCache) {
			list = (List<NcraApplicantDetailInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCRAAPPLICANTDETAILINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCRAAPPLICANTDETAILINFO;

				sql = sql.concat(
					NcraApplicantDetailInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcraApplicantDetailInfo>)QueryUtil.list(
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
	 * Removes all the ncra applicant detail infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcraApplicantDetailInfo ncraApplicantDetailInfo : findAll()) {
			remove(ncraApplicantDetailInfo);
		}
	}

	/**
	 * Returns the number of ncra applicant detail infos.
	 *
	 * @return the number of ncra applicant detail infos
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
					_SQL_COUNT_NCRAAPPLICANTDETAILINFO);

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
		return "ncraApplicantDetailInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCRAAPPLICANTDETAILINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcraApplicantDetailInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncra applicant detail info persistence.
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

		_finderPathFetchBygetNcraDetail_By_App_Id = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcraDetail_By_App_Id",
			new String[] {Long.class.getName()},
			new String[] {"ncraApplicationId"}, true);

		_finderPathCountBygetNcraDetail_By_App_Id = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcraDetail_By_App_Id",
			new String[] {Long.class.getName()},
			new String[] {"ncraApplicationId"}, false);

		NcraApplicantDetailInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcraApplicantDetailInfoUtil.setPersistence(null);

		entityCache.removeCache(NcraApplicantDetailInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCRAAPPLICANTDETAILINFO =
		"SELECT ncraApplicantDetailInfo FROM NcraApplicantDetailInfo ncraApplicantDetailInfo";

	private static final String _SQL_SELECT_NCRAAPPLICANTDETAILINFO_WHERE =
		"SELECT ncraApplicantDetailInfo FROM NcraApplicantDetailInfo ncraApplicantDetailInfo WHERE ";

	private static final String _SQL_COUNT_NCRAAPPLICANTDETAILINFO =
		"SELECT COUNT(ncraApplicantDetailInfo) FROM NcraApplicantDetailInfo ncraApplicantDetailInfo";

	private static final String _SQL_COUNT_NCRAAPPLICANTDETAILINFO_WHERE =
		"SELECT COUNT(ncraApplicantDetailInfo) FROM NcraApplicantDetailInfo ncraApplicantDetailInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"ncraApplicantDetailInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcraApplicantDetailInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcraApplicantDetailInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcraApplicantDetailInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}