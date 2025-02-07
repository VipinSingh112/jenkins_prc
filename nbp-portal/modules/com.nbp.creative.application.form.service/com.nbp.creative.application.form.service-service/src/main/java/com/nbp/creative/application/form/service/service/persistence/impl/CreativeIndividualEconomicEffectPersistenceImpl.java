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

import com.nbp.creative.application.form.service.exception.NoSuchCreativeIndividualEconomicEffectException;
import com.nbp.creative.application.form.service.model.CreativeIndividualEconomicEffect;
import com.nbp.creative.application.form.service.model.CreativeIndividualEconomicEffectTable;
import com.nbp.creative.application.form.service.model.impl.CreativeIndividualEconomicEffectImpl;
import com.nbp.creative.application.form.service.model.impl.CreativeIndividualEconomicEffectModelImpl;
import com.nbp.creative.application.form.service.service.persistence.CreativeIndividualEconomicEffectPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeIndividualEconomicEffectUtil;
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
 * The persistence implementation for the creative individual economic effect service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CreativeIndividualEconomicEffectPersistence.class)
public class CreativeIndividualEconomicEffectPersistenceImpl
	extends BasePersistenceImpl<CreativeIndividualEconomicEffect>
	implements CreativeIndividualEconomicEffectPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CreativeIndividualEconomicEffectUtil</code> to access the creative individual economic effect persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CreativeIndividualEconomicEffectImpl.class.getName();

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
	 * Returns the creative individual economic effect where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeIndividualEconomicEffectException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative individual economic effect
	 * @throws NoSuchCreativeIndividualEconomicEffectException if a matching creative individual economic effect could not be found
	 */
	@Override
	public CreativeIndividualEconomicEffect findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeIndividualEconomicEffectException {

		CreativeIndividualEconomicEffect creativeIndividualEconomicEffect =
			fetchBygetCreativeById(CreativeApplicationId);

		if (creativeIndividualEconomicEffect == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("CreativeApplicationId=");
			sb.append(CreativeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCreativeIndividualEconomicEffectException(
				sb.toString());
		}

		return creativeIndividualEconomicEffect;
	}

	/**
	 * Returns the creative individual economic effect where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative individual economic effect, or <code>null</code> if a matching creative individual economic effect could not be found
	 */
	@Override
	public CreativeIndividualEconomicEffect fetchBygetCreativeById(
		long CreativeApplicationId) {

		return fetchBygetCreativeById(CreativeApplicationId, true);
	}

	/**
	 * Returns the creative individual economic effect where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative individual economic effect, or <code>null</code> if a matching creative individual economic effect could not be found
	 */
	@Override
	public CreativeIndividualEconomicEffect fetchBygetCreativeById(
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

		if (result instanceof CreativeIndividualEconomicEffect) {
			CreativeIndividualEconomicEffect creativeIndividualEconomicEffect =
				(CreativeIndividualEconomicEffect)result;

			if (CreativeApplicationId !=
					creativeIndividualEconomicEffect.
						getCreativeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CREATIVEINDIVIDUALECONOMICEFFECT_WHERE);

			sb.append(_FINDER_COLUMN_GETCREATIVEBYID_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

				List<CreativeIndividualEconomicEffect> list = query.list();

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
								"CreativeIndividualEconomicEffectPersistenceImpl.fetchBygetCreativeById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeIndividualEconomicEffect
						creativeIndividualEconomicEffect = list.get(0);

					result = creativeIndividualEconomicEffect;

					cacheResult(creativeIndividualEconomicEffect);
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
			return (CreativeIndividualEconomicEffect)result;
		}
	}

	/**
	 * Removes the creative individual economic effect where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative individual economic effect that was removed
	 */
	@Override
	public CreativeIndividualEconomicEffect removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeIndividualEconomicEffectException {

		CreativeIndividualEconomicEffect creativeIndividualEconomicEffect =
			findBygetCreativeById(CreativeApplicationId);

		return remove(creativeIndividualEconomicEffect);
	}

	/**
	 * Returns the number of creative individual economic effects where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative individual economic effects
	 */
	@Override
	public int countBygetCreativeById(long CreativeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCreativeById;

		Object[] finderArgs = new Object[] {CreativeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEINDIVIDUALECONOMICEFFECT_WHERE);

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
			"creativeIndividualEconomicEffect.CreativeApplicationId = ?";

	public CreativeIndividualEconomicEffectPersistenceImpl() {
		setModelClass(CreativeIndividualEconomicEffect.class);

		setModelImplClass(CreativeIndividualEconomicEffectImpl.class);
		setModelPKClass(long.class);

		setTable(CreativeIndividualEconomicEffectTable.INSTANCE);
	}

	/**
	 * Caches the creative individual economic effect in the entity cache if it is enabled.
	 *
	 * @param creativeIndividualEconomicEffect the creative individual economic effect
	 */
	@Override
	public void cacheResult(
		CreativeIndividualEconomicEffect creativeIndividualEconomicEffect) {

		entityCache.putResult(
			CreativeIndividualEconomicEffectImpl.class,
			creativeIndividualEconomicEffect.getPrimaryKey(),
			creativeIndividualEconomicEffect);

		finderCache.putResult(
			_finderPathFetchBygetCreativeById,
			new Object[] {
				creativeIndividualEconomicEffect.getCreativeApplicationId()
			},
			creativeIndividualEconomicEffect);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the creative individual economic effects in the entity cache if it is enabled.
	 *
	 * @param creativeIndividualEconomicEffects the creative individual economic effects
	 */
	@Override
	public void cacheResult(
		List<CreativeIndividualEconomicEffect>
			creativeIndividualEconomicEffects) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (creativeIndividualEconomicEffects.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CreativeIndividualEconomicEffect creativeIndividualEconomicEffect :
				creativeIndividualEconomicEffects) {

			if (entityCache.getResult(
					CreativeIndividualEconomicEffectImpl.class,
					creativeIndividualEconomicEffect.getPrimaryKey()) == null) {

				cacheResult(creativeIndividualEconomicEffect);
			}
		}
	}

	/**
	 * Clears the cache for all creative individual economic effects.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CreativeIndividualEconomicEffectImpl.class);

		finderCache.clearCache(CreativeIndividualEconomicEffectImpl.class);
	}

	/**
	 * Clears the cache for the creative individual economic effect.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CreativeIndividualEconomicEffect creativeIndividualEconomicEffect) {

		entityCache.removeResult(
			CreativeIndividualEconomicEffectImpl.class,
			creativeIndividualEconomicEffect);
	}

	@Override
	public void clearCache(
		List<CreativeIndividualEconomicEffect>
			creativeIndividualEconomicEffects) {

		for (CreativeIndividualEconomicEffect creativeIndividualEconomicEffect :
				creativeIndividualEconomicEffects) {

			entityCache.removeResult(
				CreativeIndividualEconomicEffectImpl.class,
				creativeIndividualEconomicEffect);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CreativeIndividualEconomicEffectImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CreativeIndividualEconomicEffectImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CreativeIndividualEconomicEffectModelImpl
			creativeIndividualEconomicEffectModelImpl) {

		Object[] args = new Object[] {
			creativeIndividualEconomicEffectModelImpl.getCreativeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCreativeById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCreativeById, args,
			creativeIndividualEconomicEffectModelImpl);
	}

	/**
	 * Creates a new creative individual economic effect with the primary key. Does not add the creative individual economic effect to the database.
	 *
	 * @param creativeIndiEcoEffectId the primary key for the new creative individual economic effect
	 * @return the new creative individual economic effect
	 */
	@Override
	public CreativeIndividualEconomicEffect create(
		long creativeIndiEcoEffectId) {

		CreativeIndividualEconomicEffect creativeIndividualEconomicEffect =
			new CreativeIndividualEconomicEffectImpl();

		creativeIndividualEconomicEffect.setNew(true);
		creativeIndividualEconomicEffect.setPrimaryKey(creativeIndiEcoEffectId);

		creativeIndividualEconomicEffect.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return creativeIndividualEconomicEffect;
	}

	/**
	 * Removes the creative individual economic effect with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeIndiEcoEffectId the primary key of the creative individual economic effect
	 * @return the creative individual economic effect that was removed
	 * @throws NoSuchCreativeIndividualEconomicEffectException if a creative individual economic effect with the primary key could not be found
	 */
	@Override
	public CreativeIndividualEconomicEffect remove(long creativeIndiEcoEffectId)
		throws NoSuchCreativeIndividualEconomicEffectException {

		return remove((Serializable)creativeIndiEcoEffectId);
	}

	/**
	 * Removes the creative individual economic effect with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the creative individual economic effect
	 * @return the creative individual economic effect that was removed
	 * @throws NoSuchCreativeIndividualEconomicEffectException if a creative individual economic effect with the primary key could not be found
	 */
	@Override
	public CreativeIndividualEconomicEffect remove(Serializable primaryKey)
		throws NoSuchCreativeIndividualEconomicEffectException {

		Session session = null;

		try {
			session = openSession();

			CreativeIndividualEconomicEffect creativeIndividualEconomicEffect =
				(CreativeIndividualEconomicEffect)session.get(
					CreativeIndividualEconomicEffectImpl.class, primaryKey);

			if (creativeIndividualEconomicEffect == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreativeIndividualEconomicEffectException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(creativeIndividualEconomicEffect);
		}
		catch (NoSuchCreativeIndividualEconomicEffectException
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
	protected CreativeIndividualEconomicEffect removeImpl(
		CreativeIndividualEconomicEffect creativeIndividualEconomicEffect) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(creativeIndividualEconomicEffect)) {
				creativeIndividualEconomicEffect =
					(CreativeIndividualEconomicEffect)session.get(
						CreativeIndividualEconomicEffectImpl.class,
						creativeIndividualEconomicEffect.getPrimaryKeyObj());
			}

			if (creativeIndividualEconomicEffect != null) {
				session.delete(creativeIndividualEconomicEffect);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (creativeIndividualEconomicEffect != null) {
			clearCache(creativeIndividualEconomicEffect);
		}

		return creativeIndividualEconomicEffect;
	}

	@Override
	public CreativeIndividualEconomicEffect updateImpl(
		CreativeIndividualEconomicEffect creativeIndividualEconomicEffect) {

		boolean isNew = creativeIndividualEconomicEffect.isNew();

		if (!(creativeIndividualEconomicEffect instanceof
				CreativeIndividualEconomicEffectModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					creativeIndividualEconomicEffect.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					creativeIndividualEconomicEffect);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in creativeIndividualEconomicEffect proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CreativeIndividualEconomicEffect implementation " +
					creativeIndividualEconomicEffect.getClass());
		}

		CreativeIndividualEconomicEffectModelImpl
			creativeIndividualEconomicEffectModelImpl =
				(CreativeIndividualEconomicEffectModelImpl)
					creativeIndividualEconomicEffect;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(creativeIndividualEconomicEffect.getCreateDate() == null)) {

			if (serviceContext == null) {
				creativeIndividualEconomicEffect.setCreateDate(date);
			}
			else {
				creativeIndividualEconomicEffect.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!creativeIndividualEconomicEffectModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				creativeIndividualEconomicEffect.setModifiedDate(date);
			}
			else {
				creativeIndividualEconomicEffect.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(creativeIndividualEconomicEffect);
			}
			else {
				creativeIndividualEconomicEffect =
					(CreativeIndividualEconomicEffect)session.merge(
						creativeIndividualEconomicEffect);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CreativeIndividualEconomicEffectImpl.class,
			creativeIndividualEconomicEffectModelImpl, false, true);

		cacheUniqueFindersCache(creativeIndividualEconomicEffectModelImpl);

		if (isNew) {
			creativeIndividualEconomicEffect.setNew(false);
		}

		creativeIndividualEconomicEffect.resetOriginalValues();

		return creativeIndividualEconomicEffect;
	}

	/**
	 * Returns the creative individual economic effect with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the creative individual economic effect
	 * @return the creative individual economic effect
	 * @throws NoSuchCreativeIndividualEconomicEffectException if a creative individual economic effect with the primary key could not be found
	 */
	@Override
	public CreativeIndividualEconomicEffect findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCreativeIndividualEconomicEffectException {

		CreativeIndividualEconomicEffect creativeIndividualEconomicEffect =
			fetchByPrimaryKey(primaryKey);

		if (creativeIndividualEconomicEffect == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreativeIndividualEconomicEffectException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return creativeIndividualEconomicEffect;
	}

	/**
	 * Returns the creative individual economic effect with the primary key or throws a <code>NoSuchCreativeIndividualEconomicEffectException</code> if it could not be found.
	 *
	 * @param creativeIndiEcoEffectId the primary key of the creative individual economic effect
	 * @return the creative individual economic effect
	 * @throws NoSuchCreativeIndividualEconomicEffectException if a creative individual economic effect with the primary key could not be found
	 */
	@Override
	public CreativeIndividualEconomicEffect findByPrimaryKey(
			long creativeIndiEcoEffectId)
		throws NoSuchCreativeIndividualEconomicEffectException {

		return findByPrimaryKey((Serializable)creativeIndiEcoEffectId);
	}

	/**
	 * Returns the creative individual economic effect with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeIndiEcoEffectId the primary key of the creative individual economic effect
	 * @return the creative individual economic effect, or <code>null</code> if a creative individual economic effect with the primary key could not be found
	 */
	@Override
	public CreativeIndividualEconomicEffect fetchByPrimaryKey(
		long creativeIndiEcoEffectId) {

		return fetchByPrimaryKey((Serializable)creativeIndiEcoEffectId);
	}

	/**
	 * Returns all the creative individual economic effects.
	 *
	 * @return the creative individual economic effects
	 */
	@Override
	public List<CreativeIndividualEconomicEffect> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative individual economic effects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualEconomicEffectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual economic effects
	 * @param end the upper bound of the range of creative individual economic effects (not inclusive)
	 * @return the range of creative individual economic effects
	 */
	@Override
	public List<CreativeIndividualEconomicEffect> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative individual economic effects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualEconomicEffectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual economic effects
	 * @param end the upper bound of the range of creative individual economic effects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative individual economic effects
	 */
	@Override
	public List<CreativeIndividualEconomicEffect> findAll(
		int start, int end,
		OrderByComparator<CreativeIndividualEconomicEffect> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative individual economic effects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualEconomicEffectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual economic effects
	 * @param end the upper bound of the range of creative individual economic effects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative individual economic effects
	 */
	@Override
	public List<CreativeIndividualEconomicEffect> findAll(
		int start, int end,
		OrderByComparator<CreativeIndividualEconomicEffect> orderByComparator,
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

		List<CreativeIndividualEconomicEffect> list = null;

		if (useFinderCache) {
			list =
				(List<CreativeIndividualEconomicEffect>)finderCache.getResult(
					finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CREATIVEINDIVIDUALECONOMICEFFECT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREATIVEINDIVIDUALECONOMICEFFECT;

				sql = sql.concat(
					CreativeIndividualEconomicEffectModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CreativeIndividualEconomicEffect>)QueryUtil.list(
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
	 * Removes all the creative individual economic effects from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CreativeIndividualEconomicEffect creativeIndividualEconomicEffect :
				findAll()) {

			remove(creativeIndividualEconomicEffect);
		}
	}

	/**
	 * Returns the number of creative individual economic effects.
	 *
	 * @return the number of creative individual economic effects
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
					_SQL_COUNT_CREATIVEINDIVIDUALECONOMICEFFECT);

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
		return "creativeIndiEcoEffectId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREATIVEINDIVIDUALECONOMICEFFECT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CreativeIndividualEconomicEffectModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the creative individual economic effect persistence.
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

		CreativeIndividualEconomicEffectUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CreativeIndividualEconomicEffectUtil.setPersistence(null);

		entityCache.removeCache(
			CreativeIndividualEconomicEffectImpl.class.getName());
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

	private static final String _SQL_SELECT_CREATIVEINDIVIDUALECONOMICEFFECT =
		"SELECT creativeIndividualEconomicEffect FROM CreativeIndividualEconomicEffect creativeIndividualEconomicEffect";

	private static final String
		_SQL_SELECT_CREATIVEINDIVIDUALECONOMICEFFECT_WHERE =
			"SELECT creativeIndividualEconomicEffect FROM CreativeIndividualEconomicEffect creativeIndividualEconomicEffect WHERE ";

	private static final String _SQL_COUNT_CREATIVEINDIVIDUALECONOMICEFFECT =
		"SELECT COUNT(creativeIndividualEconomicEffect) FROM CreativeIndividualEconomicEffect creativeIndividualEconomicEffect";

	private static final String
		_SQL_COUNT_CREATIVEINDIVIDUALECONOMICEFFECT_WHERE =
			"SELECT COUNT(creativeIndividualEconomicEffect) FROM CreativeIndividualEconomicEffect creativeIndividualEconomicEffect WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"creativeIndividualEconomicEffect.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CreativeIndividualEconomicEffect exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CreativeIndividualEconomicEffect exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CreativeIndividualEconomicEffectPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}