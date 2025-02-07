/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence.impl;

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

import com.nbp.creative.application.form.service.exception.NoSuchCreativeIndividualDetailsException;
import com.nbp.creative.application.form.service.model.CreativeIndividualDetails;
import com.nbp.creative.application.form.service.model.CreativeIndividualDetailsTable;
import com.nbp.creative.application.form.service.model.impl.CreativeIndividualDetailsImpl;
import com.nbp.creative.application.form.service.model.impl.CreativeIndividualDetailsModelImpl;
import com.nbp.creative.application.form.service.service.persistence.CreativeIndividualDetailsPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeIndividualDetailsUtil;
import com.nbp.creative.application.form.service.service.persistence.impl.constants.CREATIVEPersistenceConstants;

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
 * The persistence implementation for the creative individual details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CreativeIndividualDetailsPersistence.class)
public class CreativeIndividualDetailsPersistenceImpl
	extends BasePersistenceImpl<CreativeIndividualDetails>
	implements CreativeIndividualDetailsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CreativeIndividualDetailsUtil</code> to access the creative individual details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CreativeIndividualDetailsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetCreativeById;
	private FinderPath _finderPathCountBygetCreativeById;

	/**
	 * Returns the creative individual details where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeIndividualDetailsException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative individual details
	 * @throws NoSuchCreativeIndividualDetailsException if a matching creative individual details could not be found
	 */
	@Override
	public CreativeIndividualDetails findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeIndividualDetailsException {

		CreativeIndividualDetails creativeIndividualDetails =
			fetchBygetCreativeById(CreativeApplicationId);

		if (creativeIndividualDetails == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("CreativeApplicationId=");
			sb.append(CreativeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCreativeIndividualDetailsException(sb.toString());
		}

		return creativeIndividualDetails;
	}

	/**
	 * Returns the creative individual details where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative individual details, or <code>null</code> if a matching creative individual details could not be found
	 */
	@Override
	public CreativeIndividualDetails fetchBygetCreativeById(
		long CreativeApplicationId) {

		return fetchBygetCreativeById(CreativeApplicationId, true);
	}

	/**
	 * Returns the creative individual details where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative individual details, or <code>null</code> if a matching creative individual details could not be found
	 */
	@Override
	public CreativeIndividualDetails fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {CreativeApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCreativeById, finderArgs, this);
		}

		if (result instanceof CreativeIndividualDetails) {
			CreativeIndividualDetails creativeIndividualDetails =
				(CreativeIndividualDetails)result;

			if (CreativeApplicationId !=
					creativeIndividualDetails.getCreativeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CREATIVEINDIVIDUALDETAILS_WHERE);

			sb.append(_FINDER_COLUMN_GETCREATIVEBYID_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

				List<CreativeIndividualDetails> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCreativeById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									CreativeApplicationId
								};
							}

							_log.warn(
								"CreativeIndividualDetailsPersistenceImpl.fetchBygetCreativeById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeIndividualDetails creativeIndividualDetails =
						list.get(0);

					result = creativeIndividualDetails;

					cacheResult(creativeIndividualDetails);
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
			return (CreativeIndividualDetails)result;
		}
	}

	/**
	 * Removes the creative individual details where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative individual details that was removed
	 */
	@Override
	public CreativeIndividualDetails removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeIndividualDetailsException {

		CreativeIndividualDetails creativeIndividualDetails =
			findBygetCreativeById(CreativeApplicationId);

		return remove(creativeIndividualDetails);
	}

	/**
	 * Returns the number of creative individual detailses where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative individual detailses
	 */
	@Override
	public int countBygetCreativeById(long CreativeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCreativeById;

		Object[] finderArgs = new Object[] {CreativeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEINDIVIDUALDETAILS_WHERE);

			sb.append(_FINDER_COLUMN_GETCREATIVEBYID_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

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
		_FINDER_COLUMN_GETCREATIVEBYID_CREATIVEAPPLICATIONID_2 =
			"creativeIndividualDetails.CreativeApplicationId = ?";

	public CreativeIndividualDetailsPersistenceImpl() {
		setModelClass(CreativeIndividualDetails.class);

		setModelImplClass(CreativeIndividualDetailsImpl.class);
		setModelPKClass(long.class);

		setTable(CreativeIndividualDetailsTable.INSTANCE);
	}

	/**
	 * Caches the creative individual details in the entity cache if it is enabled.
	 *
	 * @param creativeIndividualDetails the creative individual details
	 */
	@Override
	public void cacheResult(
		CreativeIndividualDetails creativeIndividualDetails) {

		entityCache.putResult(
			CreativeIndividualDetailsImpl.class,
			creativeIndividualDetails.getPrimaryKey(),
			creativeIndividualDetails);

		finderCache.putResult(
			_finderPathFetchBygetCreativeById,
			new Object[] {creativeIndividualDetails.getCreativeApplicationId()},
			creativeIndividualDetails);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the creative individual detailses in the entity cache if it is enabled.
	 *
	 * @param creativeIndividualDetailses the creative individual detailses
	 */
	@Override
	public void cacheResult(
		List<CreativeIndividualDetails> creativeIndividualDetailses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (creativeIndividualDetailses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CreativeIndividualDetails creativeIndividualDetails :
				creativeIndividualDetailses) {

			if (entityCache.getResult(
					CreativeIndividualDetailsImpl.class,
					creativeIndividualDetails.getPrimaryKey()) == null) {

				cacheResult(creativeIndividualDetails);
			}
		}
	}

	/**
	 * Clears the cache for all creative individual detailses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CreativeIndividualDetailsImpl.class);

		finderCache.clearCache(CreativeIndividualDetailsImpl.class);
	}

	/**
	 * Clears the cache for the creative individual details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CreativeIndividualDetails creativeIndividualDetails) {

		entityCache.removeResult(
			CreativeIndividualDetailsImpl.class, creativeIndividualDetails);
	}

	@Override
	public void clearCache(
		List<CreativeIndividualDetails> creativeIndividualDetailses) {

		for (CreativeIndividualDetails creativeIndividualDetails :
				creativeIndividualDetailses) {

			entityCache.removeResult(
				CreativeIndividualDetailsImpl.class, creativeIndividualDetails);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CreativeIndividualDetailsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CreativeIndividualDetailsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CreativeIndividualDetailsModelImpl creativeIndividualDetailsModelImpl) {

		Object[] args = new Object[] {
			creativeIndividualDetailsModelImpl.getCreativeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCreativeById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCreativeById, args,
			creativeIndividualDetailsModelImpl);
	}

	/**
	 * Creates a new creative individual details with the primary key. Does not add the creative individual details to the database.
	 *
	 * @param creativeIndividualDetailsId the primary key for the new creative individual details
	 * @return the new creative individual details
	 */
	@Override
	public CreativeIndividualDetails create(long creativeIndividualDetailsId) {
		CreativeIndividualDetails creativeIndividualDetails =
			new CreativeIndividualDetailsImpl();

		creativeIndividualDetails.setNew(true);
		creativeIndividualDetails.setPrimaryKey(creativeIndividualDetailsId);

		creativeIndividualDetails.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return creativeIndividualDetails;
	}

	/**
	 * Removes the creative individual details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeIndividualDetailsId the primary key of the creative individual details
	 * @return the creative individual details that was removed
	 * @throws NoSuchCreativeIndividualDetailsException if a creative individual details with the primary key could not be found
	 */
	@Override
	public CreativeIndividualDetails remove(long creativeIndividualDetailsId)
		throws NoSuchCreativeIndividualDetailsException {

		return remove((Serializable)creativeIndividualDetailsId);
	}

	/**
	 * Removes the creative individual details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the creative individual details
	 * @return the creative individual details that was removed
	 * @throws NoSuchCreativeIndividualDetailsException if a creative individual details with the primary key could not be found
	 */
	@Override
	public CreativeIndividualDetails remove(Serializable primaryKey)
		throws NoSuchCreativeIndividualDetailsException {

		Session session = null;

		try {
			session = openSession();

			CreativeIndividualDetails creativeIndividualDetails =
				(CreativeIndividualDetails)session.get(
					CreativeIndividualDetailsImpl.class, primaryKey);

			if (creativeIndividualDetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreativeIndividualDetailsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(creativeIndividualDetails);
		}
		catch (NoSuchCreativeIndividualDetailsException noSuchEntityException) {
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
	protected CreativeIndividualDetails removeImpl(
		CreativeIndividualDetails creativeIndividualDetails) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(creativeIndividualDetails)) {
				creativeIndividualDetails =
					(CreativeIndividualDetails)session.get(
						CreativeIndividualDetailsImpl.class,
						creativeIndividualDetails.getPrimaryKeyObj());
			}

			if (creativeIndividualDetails != null) {
				session.delete(creativeIndividualDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (creativeIndividualDetails != null) {
			clearCache(creativeIndividualDetails);
		}

		return creativeIndividualDetails;
	}

	@Override
	public CreativeIndividualDetails updateImpl(
		CreativeIndividualDetails creativeIndividualDetails) {

		boolean isNew = creativeIndividualDetails.isNew();

		if (!(creativeIndividualDetails instanceof
				CreativeIndividualDetailsModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(creativeIndividualDetails.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					creativeIndividualDetails);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in creativeIndividualDetails proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CreativeIndividualDetails implementation " +
					creativeIndividualDetails.getClass());
		}

		CreativeIndividualDetailsModelImpl creativeIndividualDetailsModelImpl =
			(CreativeIndividualDetailsModelImpl)creativeIndividualDetails;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (creativeIndividualDetails.getCreateDate() == null)) {
			if (serviceContext == null) {
				creativeIndividualDetails.setCreateDate(date);
			}
			else {
				creativeIndividualDetails.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!creativeIndividualDetailsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				creativeIndividualDetails.setModifiedDate(date);
			}
			else {
				creativeIndividualDetails.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(creativeIndividualDetails);
			}
			else {
				creativeIndividualDetails =
					(CreativeIndividualDetails)session.merge(
						creativeIndividualDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CreativeIndividualDetailsImpl.class,
			creativeIndividualDetailsModelImpl, false, true);

		cacheUniqueFindersCache(creativeIndividualDetailsModelImpl);

		if (isNew) {
			creativeIndividualDetails.setNew(false);
		}

		creativeIndividualDetails.resetOriginalValues();

		return creativeIndividualDetails;
	}

	/**
	 * Returns the creative individual details with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the creative individual details
	 * @return the creative individual details
	 * @throws NoSuchCreativeIndividualDetailsException if a creative individual details with the primary key could not be found
	 */
	@Override
	public CreativeIndividualDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCreativeIndividualDetailsException {

		CreativeIndividualDetails creativeIndividualDetails = fetchByPrimaryKey(
			primaryKey);

		if (creativeIndividualDetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreativeIndividualDetailsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return creativeIndividualDetails;
	}

	/**
	 * Returns the creative individual details with the primary key or throws a <code>NoSuchCreativeIndividualDetailsException</code> if it could not be found.
	 *
	 * @param creativeIndividualDetailsId the primary key of the creative individual details
	 * @return the creative individual details
	 * @throws NoSuchCreativeIndividualDetailsException if a creative individual details with the primary key could not be found
	 */
	@Override
	public CreativeIndividualDetails findByPrimaryKey(
			long creativeIndividualDetailsId)
		throws NoSuchCreativeIndividualDetailsException {

		return findByPrimaryKey((Serializable)creativeIndividualDetailsId);
	}

	/**
	 * Returns the creative individual details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeIndividualDetailsId the primary key of the creative individual details
	 * @return the creative individual details, or <code>null</code> if a creative individual details with the primary key could not be found
	 */
	@Override
	public CreativeIndividualDetails fetchByPrimaryKey(
		long creativeIndividualDetailsId) {

		return fetchByPrimaryKey((Serializable)creativeIndividualDetailsId);
	}

	/**
	 * Returns all the creative individual detailses.
	 *
	 * @return the creative individual detailses
	 */
	@Override
	public List<CreativeIndividualDetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative individual detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual detailses
	 * @param end the upper bound of the range of creative individual detailses (not inclusive)
	 * @return the range of creative individual detailses
	 */
	@Override
	public List<CreativeIndividualDetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative individual detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual detailses
	 * @param end the upper bound of the range of creative individual detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative individual detailses
	 */
	@Override
	public List<CreativeIndividualDetails> findAll(
		int start, int end,
		OrderByComparator<CreativeIndividualDetails> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative individual detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual detailses
	 * @param end the upper bound of the range of creative individual detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative individual detailses
	 */
	@Override
	public List<CreativeIndividualDetails> findAll(
		int start, int end,
		OrderByComparator<CreativeIndividualDetails> orderByComparator,
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

		List<CreativeIndividualDetails> list = null;

		if (useFinderCache) {
			list = (List<CreativeIndividualDetails>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CREATIVEINDIVIDUALDETAILS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREATIVEINDIVIDUALDETAILS;

				sql = sql.concat(
					CreativeIndividualDetailsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CreativeIndividualDetails>)QueryUtil.list(
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
	 * Removes all the creative individual detailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CreativeIndividualDetails creativeIndividualDetails : findAll()) {
			remove(creativeIndividualDetails);
		}
	}

	/**
	 * Returns the number of creative individual detailses.
	 *
	 * @return the number of creative individual detailses
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
					_SQL_COUNT_CREATIVEINDIVIDUALDETAILS);

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
		return "creativeIndividualDetailsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREATIVEINDIVIDUALDETAILS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CreativeIndividualDetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the creative individual details persistence.
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

		_finderPathFetchBygetCreativeById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCreativeById",
			new String[] {Long.class.getName()},
			new String[] {"CreativeApplicationId"}, true);

		_finderPathCountBygetCreativeById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCreativeById",
			new String[] {Long.class.getName()},
			new String[] {"CreativeApplicationId"}, false);

		CreativeIndividualDetailsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CreativeIndividualDetailsUtil.setPersistence(null);

		entityCache.removeCache(CreativeIndividualDetailsImpl.class.getName());
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CREATIVEINDIVIDUALDETAILS =
		"SELECT creativeIndividualDetails FROM CreativeIndividualDetails creativeIndividualDetails";

	private static final String _SQL_SELECT_CREATIVEINDIVIDUALDETAILS_WHERE =
		"SELECT creativeIndividualDetails FROM CreativeIndividualDetails creativeIndividualDetails WHERE ";

	private static final String _SQL_COUNT_CREATIVEINDIVIDUALDETAILS =
		"SELECT COUNT(creativeIndividualDetails) FROM CreativeIndividualDetails creativeIndividualDetails";

	private static final String _SQL_COUNT_CREATIVEINDIVIDUALDETAILS_WHERE =
		"SELECT COUNT(creativeIndividualDetails) FROM CreativeIndividualDetails creativeIndividualDetails WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"creativeIndividualDetails.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CreativeIndividualDetails exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CreativeIndividualDetails exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CreativeIndividualDetailsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}