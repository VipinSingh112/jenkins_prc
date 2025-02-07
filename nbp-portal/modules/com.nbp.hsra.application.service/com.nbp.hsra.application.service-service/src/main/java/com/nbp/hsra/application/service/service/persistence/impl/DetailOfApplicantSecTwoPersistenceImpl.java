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

import com.nbp.hsra.application.service.exception.NoSuchDetailOfApplicantSecTwoException;
import com.nbp.hsra.application.service.model.DetailOfApplicantSecTwo;
import com.nbp.hsra.application.service.model.DetailOfApplicantSecTwoTable;
import com.nbp.hsra.application.service.model.impl.DetailOfApplicantSecTwoImpl;
import com.nbp.hsra.application.service.model.impl.DetailOfApplicantSecTwoModelImpl;
import com.nbp.hsra.application.service.service.persistence.DetailOfApplicantSecTwoPersistence;
import com.nbp.hsra.application.service.service.persistence.DetailOfApplicantSecTwoUtil;
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
 * The persistence implementation for the detail of applicant sec two service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = DetailOfApplicantSecTwoPersistence.class)
public class DetailOfApplicantSecTwoPersistenceImpl
	extends BasePersistenceImpl<DetailOfApplicantSecTwo>
	implements DetailOfApplicantSecTwoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DetailOfApplicantSecTwoUtil</code> to access the detail of applicant sec two persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DetailOfApplicantSecTwoImpl.class.getName();

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
	 * Returns the detail of applicant sec two where hsraApplicationId = &#63; or throws a <code>NoSuchDetailOfApplicantSecTwoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching detail of applicant sec two
	 * @throws NoSuchDetailOfApplicantSecTwoException if a matching detail of applicant sec two could not be found
	 */
	@Override
	public DetailOfApplicantSecTwo findBygetHsraById(long hsraApplicationId)
		throws NoSuchDetailOfApplicantSecTwoException {

		DetailOfApplicantSecTwo detailOfApplicantSecTwo = fetchBygetHsraById(
			hsraApplicationId);

		if (detailOfApplicantSecTwo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchDetailOfApplicantSecTwoException(sb.toString());
		}

		return detailOfApplicantSecTwo;
	}

	/**
	 * Returns the detail of applicant sec two where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching detail of applicant sec two, or <code>null</code> if a matching detail of applicant sec two could not be found
	 */
	@Override
	public DetailOfApplicantSecTwo fetchBygetHsraById(long hsraApplicationId) {
		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the detail of applicant sec two where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching detail of applicant sec two, or <code>null</code> if a matching detail of applicant sec two could not be found
	 */
	@Override
	public DetailOfApplicantSecTwo fetchBygetHsraById(
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

		if (result instanceof DetailOfApplicantSecTwo) {
			DetailOfApplicantSecTwo detailOfApplicantSecTwo =
				(DetailOfApplicantSecTwo)result;

			if (hsraApplicationId !=
					detailOfApplicantSecTwo.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_DETAILOFAPPLICANTSECTWO_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<DetailOfApplicantSecTwo> list = query.list();

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
								"DetailOfApplicantSecTwoPersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					DetailOfApplicantSecTwo detailOfApplicantSecTwo = list.get(
						0);

					result = detailOfApplicantSecTwo;

					cacheResult(detailOfApplicantSecTwo);
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
			return (DetailOfApplicantSecTwo)result;
		}
	}

	/**
	 * Removes the detail of applicant sec two where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the detail of applicant sec two that was removed
	 */
	@Override
	public DetailOfApplicantSecTwo removeBygetHsraById(long hsraApplicationId)
		throws NoSuchDetailOfApplicantSecTwoException {

		DetailOfApplicantSecTwo detailOfApplicantSecTwo = findBygetHsraById(
			hsraApplicationId);

		return remove(detailOfApplicantSecTwo);
	}

	/**
	 * Returns the number of detail of applicant sec twos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching detail of applicant sec twos
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DETAILOFAPPLICANTSECTWO_WHERE);

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
		"detailOfApplicantSecTwo.hsraApplicationId = ?";

	public DetailOfApplicantSecTwoPersistenceImpl() {
		setModelClass(DetailOfApplicantSecTwo.class);

		setModelImplClass(DetailOfApplicantSecTwoImpl.class);
		setModelPKClass(long.class);

		setTable(DetailOfApplicantSecTwoTable.INSTANCE);
	}

	/**
	 * Caches the detail of applicant sec two in the entity cache if it is enabled.
	 *
	 * @param detailOfApplicantSecTwo the detail of applicant sec two
	 */
	@Override
	public void cacheResult(DetailOfApplicantSecTwo detailOfApplicantSecTwo) {
		entityCache.putResult(
			DetailOfApplicantSecTwoImpl.class,
			detailOfApplicantSecTwo.getPrimaryKey(), detailOfApplicantSecTwo);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {detailOfApplicantSecTwo.getHsraApplicationId()},
			detailOfApplicantSecTwo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the detail of applicant sec twos in the entity cache if it is enabled.
	 *
	 * @param detailOfApplicantSecTwos the detail of applicant sec twos
	 */
	@Override
	public void cacheResult(
		List<DetailOfApplicantSecTwo> detailOfApplicantSecTwos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (detailOfApplicantSecTwos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (DetailOfApplicantSecTwo detailOfApplicantSecTwo :
				detailOfApplicantSecTwos) {

			if (entityCache.getResult(
					DetailOfApplicantSecTwoImpl.class,
					detailOfApplicantSecTwo.getPrimaryKey()) == null) {

				cacheResult(detailOfApplicantSecTwo);
			}
		}
	}

	/**
	 * Clears the cache for all detail of applicant sec twos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DetailOfApplicantSecTwoImpl.class);

		finderCache.clearCache(DetailOfApplicantSecTwoImpl.class);
	}

	/**
	 * Clears the cache for the detail of applicant sec two.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DetailOfApplicantSecTwo detailOfApplicantSecTwo) {
		entityCache.removeResult(
			DetailOfApplicantSecTwoImpl.class, detailOfApplicantSecTwo);
	}

	@Override
	public void clearCache(
		List<DetailOfApplicantSecTwo> detailOfApplicantSecTwos) {

		for (DetailOfApplicantSecTwo detailOfApplicantSecTwo :
				detailOfApplicantSecTwos) {

			entityCache.removeResult(
				DetailOfApplicantSecTwoImpl.class, detailOfApplicantSecTwo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DetailOfApplicantSecTwoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				DetailOfApplicantSecTwoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		DetailOfApplicantSecTwoModelImpl detailOfApplicantSecTwoModelImpl) {

		Object[] args = new Object[] {
			detailOfApplicantSecTwoModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args,
			detailOfApplicantSecTwoModelImpl);
	}

	/**
	 * Creates a new detail of applicant sec two with the primary key. Does not add the detail of applicant sec two to the database.
	 *
	 * @param detailOfAppliSecTwoId the primary key for the new detail of applicant sec two
	 * @return the new detail of applicant sec two
	 */
	@Override
	public DetailOfApplicantSecTwo create(long detailOfAppliSecTwoId) {
		DetailOfApplicantSecTwo detailOfApplicantSecTwo =
			new DetailOfApplicantSecTwoImpl();

		detailOfApplicantSecTwo.setNew(true);
		detailOfApplicantSecTwo.setPrimaryKey(detailOfAppliSecTwoId);

		detailOfApplicantSecTwo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return detailOfApplicantSecTwo;
	}

	/**
	 * Removes the detail of applicant sec two with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param detailOfAppliSecTwoId the primary key of the detail of applicant sec two
	 * @return the detail of applicant sec two that was removed
	 * @throws NoSuchDetailOfApplicantSecTwoException if a detail of applicant sec two with the primary key could not be found
	 */
	@Override
	public DetailOfApplicantSecTwo remove(long detailOfAppliSecTwoId)
		throws NoSuchDetailOfApplicantSecTwoException {

		return remove((Serializable)detailOfAppliSecTwoId);
	}

	/**
	 * Removes the detail of applicant sec two with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the detail of applicant sec two
	 * @return the detail of applicant sec two that was removed
	 * @throws NoSuchDetailOfApplicantSecTwoException if a detail of applicant sec two with the primary key could not be found
	 */
	@Override
	public DetailOfApplicantSecTwo remove(Serializable primaryKey)
		throws NoSuchDetailOfApplicantSecTwoException {

		Session session = null;

		try {
			session = openSession();

			DetailOfApplicantSecTwo detailOfApplicantSecTwo =
				(DetailOfApplicantSecTwo)session.get(
					DetailOfApplicantSecTwoImpl.class, primaryKey);

			if (detailOfApplicantSecTwo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDetailOfApplicantSecTwoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(detailOfApplicantSecTwo);
		}
		catch (NoSuchDetailOfApplicantSecTwoException noSuchEntityException) {
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
	protected DetailOfApplicantSecTwo removeImpl(
		DetailOfApplicantSecTwo detailOfApplicantSecTwo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(detailOfApplicantSecTwo)) {
				detailOfApplicantSecTwo = (DetailOfApplicantSecTwo)session.get(
					DetailOfApplicantSecTwoImpl.class,
					detailOfApplicantSecTwo.getPrimaryKeyObj());
			}

			if (detailOfApplicantSecTwo != null) {
				session.delete(detailOfApplicantSecTwo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (detailOfApplicantSecTwo != null) {
			clearCache(detailOfApplicantSecTwo);
		}

		return detailOfApplicantSecTwo;
	}

	@Override
	public DetailOfApplicantSecTwo updateImpl(
		DetailOfApplicantSecTwo detailOfApplicantSecTwo) {

		boolean isNew = detailOfApplicantSecTwo.isNew();

		if (!(detailOfApplicantSecTwo instanceof
				DetailOfApplicantSecTwoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(detailOfApplicantSecTwo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					detailOfApplicantSecTwo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in detailOfApplicantSecTwo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DetailOfApplicantSecTwo implementation " +
					detailOfApplicantSecTwo.getClass());
		}

		DetailOfApplicantSecTwoModelImpl detailOfApplicantSecTwoModelImpl =
			(DetailOfApplicantSecTwoModelImpl)detailOfApplicantSecTwo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (detailOfApplicantSecTwo.getCreateDate() == null)) {
			if (serviceContext == null) {
				detailOfApplicantSecTwo.setCreateDate(date);
			}
			else {
				detailOfApplicantSecTwo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!detailOfApplicantSecTwoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				detailOfApplicantSecTwo.setModifiedDate(date);
			}
			else {
				detailOfApplicantSecTwo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(detailOfApplicantSecTwo);
			}
			else {
				detailOfApplicantSecTwo =
					(DetailOfApplicantSecTwo)session.merge(
						detailOfApplicantSecTwo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DetailOfApplicantSecTwoImpl.class, detailOfApplicantSecTwoModelImpl,
			false, true);

		cacheUniqueFindersCache(detailOfApplicantSecTwoModelImpl);

		if (isNew) {
			detailOfApplicantSecTwo.setNew(false);
		}

		detailOfApplicantSecTwo.resetOriginalValues();

		return detailOfApplicantSecTwo;
	}

	/**
	 * Returns the detail of applicant sec two with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the detail of applicant sec two
	 * @return the detail of applicant sec two
	 * @throws NoSuchDetailOfApplicantSecTwoException if a detail of applicant sec two with the primary key could not be found
	 */
	@Override
	public DetailOfApplicantSecTwo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDetailOfApplicantSecTwoException {

		DetailOfApplicantSecTwo detailOfApplicantSecTwo = fetchByPrimaryKey(
			primaryKey);

		if (detailOfApplicantSecTwo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDetailOfApplicantSecTwoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return detailOfApplicantSecTwo;
	}

	/**
	 * Returns the detail of applicant sec two with the primary key or throws a <code>NoSuchDetailOfApplicantSecTwoException</code> if it could not be found.
	 *
	 * @param detailOfAppliSecTwoId the primary key of the detail of applicant sec two
	 * @return the detail of applicant sec two
	 * @throws NoSuchDetailOfApplicantSecTwoException if a detail of applicant sec two with the primary key could not be found
	 */
	@Override
	public DetailOfApplicantSecTwo findByPrimaryKey(long detailOfAppliSecTwoId)
		throws NoSuchDetailOfApplicantSecTwoException {

		return findByPrimaryKey((Serializable)detailOfAppliSecTwoId);
	}

	/**
	 * Returns the detail of applicant sec two with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param detailOfAppliSecTwoId the primary key of the detail of applicant sec two
	 * @return the detail of applicant sec two, or <code>null</code> if a detail of applicant sec two with the primary key could not be found
	 */
	@Override
	public DetailOfApplicantSecTwo fetchByPrimaryKey(
		long detailOfAppliSecTwoId) {

		return fetchByPrimaryKey((Serializable)detailOfAppliSecTwoId);
	}

	/**
	 * Returns all the detail of applicant sec twos.
	 *
	 * @return the detail of applicant sec twos
	 */
	@Override
	public List<DetailOfApplicantSecTwo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the detail of applicant sec twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantSecTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicant sec twos
	 * @param end the upper bound of the range of detail of applicant sec twos (not inclusive)
	 * @return the range of detail of applicant sec twos
	 */
	@Override
	public List<DetailOfApplicantSecTwo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the detail of applicant sec twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantSecTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicant sec twos
	 * @param end the upper bound of the range of detail of applicant sec twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of detail of applicant sec twos
	 */
	@Override
	public List<DetailOfApplicantSecTwo> findAll(
		int start, int end,
		OrderByComparator<DetailOfApplicantSecTwo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the detail of applicant sec twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantSecTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicant sec twos
	 * @param end the upper bound of the range of detail of applicant sec twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of detail of applicant sec twos
	 */
	@Override
	public List<DetailOfApplicantSecTwo> findAll(
		int start, int end,
		OrderByComparator<DetailOfApplicantSecTwo> orderByComparator,
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

		List<DetailOfApplicantSecTwo> list = null;

		if (useFinderCache) {
			list = (List<DetailOfApplicantSecTwo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DETAILOFAPPLICANTSECTWO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DETAILOFAPPLICANTSECTWO;

				sql = sql.concat(
					DetailOfApplicantSecTwoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DetailOfApplicantSecTwo>)QueryUtil.list(
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
	 * Removes all the detail of applicant sec twos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DetailOfApplicantSecTwo detailOfApplicantSecTwo : findAll()) {
			remove(detailOfApplicantSecTwo);
		}
	}

	/**
	 * Returns the number of detail of applicant sec twos.
	 *
	 * @return the number of detail of applicant sec twos
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
					_SQL_COUNT_DETAILOFAPPLICANTSECTWO);

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
		return "detailOfAppliSecTwoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_DETAILOFAPPLICANTSECTWO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DetailOfApplicantSecTwoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the detail of applicant sec two persistence.
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

		DetailOfApplicantSecTwoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		DetailOfApplicantSecTwoUtil.setPersistence(null);

		entityCache.removeCache(DetailOfApplicantSecTwoImpl.class.getName());
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

	private static final String _SQL_SELECT_DETAILOFAPPLICANTSECTWO =
		"SELECT detailOfApplicantSecTwo FROM DetailOfApplicantSecTwo detailOfApplicantSecTwo";

	private static final String _SQL_SELECT_DETAILOFAPPLICANTSECTWO_WHERE =
		"SELECT detailOfApplicantSecTwo FROM DetailOfApplicantSecTwo detailOfApplicantSecTwo WHERE ";

	private static final String _SQL_COUNT_DETAILOFAPPLICANTSECTWO =
		"SELECT COUNT(detailOfApplicantSecTwo) FROM DetailOfApplicantSecTwo detailOfApplicantSecTwo";

	private static final String _SQL_COUNT_DETAILOFAPPLICANTSECTWO_WHERE =
		"SELECT COUNT(detailOfApplicantSecTwo) FROM DetailOfApplicantSecTwo detailOfApplicantSecTwo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"detailOfApplicantSecTwo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DetailOfApplicantSecTwo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DetailOfApplicantSecTwo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DetailOfApplicantSecTwoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}