/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence.impl;

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

import com.nbp.quary.application.form.service.exception.NoSuchQuarryInformaationException;
import com.nbp.quary.application.form.service.model.QuarryInformaation;
import com.nbp.quary.application.form.service.model.QuarryInformaationTable;
import com.nbp.quary.application.form.service.model.impl.QuarryInformaationImpl;
import com.nbp.quary.application.form.service.model.impl.QuarryInformaationModelImpl;
import com.nbp.quary.application.form.service.service.persistence.QuarryInformaationPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryInformaationUtil;
import com.nbp.quary.application.form.service.service.persistence.impl.constants.QUARRY_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the quarry informaation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QuarryInformaationPersistence.class)
public class QuarryInformaationPersistenceImpl
	extends BasePersistenceImpl<QuarryInformaation>
	implements QuarryInformaationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QuarryInformaationUtil</code> to access the quarry informaation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QuarryInformaationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetQuarry_ById;
	private FinderPath _finderPathCountBygetQuarry_ById;

	/**
	 * Returns the quarry informaation where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryInformaationException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry informaation
	 * @throws NoSuchQuarryInformaationException if a matching quarry informaation could not be found
	 */
	@Override
	public QuarryInformaation findBygetQuarry_ById(long quarryApplicationId)
		throws NoSuchQuarryInformaationException {

		QuarryInformaation quarryInformaation = fetchBygetQuarry_ById(
			quarryApplicationId);

		if (quarryInformaation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("quarryApplicationId=");
			sb.append(quarryApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQuarryInformaationException(sb.toString());
		}

		return quarryInformaation;
	}

	/**
	 * Returns the quarry informaation where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry informaation, or <code>null</code> if a matching quarry informaation could not be found
	 */
	@Override
	public QuarryInformaation fetchBygetQuarry_ById(long quarryApplicationId) {
		return fetchBygetQuarry_ById(quarryApplicationId, true);
	}

	/**
	 * Returns the quarry informaation where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry informaation, or <code>null</code> if a matching quarry informaation could not be found
	 */
	@Override
	public QuarryInformaation fetchBygetQuarry_ById(
		long quarryApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {quarryApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetQuarry_ById, finderArgs, this);
		}

		if (result instanceof QuarryInformaation) {
			QuarryInformaation quarryInformaation = (QuarryInformaation)result;

			if (quarryApplicationId !=
					quarryInformaation.getQuarryApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_QUARRYINFORMAATION_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRY_BYID_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

				List<QuarryInformaation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetQuarry_ById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {quarryApplicationId};
							}

							_log.warn(
								"QuarryInformaationPersistenceImpl.fetchBygetQuarry_ById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryInformaation quarryInformaation = list.get(0);

					result = quarryInformaation;

					cacheResult(quarryInformaation);
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
			return (QuarryInformaation)result;
		}
	}

	/**
	 * Removes the quarry informaation where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry informaation that was removed
	 */
	@Override
	public QuarryInformaation removeBygetQuarry_ById(long quarryApplicationId)
		throws NoSuchQuarryInformaationException {

		QuarryInformaation quarryInformaation = findBygetQuarry_ById(
			quarryApplicationId);

		return remove(quarryInformaation);
	}

	/**
	 * Returns the number of quarry informaations where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry informaations
	 */
	@Override
	public int countBygetQuarry_ById(long quarryApplicationId) {
		FinderPath finderPath = _finderPathCountBygetQuarry_ById;

		Object[] finderArgs = new Object[] {quarryApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYINFORMAATION_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRY_BYID_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

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
		_FINDER_COLUMN_GETQUARRY_BYID_QUARRYAPPLICATIONID_2 =
			"quarryInformaation.quarryApplicationId = ?";

	public QuarryInformaationPersistenceImpl() {
		setModelClass(QuarryInformaation.class);

		setModelImplClass(QuarryInformaationImpl.class);
		setModelPKClass(long.class);

		setTable(QuarryInformaationTable.INSTANCE);
	}

	/**
	 * Caches the quarry informaation in the entity cache if it is enabled.
	 *
	 * @param quarryInformaation the quarry informaation
	 */
	@Override
	public void cacheResult(QuarryInformaation quarryInformaation) {
		entityCache.putResult(
			QuarryInformaationImpl.class, quarryInformaation.getPrimaryKey(),
			quarryInformaation);

		finderCache.putResult(
			_finderPathFetchBygetQuarry_ById,
			new Object[] {quarryInformaation.getQuarryApplicationId()},
			quarryInformaation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the quarry informaations in the entity cache if it is enabled.
	 *
	 * @param quarryInformaations the quarry informaations
	 */
	@Override
	public void cacheResult(List<QuarryInformaation> quarryInformaations) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (quarryInformaations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QuarryInformaation quarryInformaation : quarryInformaations) {
			if (entityCache.getResult(
					QuarryInformaationImpl.class,
					quarryInformaation.getPrimaryKey()) == null) {

				cacheResult(quarryInformaation);
			}
		}
	}

	/**
	 * Clears the cache for all quarry informaations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QuarryInformaationImpl.class);

		finderCache.clearCache(QuarryInformaationImpl.class);
	}

	/**
	 * Clears the cache for the quarry informaation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QuarryInformaation quarryInformaation) {
		entityCache.removeResult(
			QuarryInformaationImpl.class, quarryInformaation);
	}

	@Override
	public void clearCache(List<QuarryInformaation> quarryInformaations) {
		for (QuarryInformaation quarryInformaation : quarryInformaations) {
			entityCache.removeResult(
				QuarryInformaationImpl.class, quarryInformaation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QuarryInformaationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(QuarryInformaationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		QuarryInformaationModelImpl quarryInformaationModelImpl) {

		Object[] args = new Object[] {
			quarryInformaationModelImpl.getQuarryApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetQuarry_ById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQuarry_ById, args,
			quarryInformaationModelImpl);
	}

	/**
	 * Creates a new quarry informaation with the primary key. Does not add the quarry informaation to the database.
	 *
	 * @param auarryInfoId the primary key for the new quarry informaation
	 * @return the new quarry informaation
	 */
	@Override
	public QuarryInformaation create(long auarryInfoId) {
		QuarryInformaation quarryInformaation = new QuarryInformaationImpl();

		quarryInformaation.setNew(true);
		quarryInformaation.setPrimaryKey(auarryInfoId);

		quarryInformaation.setCompanyId(CompanyThreadLocal.getCompanyId());

		return quarryInformaation;
	}

	/**
	 * Removes the quarry informaation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auarryInfoId the primary key of the quarry informaation
	 * @return the quarry informaation that was removed
	 * @throws NoSuchQuarryInformaationException if a quarry informaation with the primary key could not be found
	 */
	@Override
	public QuarryInformaation remove(long auarryInfoId)
		throws NoSuchQuarryInformaationException {

		return remove((Serializable)auarryInfoId);
	}

	/**
	 * Removes the quarry informaation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the quarry informaation
	 * @return the quarry informaation that was removed
	 * @throws NoSuchQuarryInformaationException if a quarry informaation with the primary key could not be found
	 */
	@Override
	public QuarryInformaation remove(Serializable primaryKey)
		throws NoSuchQuarryInformaationException {

		Session session = null;

		try {
			session = openSession();

			QuarryInformaation quarryInformaation =
				(QuarryInformaation)session.get(
					QuarryInformaationImpl.class, primaryKey);

			if (quarryInformaation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQuarryInformaationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(quarryInformaation);
		}
		catch (NoSuchQuarryInformaationException noSuchEntityException) {
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
	protected QuarryInformaation removeImpl(
		QuarryInformaation quarryInformaation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(quarryInformaation)) {
				quarryInformaation = (QuarryInformaation)session.get(
					QuarryInformaationImpl.class,
					quarryInformaation.getPrimaryKeyObj());
			}

			if (quarryInformaation != null) {
				session.delete(quarryInformaation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (quarryInformaation != null) {
			clearCache(quarryInformaation);
		}

		return quarryInformaation;
	}

	@Override
	public QuarryInformaation updateImpl(
		QuarryInformaation quarryInformaation) {

		boolean isNew = quarryInformaation.isNew();

		if (!(quarryInformaation instanceof QuarryInformaationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(quarryInformaation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					quarryInformaation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in quarryInformaation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QuarryInformaation implementation " +
					quarryInformaation.getClass());
		}

		QuarryInformaationModelImpl quarryInformaationModelImpl =
			(QuarryInformaationModelImpl)quarryInformaation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (quarryInformaation.getCreateDate() == null)) {
			if (serviceContext == null) {
				quarryInformaation.setCreateDate(date);
			}
			else {
				quarryInformaation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!quarryInformaationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				quarryInformaation.setModifiedDate(date);
			}
			else {
				quarryInformaation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(quarryInformaation);
			}
			else {
				quarryInformaation = (QuarryInformaation)session.merge(
					quarryInformaation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QuarryInformaationImpl.class, quarryInformaationModelImpl, false,
			true);

		cacheUniqueFindersCache(quarryInformaationModelImpl);

		if (isNew) {
			quarryInformaation.setNew(false);
		}

		quarryInformaation.resetOriginalValues();

		return quarryInformaation;
	}

	/**
	 * Returns the quarry informaation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the quarry informaation
	 * @return the quarry informaation
	 * @throws NoSuchQuarryInformaationException if a quarry informaation with the primary key could not be found
	 */
	@Override
	public QuarryInformaation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQuarryInformaationException {

		QuarryInformaation quarryInformaation = fetchByPrimaryKey(primaryKey);

		if (quarryInformaation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQuarryInformaationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return quarryInformaation;
	}

	/**
	 * Returns the quarry informaation with the primary key or throws a <code>NoSuchQuarryInformaationException</code> if it could not be found.
	 *
	 * @param auarryInfoId the primary key of the quarry informaation
	 * @return the quarry informaation
	 * @throws NoSuchQuarryInformaationException if a quarry informaation with the primary key could not be found
	 */
	@Override
	public QuarryInformaation findByPrimaryKey(long auarryInfoId)
		throws NoSuchQuarryInformaationException {

		return findByPrimaryKey((Serializable)auarryInfoId);
	}

	/**
	 * Returns the quarry informaation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auarryInfoId the primary key of the quarry informaation
	 * @return the quarry informaation, or <code>null</code> if a quarry informaation with the primary key could not be found
	 */
	@Override
	public QuarryInformaation fetchByPrimaryKey(long auarryInfoId) {
		return fetchByPrimaryKey((Serializable)auarryInfoId);
	}

	/**
	 * Returns all the quarry informaations.
	 *
	 * @return the quarry informaations
	 */
	@Override
	public List<QuarryInformaation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry informaations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInformaationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry informaations
	 * @param end the upper bound of the range of quarry informaations (not inclusive)
	 * @return the range of quarry informaations
	 */
	@Override
	public List<QuarryInformaation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry informaations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInformaationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry informaations
	 * @param end the upper bound of the range of quarry informaations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry informaations
	 */
	@Override
	public List<QuarryInformaation> findAll(
		int start, int end,
		OrderByComparator<QuarryInformaation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry informaations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInformaationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry informaations
	 * @param end the upper bound of the range of quarry informaations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry informaations
	 */
	@Override
	public List<QuarryInformaation> findAll(
		int start, int end,
		OrderByComparator<QuarryInformaation> orderByComparator,
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

		List<QuarryInformaation> list = null;

		if (useFinderCache) {
			list = (List<QuarryInformaation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUARRYINFORMAATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUARRYINFORMAATION;

				sql = sql.concat(QuarryInformaationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QuarryInformaation>)QueryUtil.list(
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
	 * Removes all the quarry informaations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QuarryInformaation quarryInformaation : findAll()) {
			remove(quarryInformaation);
		}
	}

	/**
	 * Returns the number of quarry informaations.
	 *
	 * @return the number of quarry informaations
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
					_SQL_COUNT_QUARRYINFORMAATION);

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
		return "auarryInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUARRYINFORMAATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QuarryInformaationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the quarry informaation persistence.
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

		_finderPathFetchBygetQuarry_ById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetQuarry_ById",
			new String[] {Long.class.getName()},
			new String[] {"quarryApplicationId"}, true);

		_finderPathCountBygetQuarry_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetQuarry_ById",
			new String[] {Long.class.getName()},
			new String[] {"quarryApplicationId"}, false);

		QuarryInformaationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QuarryInformaationUtil.setPersistence(null);

		entityCache.removeCache(QuarryInformaationImpl.class.getName());
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_QUARRYINFORMAATION =
		"SELECT quarryInformaation FROM QuarryInformaation quarryInformaation";

	private static final String _SQL_SELECT_QUARRYINFORMAATION_WHERE =
		"SELECT quarryInformaation FROM QuarryInformaation quarryInformaation WHERE ";

	private static final String _SQL_COUNT_QUARRYINFORMAATION =
		"SELECT COUNT(quarryInformaation) FROM QuarryInformaation quarryInformaation";

	private static final String _SQL_COUNT_QUARRYINFORMAATION_WHERE =
		"SELECT COUNT(quarryInformaation) FROM QuarryInformaation quarryInformaation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "quarryInformaation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QuarryInformaation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QuarryInformaation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QuarryInformaationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}