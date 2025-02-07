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

import com.nbp.creative.application.form.service.exception.NoSuchCreativeCompanyEconomicEffectException;
import com.nbp.creative.application.form.service.model.CreativeCompanyEconomicEffect;
import com.nbp.creative.application.form.service.model.CreativeCompanyEconomicEffectTable;
import com.nbp.creative.application.form.service.model.impl.CreativeCompanyEconomicEffectImpl;
import com.nbp.creative.application.form.service.model.impl.CreativeCompanyEconomicEffectModelImpl;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyEconomicEffectPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyEconomicEffectUtil;
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
 * The persistence implementation for the creative company economic effect service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CreativeCompanyEconomicEffectPersistence.class)
public class CreativeCompanyEconomicEffectPersistenceImpl
	extends BasePersistenceImpl<CreativeCompanyEconomicEffect>
	implements CreativeCompanyEconomicEffectPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CreativeCompanyEconomicEffectUtil</code> to access the creative company economic effect persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CreativeCompanyEconomicEffectImpl.class.getName();

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
	 * Returns the creative company economic effect where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeCompanyEconomicEffectException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company economic effect
	 * @throws NoSuchCreativeCompanyEconomicEffectException if a matching creative company economic effect could not be found
	 */
	@Override
	public CreativeCompanyEconomicEffect findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyEconomicEffectException {

		CreativeCompanyEconomicEffect creativeCompanyEconomicEffect =
			fetchBygetCreativeById(CreativeApplicationId);

		if (creativeCompanyEconomicEffect == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("CreativeApplicationId=");
			sb.append(CreativeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCreativeCompanyEconomicEffectException(
				sb.toString());
		}

		return creativeCompanyEconomicEffect;
	}

	/**
	 * Returns the creative company economic effect where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company economic effect, or <code>null</code> if a matching creative company economic effect could not be found
	 */
	@Override
	public CreativeCompanyEconomicEffect fetchBygetCreativeById(
		long CreativeApplicationId) {

		return fetchBygetCreativeById(CreativeApplicationId, true);
	}

	/**
	 * Returns the creative company economic effect where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative company economic effect, or <code>null</code> if a matching creative company economic effect could not be found
	 */
	@Override
	public CreativeCompanyEconomicEffect fetchBygetCreativeById(
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

		if (result instanceof CreativeCompanyEconomicEffect) {
			CreativeCompanyEconomicEffect creativeCompanyEconomicEffect =
				(CreativeCompanyEconomicEffect)result;

			if (CreativeApplicationId !=
					creativeCompanyEconomicEffect.getCreativeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CREATIVECOMPANYECONOMICEFFECT_WHERE);

			sb.append(_FINDER_COLUMN_GETCREATIVEBYID_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

				List<CreativeCompanyEconomicEffect> list = query.list();

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
								"CreativeCompanyEconomicEffectPersistenceImpl.fetchBygetCreativeById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeCompanyEconomicEffect
						creativeCompanyEconomicEffect = list.get(0);

					result = creativeCompanyEconomicEffect;

					cacheResult(creativeCompanyEconomicEffect);
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
			return (CreativeCompanyEconomicEffect)result;
		}
	}

	/**
	 * Removes the creative company economic effect where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative company economic effect that was removed
	 */
	@Override
	public CreativeCompanyEconomicEffect removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyEconomicEffectException {

		CreativeCompanyEconomicEffect creativeCompanyEconomicEffect =
			findBygetCreativeById(CreativeApplicationId);

		return remove(creativeCompanyEconomicEffect);
	}

	/**
	 * Returns the number of creative company economic effects where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative company economic effects
	 */
	@Override
	public int countBygetCreativeById(long CreativeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCreativeById;

		Object[] finderArgs = new Object[] {CreativeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVECOMPANYECONOMICEFFECT_WHERE);

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
			"creativeCompanyEconomicEffect.CreativeApplicationId = ?";

	public CreativeCompanyEconomicEffectPersistenceImpl() {
		setModelClass(CreativeCompanyEconomicEffect.class);

		setModelImplClass(CreativeCompanyEconomicEffectImpl.class);
		setModelPKClass(long.class);

		setTable(CreativeCompanyEconomicEffectTable.INSTANCE);
	}

	/**
	 * Caches the creative company economic effect in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyEconomicEffect the creative company economic effect
	 */
	@Override
	public void cacheResult(
		CreativeCompanyEconomicEffect creativeCompanyEconomicEffect) {

		entityCache.putResult(
			CreativeCompanyEconomicEffectImpl.class,
			creativeCompanyEconomicEffect.getPrimaryKey(),
			creativeCompanyEconomicEffect);

		finderCache.putResult(
			_finderPathFetchBygetCreativeById,
			new Object[] {
				creativeCompanyEconomicEffect.getCreativeApplicationId()
			},
			creativeCompanyEconomicEffect);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the creative company economic effects in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyEconomicEffects the creative company economic effects
	 */
	@Override
	public void cacheResult(
		List<CreativeCompanyEconomicEffect> creativeCompanyEconomicEffects) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (creativeCompanyEconomicEffects.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CreativeCompanyEconomicEffect creativeCompanyEconomicEffect :
				creativeCompanyEconomicEffects) {

			if (entityCache.getResult(
					CreativeCompanyEconomicEffectImpl.class,
					creativeCompanyEconomicEffect.getPrimaryKey()) == null) {

				cacheResult(creativeCompanyEconomicEffect);
			}
		}
	}

	/**
	 * Clears the cache for all creative company economic effects.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CreativeCompanyEconomicEffectImpl.class);

		finderCache.clearCache(CreativeCompanyEconomicEffectImpl.class);
	}

	/**
	 * Clears the cache for the creative company economic effect.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CreativeCompanyEconomicEffect creativeCompanyEconomicEffect) {

		entityCache.removeResult(
			CreativeCompanyEconomicEffectImpl.class,
			creativeCompanyEconomicEffect);
	}

	@Override
	public void clearCache(
		List<CreativeCompanyEconomicEffect> creativeCompanyEconomicEffects) {

		for (CreativeCompanyEconomicEffect creativeCompanyEconomicEffect :
				creativeCompanyEconomicEffects) {

			entityCache.removeResult(
				CreativeCompanyEconomicEffectImpl.class,
				creativeCompanyEconomicEffect);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CreativeCompanyEconomicEffectImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CreativeCompanyEconomicEffectImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CreativeCompanyEconomicEffectModelImpl
			creativeCompanyEconomicEffectModelImpl) {

		Object[] args = new Object[] {
			creativeCompanyEconomicEffectModelImpl.getCreativeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCreativeById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCreativeById, args,
			creativeCompanyEconomicEffectModelImpl);
	}

	/**
	 * Creates a new creative company economic effect with the primary key. Does not add the creative company economic effect to the database.
	 *
	 * @param creativeComEconomicEffectId the primary key for the new creative company economic effect
	 * @return the new creative company economic effect
	 */
	@Override
	public CreativeCompanyEconomicEffect create(
		long creativeComEconomicEffectId) {

		CreativeCompanyEconomicEffect creativeCompanyEconomicEffect =
			new CreativeCompanyEconomicEffectImpl();

		creativeCompanyEconomicEffect.setNew(true);
		creativeCompanyEconomicEffect.setPrimaryKey(
			creativeComEconomicEffectId);

		creativeCompanyEconomicEffect.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return creativeCompanyEconomicEffect;
	}

	/**
	 * Removes the creative company economic effect with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeComEconomicEffectId the primary key of the creative company economic effect
	 * @return the creative company economic effect that was removed
	 * @throws NoSuchCreativeCompanyEconomicEffectException if a creative company economic effect with the primary key could not be found
	 */
	@Override
	public CreativeCompanyEconomicEffect remove(
			long creativeComEconomicEffectId)
		throws NoSuchCreativeCompanyEconomicEffectException {

		return remove((Serializable)creativeComEconomicEffectId);
	}

	/**
	 * Removes the creative company economic effect with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the creative company economic effect
	 * @return the creative company economic effect that was removed
	 * @throws NoSuchCreativeCompanyEconomicEffectException if a creative company economic effect with the primary key could not be found
	 */
	@Override
	public CreativeCompanyEconomicEffect remove(Serializable primaryKey)
		throws NoSuchCreativeCompanyEconomicEffectException {

		Session session = null;

		try {
			session = openSession();

			CreativeCompanyEconomicEffect creativeCompanyEconomicEffect =
				(CreativeCompanyEconomicEffect)session.get(
					CreativeCompanyEconomicEffectImpl.class, primaryKey);

			if (creativeCompanyEconomicEffect == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreativeCompanyEconomicEffectException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(creativeCompanyEconomicEffect);
		}
		catch (NoSuchCreativeCompanyEconomicEffectException
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
	protected CreativeCompanyEconomicEffect removeImpl(
		CreativeCompanyEconomicEffect creativeCompanyEconomicEffect) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(creativeCompanyEconomicEffect)) {
				creativeCompanyEconomicEffect =
					(CreativeCompanyEconomicEffect)session.get(
						CreativeCompanyEconomicEffectImpl.class,
						creativeCompanyEconomicEffect.getPrimaryKeyObj());
			}

			if (creativeCompanyEconomicEffect != null) {
				session.delete(creativeCompanyEconomicEffect);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (creativeCompanyEconomicEffect != null) {
			clearCache(creativeCompanyEconomicEffect);
		}

		return creativeCompanyEconomicEffect;
	}

	@Override
	public CreativeCompanyEconomicEffect updateImpl(
		CreativeCompanyEconomicEffect creativeCompanyEconomicEffect) {

		boolean isNew = creativeCompanyEconomicEffect.isNew();

		if (!(creativeCompanyEconomicEffect instanceof
				CreativeCompanyEconomicEffectModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					creativeCompanyEconomicEffect.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					creativeCompanyEconomicEffect);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in creativeCompanyEconomicEffect proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CreativeCompanyEconomicEffect implementation " +
					creativeCompanyEconomicEffect.getClass());
		}

		CreativeCompanyEconomicEffectModelImpl
			creativeCompanyEconomicEffectModelImpl =
				(CreativeCompanyEconomicEffectModelImpl)
					creativeCompanyEconomicEffect;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (creativeCompanyEconomicEffect.getCreateDate() == null)) {
			if (serviceContext == null) {
				creativeCompanyEconomicEffect.setCreateDate(date);
			}
			else {
				creativeCompanyEconomicEffect.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!creativeCompanyEconomicEffectModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				creativeCompanyEconomicEffect.setModifiedDate(date);
			}
			else {
				creativeCompanyEconomicEffect.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(creativeCompanyEconomicEffect);
			}
			else {
				creativeCompanyEconomicEffect =
					(CreativeCompanyEconomicEffect)session.merge(
						creativeCompanyEconomicEffect);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CreativeCompanyEconomicEffectImpl.class,
			creativeCompanyEconomicEffectModelImpl, false, true);

		cacheUniqueFindersCache(creativeCompanyEconomicEffectModelImpl);

		if (isNew) {
			creativeCompanyEconomicEffect.setNew(false);
		}

		creativeCompanyEconomicEffect.resetOriginalValues();

		return creativeCompanyEconomicEffect;
	}

	/**
	 * Returns the creative company economic effect with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the creative company economic effect
	 * @return the creative company economic effect
	 * @throws NoSuchCreativeCompanyEconomicEffectException if a creative company economic effect with the primary key could not be found
	 */
	@Override
	public CreativeCompanyEconomicEffect findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCreativeCompanyEconomicEffectException {

		CreativeCompanyEconomicEffect creativeCompanyEconomicEffect =
			fetchByPrimaryKey(primaryKey);

		if (creativeCompanyEconomicEffect == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreativeCompanyEconomicEffectException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return creativeCompanyEconomicEffect;
	}

	/**
	 * Returns the creative company economic effect with the primary key or throws a <code>NoSuchCreativeCompanyEconomicEffectException</code> if it could not be found.
	 *
	 * @param creativeComEconomicEffectId the primary key of the creative company economic effect
	 * @return the creative company economic effect
	 * @throws NoSuchCreativeCompanyEconomicEffectException if a creative company economic effect with the primary key could not be found
	 */
	@Override
	public CreativeCompanyEconomicEffect findByPrimaryKey(
			long creativeComEconomicEffectId)
		throws NoSuchCreativeCompanyEconomicEffectException {

		return findByPrimaryKey((Serializable)creativeComEconomicEffectId);
	}

	/**
	 * Returns the creative company economic effect with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeComEconomicEffectId the primary key of the creative company economic effect
	 * @return the creative company economic effect, or <code>null</code> if a creative company economic effect with the primary key could not be found
	 */
	@Override
	public CreativeCompanyEconomicEffect fetchByPrimaryKey(
		long creativeComEconomicEffectId) {

		return fetchByPrimaryKey((Serializable)creativeComEconomicEffectId);
	}

	/**
	 * Returns all the creative company economic effects.
	 *
	 * @return the creative company economic effects
	 */
	@Override
	public List<CreativeCompanyEconomicEffect> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative company economic effects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyEconomicEffectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company economic effects
	 * @param end the upper bound of the range of creative company economic effects (not inclusive)
	 * @return the range of creative company economic effects
	 */
	@Override
	public List<CreativeCompanyEconomicEffect> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative company economic effects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyEconomicEffectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company economic effects
	 * @param end the upper bound of the range of creative company economic effects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative company economic effects
	 */
	@Override
	public List<CreativeCompanyEconomicEffect> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyEconomicEffect> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative company economic effects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyEconomicEffectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company economic effects
	 * @param end the upper bound of the range of creative company economic effects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative company economic effects
	 */
	@Override
	public List<CreativeCompanyEconomicEffect> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyEconomicEffect> orderByComparator,
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

		List<CreativeCompanyEconomicEffect> list = null;

		if (useFinderCache) {
			list = (List<CreativeCompanyEconomicEffect>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CREATIVECOMPANYECONOMICEFFECT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREATIVECOMPANYECONOMICEFFECT;

				sql = sql.concat(
					CreativeCompanyEconomicEffectModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CreativeCompanyEconomicEffect>)QueryUtil.list(
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
	 * Removes all the creative company economic effects from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CreativeCompanyEconomicEffect creativeCompanyEconomicEffect :
				findAll()) {

			remove(creativeCompanyEconomicEffect);
		}
	}

	/**
	 * Returns the number of creative company economic effects.
	 *
	 * @return the number of creative company economic effects
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
					_SQL_COUNT_CREATIVECOMPANYECONOMICEFFECT);

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
		return "creativeComEconomicEffectId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREATIVECOMPANYECONOMICEFFECT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CreativeCompanyEconomicEffectModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the creative company economic effect persistence.
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

		CreativeCompanyEconomicEffectUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CreativeCompanyEconomicEffectUtil.setPersistence(null);

		entityCache.removeCache(
			CreativeCompanyEconomicEffectImpl.class.getName());
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

	private static final String _SQL_SELECT_CREATIVECOMPANYECONOMICEFFECT =
		"SELECT creativeCompanyEconomicEffect FROM CreativeCompanyEconomicEffect creativeCompanyEconomicEffect";

	private static final String
		_SQL_SELECT_CREATIVECOMPANYECONOMICEFFECT_WHERE =
			"SELECT creativeCompanyEconomicEffect FROM CreativeCompanyEconomicEffect creativeCompanyEconomicEffect WHERE ";

	private static final String _SQL_COUNT_CREATIVECOMPANYECONOMICEFFECT =
		"SELECT COUNT(creativeCompanyEconomicEffect) FROM CreativeCompanyEconomicEffect creativeCompanyEconomicEffect";

	private static final String _SQL_COUNT_CREATIVECOMPANYECONOMICEFFECT_WHERE =
		"SELECT COUNT(creativeCompanyEconomicEffect) FROM CreativeCompanyEconomicEffect creativeCompanyEconomicEffect WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"creativeCompanyEconomicEffect.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CreativeCompanyEconomicEffect exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CreativeCompanyEconomicEffect exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CreativeCompanyEconomicEffectPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}