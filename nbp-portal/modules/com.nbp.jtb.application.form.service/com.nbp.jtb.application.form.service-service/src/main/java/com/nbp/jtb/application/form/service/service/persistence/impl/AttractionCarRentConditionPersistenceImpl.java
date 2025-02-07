/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence.impl;

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

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionCarRentConditionException;
import com.nbp.jtb.application.form.service.model.AttractionCarRentCondition;
import com.nbp.jtb.application.form.service.model.AttractionCarRentConditionTable;
import com.nbp.jtb.application.form.service.model.impl.AttractionCarRentConditionImpl;
import com.nbp.jtb.application.form.service.model.impl.AttractionCarRentConditionModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AttractionCarRentConditionPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionCarRentConditionUtil;
import com.nbp.jtb.application.form.service.service.persistence.impl.constants.JTB_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the attraction car rent condition service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AttractionCarRentConditionPersistence.class)
public class AttractionCarRentConditionPersistenceImpl
	extends BasePersistenceImpl<AttractionCarRentCondition>
	implements AttractionCarRentConditionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AttractionCarRentConditionUtil</code> to access the attraction car rent condition persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AttractionCarRentConditionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJTB_ByApplicationId;
	private FinderPath _finderPathCountBygetJTB_ByApplicationId;

	/**
	 * Returns the attraction car rent condition where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionCarRentConditionException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction car rent condition
	 * @throws NoSuchAttractionCarRentConditionException if a matching attraction car rent condition could not be found
	 */
	@Override
	public AttractionCarRentCondition findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionCarRentConditionException {

		AttractionCarRentCondition attractionCarRentCondition =
			fetchBygetJTB_ByApplicationId(jtbApplicationId);

		if (attractionCarRentCondition == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAttractionCarRentConditionException(sb.toString());
		}

		return attractionCarRentCondition;
	}

	/**
	 * Returns the attraction car rent condition where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction car rent condition, or <code>null</code> if a matching attraction car rent condition could not be found
	 */
	@Override
	public AttractionCarRentCondition fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the attraction car rent condition where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction car rent condition, or <code>null</code> if a matching attraction car rent condition could not be found
	 */
	@Override
	public AttractionCarRentCondition fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jtbApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJTB_ByApplicationId, finderArgs, this);
		}

		if (result instanceof AttractionCarRentCondition) {
			AttractionCarRentCondition attractionCarRentCondition =
				(AttractionCarRentCondition)result;

			if (jtbApplicationId !=
					attractionCarRentCondition.getJtbApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ATTRACTIONCARRENTCONDITION_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AttractionCarRentCondition> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJTB_ByApplicationId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {jtbApplicationId};
							}

							_log.warn(
								"AttractionCarRentConditionPersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AttractionCarRentCondition attractionCarRentCondition =
						list.get(0);

					result = attractionCarRentCondition;

					cacheResult(attractionCarRentCondition);
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
			return (AttractionCarRentCondition)result;
		}
	}

	/**
	 * Removes the attraction car rent condition where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction car rent condition that was removed
	 */
	@Override
	public AttractionCarRentCondition removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionCarRentConditionException {

		AttractionCarRentCondition attractionCarRentCondition =
			findBygetJTB_ByApplicationId(jtbApplicationId);

		return remove(attractionCarRentCondition);
	}

	/**
	 * Returns the number of attraction car rent conditions where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction car rent conditions
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ATTRACTIONCARRENTCONDITION_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

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
		_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2 =
			"attractionCarRentCondition.jtbApplicationId = ?";

	public AttractionCarRentConditionPersistenceImpl() {
		setModelClass(AttractionCarRentCondition.class);

		setModelImplClass(AttractionCarRentConditionImpl.class);
		setModelPKClass(long.class);

		setTable(AttractionCarRentConditionTable.INSTANCE);
	}

	/**
	 * Caches the attraction car rent condition in the entity cache if it is enabled.
	 *
	 * @param attractionCarRentCondition the attraction car rent condition
	 */
	@Override
	public void cacheResult(
		AttractionCarRentCondition attractionCarRentCondition) {

		entityCache.putResult(
			AttractionCarRentConditionImpl.class,
			attractionCarRentCondition.getPrimaryKey(),
			attractionCarRentCondition);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {attractionCarRentCondition.getJtbApplicationId()},
			attractionCarRentCondition);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the attraction car rent conditions in the entity cache if it is enabled.
	 *
	 * @param attractionCarRentConditions the attraction car rent conditions
	 */
	@Override
	public void cacheResult(
		List<AttractionCarRentCondition> attractionCarRentConditions) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (attractionCarRentConditions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AttractionCarRentCondition attractionCarRentCondition :
				attractionCarRentConditions) {

			if (entityCache.getResult(
					AttractionCarRentConditionImpl.class,
					attractionCarRentCondition.getPrimaryKey()) == null) {

				cacheResult(attractionCarRentCondition);
			}
		}
	}

	/**
	 * Clears the cache for all attraction car rent conditions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AttractionCarRentConditionImpl.class);

		finderCache.clearCache(AttractionCarRentConditionImpl.class);
	}

	/**
	 * Clears the cache for the attraction car rent condition.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AttractionCarRentCondition attractionCarRentCondition) {

		entityCache.removeResult(
			AttractionCarRentConditionImpl.class, attractionCarRentCondition);
	}

	@Override
	public void clearCache(
		List<AttractionCarRentCondition> attractionCarRentConditions) {

		for (AttractionCarRentCondition attractionCarRentCondition :
				attractionCarRentConditions) {

			entityCache.removeResult(
				AttractionCarRentConditionImpl.class,
				attractionCarRentCondition);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AttractionCarRentConditionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AttractionCarRentConditionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AttractionCarRentConditionModelImpl
			attractionCarRentConditionModelImpl) {

		Object[] args = new Object[] {
			attractionCarRentConditionModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			attractionCarRentConditionModelImpl);
	}

	/**
	 * Creates a new attraction car rent condition with the primary key. Does not add the attraction car rent condition to the database.
	 *
	 * @param attractionCarRenConditId the primary key for the new attraction car rent condition
	 * @return the new attraction car rent condition
	 */
	@Override
	public AttractionCarRentCondition create(long attractionCarRenConditId) {
		AttractionCarRentCondition attractionCarRentCondition =
			new AttractionCarRentConditionImpl();

		attractionCarRentCondition.setNew(true);
		attractionCarRentCondition.setPrimaryKey(attractionCarRenConditId);

		attractionCarRentCondition.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return attractionCarRentCondition;
	}

	/**
	 * Removes the attraction car rent condition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionCarRenConditId the primary key of the attraction car rent condition
	 * @return the attraction car rent condition that was removed
	 * @throws NoSuchAttractionCarRentConditionException if a attraction car rent condition with the primary key could not be found
	 */
	@Override
	public AttractionCarRentCondition remove(long attractionCarRenConditId)
		throws NoSuchAttractionCarRentConditionException {

		return remove((Serializable)attractionCarRenConditId);
	}

	/**
	 * Removes the attraction car rent condition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attraction car rent condition
	 * @return the attraction car rent condition that was removed
	 * @throws NoSuchAttractionCarRentConditionException if a attraction car rent condition with the primary key could not be found
	 */
	@Override
	public AttractionCarRentCondition remove(Serializable primaryKey)
		throws NoSuchAttractionCarRentConditionException {

		Session session = null;

		try {
			session = openSession();

			AttractionCarRentCondition attractionCarRentCondition =
				(AttractionCarRentCondition)session.get(
					AttractionCarRentConditionImpl.class, primaryKey);

			if (attractionCarRentCondition == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttractionCarRentConditionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(attractionCarRentCondition);
		}
		catch (NoSuchAttractionCarRentConditionException
					noSuchEntityException) {

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
	protected AttractionCarRentCondition removeImpl(
		AttractionCarRentCondition attractionCarRentCondition) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attractionCarRentCondition)) {
				attractionCarRentCondition =
					(AttractionCarRentCondition)session.get(
						AttractionCarRentConditionImpl.class,
						attractionCarRentCondition.getPrimaryKeyObj());
			}

			if (attractionCarRentCondition != null) {
				session.delete(attractionCarRentCondition);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (attractionCarRentCondition != null) {
			clearCache(attractionCarRentCondition);
		}

		return attractionCarRentCondition;
	}

	@Override
	public AttractionCarRentCondition updateImpl(
		AttractionCarRentCondition attractionCarRentCondition) {

		boolean isNew = attractionCarRentCondition.isNew();

		if (!(attractionCarRentCondition instanceof
				AttractionCarRentConditionModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(attractionCarRentCondition.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					attractionCarRentCondition);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in attractionCarRentCondition proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AttractionCarRentCondition implementation " +
					attractionCarRentCondition.getClass());
		}

		AttractionCarRentConditionModelImpl
			attractionCarRentConditionModelImpl =
				(AttractionCarRentConditionModelImpl)attractionCarRentCondition;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (attractionCarRentCondition.getCreateDate() == null)) {
			if (serviceContext == null) {
				attractionCarRentCondition.setCreateDate(date);
			}
			else {
				attractionCarRentCondition.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!attractionCarRentConditionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				attractionCarRentCondition.setModifiedDate(date);
			}
			else {
				attractionCarRentCondition.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(attractionCarRentCondition);
			}
			else {
				attractionCarRentCondition =
					(AttractionCarRentCondition)session.merge(
						attractionCarRentCondition);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AttractionCarRentConditionImpl.class,
			attractionCarRentConditionModelImpl, false, true);

		cacheUniqueFindersCache(attractionCarRentConditionModelImpl);

		if (isNew) {
			attractionCarRentCondition.setNew(false);
		}

		attractionCarRentCondition.resetOriginalValues();

		return attractionCarRentCondition;
	}

	/**
	 * Returns the attraction car rent condition with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attraction car rent condition
	 * @return the attraction car rent condition
	 * @throws NoSuchAttractionCarRentConditionException if a attraction car rent condition with the primary key could not be found
	 */
	@Override
	public AttractionCarRentCondition findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttractionCarRentConditionException {

		AttractionCarRentCondition attractionCarRentCondition =
			fetchByPrimaryKey(primaryKey);

		if (attractionCarRentCondition == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttractionCarRentConditionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return attractionCarRentCondition;
	}

	/**
	 * Returns the attraction car rent condition with the primary key or throws a <code>NoSuchAttractionCarRentConditionException</code> if it could not be found.
	 *
	 * @param attractionCarRenConditId the primary key of the attraction car rent condition
	 * @return the attraction car rent condition
	 * @throws NoSuchAttractionCarRentConditionException if a attraction car rent condition with the primary key could not be found
	 */
	@Override
	public AttractionCarRentCondition findByPrimaryKey(
			long attractionCarRenConditId)
		throws NoSuchAttractionCarRentConditionException {

		return findByPrimaryKey((Serializable)attractionCarRenConditId);
	}

	/**
	 * Returns the attraction car rent condition with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionCarRenConditId the primary key of the attraction car rent condition
	 * @return the attraction car rent condition, or <code>null</code> if a attraction car rent condition with the primary key could not be found
	 */
	@Override
	public AttractionCarRentCondition fetchByPrimaryKey(
		long attractionCarRenConditId) {

		return fetchByPrimaryKey((Serializable)attractionCarRenConditId);
	}

	/**
	 * Returns all the attraction car rent conditions.
	 *
	 * @return the attraction car rent conditions
	 */
	@Override
	public List<AttractionCarRentCondition> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attraction car rent conditions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentConditionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rent conditions
	 * @param end the upper bound of the range of attraction car rent conditions (not inclusive)
	 * @return the range of attraction car rent conditions
	 */
	@Override
	public List<AttractionCarRentCondition> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attraction car rent conditions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentConditionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rent conditions
	 * @param end the upper bound of the range of attraction car rent conditions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction car rent conditions
	 */
	@Override
	public List<AttractionCarRentCondition> findAll(
		int start, int end,
		OrderByComparator<AttractionCarRentCondition> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the attraction car rent conditions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentConditionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rent conditions
	 * @param end the upper bound of the range of attraction car rent conditions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction car rent conditions
	 */
	@Override
	public List<AttractionCarRentCondition> findAll(
		int start, int end,
		OrderByComparator<AttractionCarRentCondition> orderByComparator,
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

		List<AttractionCarRentCondition> list = null;

		if (useFinderCache) {
			list = (List<AttractionCarRentCondition>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ATTRACTIONCARRENTCONDITION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ATTRACTIONCARRENTCONDITION;

				sql = sql.concat(
					AttractionCarRentConditionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AttractionCarRentCondition>)QueryUtil.list(
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
	 * Removes all the attraction car rent conditions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AttractionCarRentCondition attractionCarRentCondition :
				findAll()) {

			remove(attractionCarRentCondition);
		}
	}

	/**
	 * Returns the number of attraction car rent conditions.
	 *
	 * @return the number of attraction car rent conditions
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
					_SQL_COUNT_ATTRACTIONCARRENTCONDITION);

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
		return "attractionCarRenConditId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ATTRACTIONCARRENTCONDITION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AttractionCarRentConditionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the attraction car rent condition persistence.
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

		_finderPathFetchBygetJTB_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJTB_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, true);

		_finderPathCountBygetJTB_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJTB_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, false);

		AttractionCarRentConditionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AttractionCarRentConditionUtil.setPersistence(null);

		entityCache.removeCache(AttractionCarRentConditionImpl.class.getName());
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ATTRACTIONCARRENTCONDITION =
		"SELECT attractionCarRentCondition FROM AttractionCarRentCondition attractionCarRentCondition";

	private static final String _SQL_SELECT_ATTRACTIONCARRENTCONDITION_WHERE =
		"SELECT attractionCarRentCondition FROM AttractionCarRentCondition attractionCarRentCondition WHERE ";

	private static final String _SQL_COUNT_ATTRACTIONCARRENTCONDITION =
		"SELECT COUNT(attractionCarRentCondition) FROM AttractionCarRentCondition attractionCarRentCondition";

	private static final String _SQL_COUNT_ATTRACTIONCARRENTCONDITION_WHERE =
		"SELECT COUNT(attractionCarRentCondition) FROM AttractionCarRentCondition attractionCarRentCondition WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"attractionCarRentCondition.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AttractionCarRentCondition exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AttractionCarRentCondition exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AttractionCarRentConditionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}