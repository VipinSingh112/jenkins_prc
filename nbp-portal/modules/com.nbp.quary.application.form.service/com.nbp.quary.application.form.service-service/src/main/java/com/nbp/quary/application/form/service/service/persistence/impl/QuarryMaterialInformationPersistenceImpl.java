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

import com.nbp.quary.application.form.service.exception.NoSuchQuarryMaterialInformationException;
import com.nbp.quary.application.form.service.model.QuarryMaterialInformation;
import com.nbp.quary.application.form.service.model.QuarryMaterialInformationTable;
import com.nbp.quary.application.form.service.model.impl.QuarryMaterialInformationImpl;
import com.nbp.quary.application.form.service.model.impl.QuarryMaterialInformationModelImpl;
import com.nbp.quary.application.form.service.service.persistence.QuarryMaterialInformationPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryMaterialInformationUtil;
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
 * The persistence implementation for the quarry material information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QuarryMaterialInformationPersistence.class)
public class QuarryMaterialInformationPersistenceImpl
	extends BasePersistenceImpl<QuarryMaterialInformation>
	implements QuarryMaterialInformationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QuarryMaterialInformationUtil</code> to access the quarry material information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QuarryMaterialInformationImpl.class.getName();

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
	 * Returns the quarry material information where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryMaterialInformationException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry material information
	 * @throws NoSuchQuarryMaterialInformationException if a matching quarry material information could not be found
	 */
	@Override
	public QuarryMaterialInformation findBygetQuarry_ById(
			long quarryApplicationId)
		throws NoSuchQuarryMaterialInformationException {

		QuarryMaterialInformation quarryMaterialInformation =
			fetchBygetQuarry_ById(quarryApplicationId);

		if (quarryMaterialInformation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("quarryApplicationId=");
			sb.append(quarryApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQuarryMaterialInformationException(sb.toString());
		}

		return quarryMaterialInformation;
	}

	/**
	 * Returns the quarry material information where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry material information, or <code>null</code> if a matching quarry material information could not be found
	 */
	@Override
	public QuarryMaterialInformation fetchBygetQuarry_ById(
		long quarryApplicationId) {

		return fetchBygetQuarry_ById(quarryApplicationId, true);
	}

	/**
	 * Returns the quarry material information where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry material information, or <code>null</code> if a matching quarry material information could not be found
	 */
	@Override
	public QuarryMaterialInformation fetchBygetQuarry_ById(
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

		if (result instanceof QuarryMaterialInformation) {
			QuarryMaterialInformation quarryMaterialInformation =
				(QuarryMaterialInformation)result;

			if (quarryApplicationId !=
					quarryMaterialInformation.getQuarryApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_QUARRYMATERIALINFORMATION_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRY_BYID_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

				List<QuarryMaterialInformation> list = query.list();

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
								"QuarryMaterialInformationPersistenceImpl.fetchBygetQuarry_ById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryMaterialInformation quarryMaterialInformation =
						list.get(0);

					result = quarryMaterialInformation;

					cacheResult(quarryMaterialInformation);
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
			return (QuarryMaterialInformation)result;
		}
	}

	/**
	 * Removes the quarry material information where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry material information that was removed
	 */
	@Override
	public QuarryMaterialInformation removeBygetQuarry_ById(
			long quarryApplicationId)
		throws NoSuchQuarryMaterialInformationException {

		QuarryMaterialInformation quarryMaterialInformation =
			findBygetQuarry_ById(quarryApplicationId);

		return remove(quarryMaterialInformation);
	}

	/**
	 * Returns the number of quarry material informations where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry material informations
	 */
	@Override
	public int countBygetQuarry_ById(long quarryApplicationId) {
		FinderPath finderPath = _finderPathCountBygetQuarry_ById;

		Object[] finderArgs = new Object[] {quarryApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYMATERIALINFORMATION_WHERE);

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
			"quarryMaterialInformation.quarryApplicationId = ?";

	public QuarryMaterialInformationPersistenceImpl() {
		setModelClass(QuarryMaterialInformation.class);

		setModelImplClass(QuarryMaterialInformationImpl.class);
		setModelPKClass(long.class);

		setTable(QuarryMaterialInformationTable.INSTANCE);
	}

	/**
	 * Caches the quarry material information in the entity cache if it is enabled.
	 *
	 * @param quarryMaterialInformation the quarry material information
	 */
	@Override
	public void cacheResult(
		QuarryMaterialInformation quarryMaterialInformation) {

		entityCache.putResult(
			QuarryMaterialInformationImpl.class,
			quarryMaterialInformation.getPrimaryKey(),
			quarryMaterialInformation);

		finderCache.putResult(
			_finderPathFetchBygetQuarry_ById,
			new Object[] {quarryMaterialInformation.getQuarryApplicationId()},
			quarryMaterialInformation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the quarry material informations in the entity cache if it is enabled.
	 *
	 * @param quarryMaterialInformations the quarry material informations
	 */
	@Override
	public void cacheResult(
		List<QuarryMaterialInformation> quarryMaterialInformations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (quarryMaterialInformations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QuarryMaterialInformation quarryMaterialInformation :
				quarryMaterialInformations) {

			if (entityCache.getResult(
					QuarryMaterialInformationImpl.class,
					quarryMaterialInformation.getPrimaryKey()) == null) {

				cacheResult(quarryMaterialInformation);
			}
		}
	}

	/**
	 * Clears the cache for all quarry material informations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QuarryMaterialInformationImpl.class);

		finderCache.clearCache(QuarryMaterialInformationImpl.class);
	}

	/**
	 * Clears the cache for the quarry material information.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QuarryMaterialInformation quarryMaterialInformation) {

		entityCache.removeResult(
			QuarryMaterialInformationImpl.class, quarryMaterialInformation);
	}

	@Override
	public void clearCache(
		List<QuarryMaterialInformation> quarryMaterialInformations) {

		for (QuarryMaterialInformation quarryMaterialInformation :
				quarryMaterialInformations) {

			entityCache.removeResult(
				QuarryMaterialInformationImpl.class, quarryMaterialInformation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QuarryMaterialInformationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				QuarryMaterialInformationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		QuarryMaterialInformationModelImpl quarryMaterialInformationModelImpl) {

		Object[] args = new Object[] {
			quarryMaterialInformationModelImpl.getQuarryApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetQuarry_ById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQuarry_ById, args,
			quarryMaterialInformationModelImpl);
	}

	/**
	 * Creates a new quarry material information with the primary key. Does not add the quarry material information to the database.
	 *
	 * @param materialInfoId the primary key for the new quarry material information
	 * @return the new quarry material information
	 */
	@Override
	public QuarryMaterialInformation create(long materialInfoId) {
		QuarryMaterialInformation quarryMaterialInformation =
			new QuarryMaterialInformationImpl();

		quarryMaterialInformation.setNew(true);
		quarryMaterialInformation.setPrimaryKey(materialInfoId);

		quarryMaterialInformation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return quarryMaterialInformation;
	}

	/**
	 * Removes the quarry material information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param materialInfoId the primary key of the quarry material information
	 * @return the quarry material information that was removed
	 * @throws NoSuchQuarryMaterialInformationException if a quarry material information with the primary key could not be found
	 */
	@Override
	public QuarryMaterialInformation remove(long materialInfoId)
		throws NoSuchQuarryMaterialInformationException {

		return remove((Serializable)materialInfoId);
	}

	/**
	 * Removes the quarry material information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the quarry material information
	 * @return the quarry material information that was removed
	 * @throws NoSuchQuarryMaterialInformationException if a quarry material information with the primary key could not be found
	 */
	@Override
	public QuarryMaterialInformation remove(Serializable primaryKey)
		throws NoSuchQuarryMaterialInformationException {

		Session session = null;

		try {
			session = openSession();

			QuarryMaterialInformation quarryMaterialInformation =
				(QuarryMaterialInformation)session.get(
					QuarryMaterialInformationImpl.class, primaryKey);

			if (quarryMaterialInformation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQuarryMaterialInformationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(quarryMaterialInformation);
		}
		catch (NoSuchQuarryMaterialInformationException noSuchEntityException) {
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
	protected QuarryMaterialInformation removeImpl(
		QuarryMaterialInformation quarryMaterialInformation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(quarryMaterialInformation)) {
				quarryMaterialInformation =
					(QuarryMaterialInformation)session.get(
						QuarryMaterialInformationImpl.class,
						quarryMaterialInformation.getPrimaryKeyObj());
			}

			if (quarryMaterialInformation != null) {
				session.delete(quarryMaterialInformation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (quarryMaterialInformation != null) {
			clearCache(quarryMaterialInformation);
		}

		return quarryMaterialInformation;
	}

	@Override
	public QuarryMaterialInformation updateImpl(
		QuarryMaterialInformation quarryMaterialInformation) {

		boolean isNew = quarryMaterialInformation.isNew();

		if (!(quarryMaterialInformation instanceof
				QuarryMaterialInformationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(quarryMaterialInformation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					quarryMaterialInformation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in quarryMaterialInformation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QuarryMaterialInformation implementation " +
					quarryMaterialInformation.getClass());
		}

		QuarryMaterialInformationModelImpl quarryMaterialInformationModelImpl =
			(QuarryMaterialInformationModelImpl)quarryMaterialInformation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (quarryMaterialInformation.getCreateDate() == null)) {
			if (serviceContext == null) {
				quarryMaterialInformation.setCreateDate(date);
			}
			else {
				quarryMaterialInformation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!quarryMaterialInformationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				quarryMaterialInformation.setModifiedDate(date);
			}
			else {
				quarryMaterialInformation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(quarryMaterialInformation);
			}
			else {
				quarryMaterialInformation =
					(QuarryMaterialInformation)session.merge(
						quarryMaterialInformation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QuarryMaterialInformationImpl.class,
			quarryMaterialInformationModelImpl, false, true);

		cacheUniqueFindersCache(quarryMaterialInformationModelImpl);

		if (isNew) {
			quarryMaterialInformation.setNew(false);
		}

		quarryMaterialInformation.resetOriginalValues();

		return quarryMaterialInformation;
	}

	/**
	 * Returns the quarry material information with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the quarry material information
	 * @return the quarry material information
	 * @throws NoSuchQuarryMaterialInformationException if a quarry material information with the primary key could not be found
	 */
	@Override
	public QuarryMaterialInformation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQuarryMaterialInformationException {

		QuarryMaterialInformation quarryMaterialInformation = fetchByPrimaryKey(
			primaryKey);

		if (quarryMaterialInformation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQuarryMaterialInformationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return quarryMaterialInformation;
	}

	/**
	 * Returns the quarry material information with the primary key or throws a <code>NoSuchQuarryMaterialInformationException</code> if it could not be found.
	 *
	 * @param materialInfoId the primary key of the quarry material information
	 * @return the quarry material information
	 * @throws NoSuchQuarryMaterialInformationException if a quarry material information with the primary key could not be found
	 */
	@Override
	public QuarryMaterialInformation findByPrimaryKey(long materialInfoId)
		throws NoSuchQuarryMaterialInformationException {

		return findByPrimaryKey((Serializable)materialInfoId);
	}

	/**
	 * Returns the quarry material information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param materialInfoId the primary key of the quarry material information
	 * @return the quarry material information, or <code>null</code> if a quarry material information with the primary key could not be found
	 */
	@Override
	public QuarryMaterialInformation fetchByPrimaryKey(long materialInfoId) {
		return fetchByPrimaryKey((Serializable)materialInfoId);
	}

	/**
	 * Returns all the quarry material informations.
	 *
	 * @return the quarry material informations
	 */
	@Override
	public List<QuarryMaterialInformation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry material informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry material informations
	 * @param end the upper bound of the range of quarry material informations (not inclusive)
	 * @return the range of quarry material informations
	 */
	@Override
	public List<QuarryMaterialInformation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry material informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry material informations
	 * @param end the upper bound of the range of quarry material informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry material informations
	 */
	@Override
	public List<QuarryMaterialInformation> findAll(
		int start, int end,
		OrderByComparator<QuarryMaterialInformation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry material informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryMaterialInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry material informations
	 * @param end the upper bound of the range of quarry material informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry material informations
	 */
	@Override
	public List<QuarryMaterialInformation> findAll(
		int start, int end,
		OrderByComparator<QuarryMaterialInformation> orderByComparator,
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

		List<QuarryMaterialInformation> list = null;

		if (useFinderCache) {
			list = (List<QuarryMaterialInformation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUARRYMATERIALINFORMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUARRYMATERIALINFORMATION;

				sql = sql.concat(
					QuarryMaterialInformationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QuarryMaterialInformation>)QueryUtil.list(
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
	 * Removes all the quarry material informations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QuarryMaterialInformation quarryMaterialInformation : findAll()) {
			remove(quarryMaterialInformation);
		}
	}

	/**
	 * Returns the number of quarry material informations.
	 *
	 * @return the number of quarry material informations
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
					_SQL_COUNT_QUARRYMATERIALINFORMATION);

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
		return "materialInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUARRYMATERIALINFORMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QuarryMaterialInformationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the quarry material information persistence.
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

		QuarryMaterialInformationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QuarryMaterialInformationUtil.setPersistence(null);

		entityCache.removeCache(QuarryMaterialInformationImpl.class.getName());
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

	private static final String _SQL_SELECT_QUARRYMATERIALINFORMATION =
		"SELECT quarryMaterialInformation FROM QuarryMaterialInformation quarryMaterialInformation";

	private static final String _SQL_SELECT_QUARRYMATERIALINFORMATION_WHERE =
		"SELECT quarryMaterialInformation FROM QuarryMaterialInformation quarryMaterialInformation WHERE ";

	private static final String _SQL_COUNT_QUARRYMATERIALINFORMATION =
		"SELECT COUNT(quarryMaterialInformation) FROM QuarryMaterialInformation quarryMaterialInformation";

	private static final String _SQL_COUNT_QUARRYMATERIALINFORMATION_WHERE =
		"SELECT COUNT(quarryMaterialInformation) FROM QuarryMaterialInformation quarryMaterialInformation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"quarryMaterialInformation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QuarryMaterialInformation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QuarryMaterialInformation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QuarryMaterialInformationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}