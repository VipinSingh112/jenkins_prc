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

import com.nbp.quary.application.form.service.exception.NoSuchQuarryGeneralInformationException;
import com.nbp.quary.application.form.service.model.QuarryGeneralInformation;
import com.nbp.quary.application.form.service.model.QuarryGeneralInformationTable;
import com.nbp.quary.application.form.service.model.impl.QuarryGeneralInformationImpl;
import com.nbp.quary.application.form.service.model.impl.QuarryGeneralInformationModelImpl;
import com.nbp.quary.application.form.service.service.persistence.QuarryGeneralInformationPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryGeneralInformationUtil;
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
 * The persistence implementation for the quarry general information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QuarryGeneralInformationPersistence.class)
public class QuarryGeneralInformationPersistenceImpl
	extends BasePersistenceImpl<QuarryGeneralInformation>
	implements QuarryGeneralInformationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QuarryGeneralInformationUtil</code> to access the quarry general information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QuarryGeneralInformationImpl.class.getName();

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
	 * Returns the quarry general information where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryGeneralInformationException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry general information
	 * @throws NoSuchQuarryGeneralInformationException if a matching quarry general information could not be found
	 */
	@Override
	public QuarryGeneralInformation findBygetQuarry_ById(
			long quarryApplicationId)
		throws NoSuchQuarryGeneralInformationException {

		QuarryGeneralInformation quarryGeneralInformation =
			fetchBygetQuarry_ById(quarryApplicationId);

		if (quarryGeneralInformation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("quarryApplicationId=");
			sb.append(quarryApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQuarryGeneralInformationException(sb.toString());
		}

		return quarryGeneralInformation;
	}

	/**
	 * Returns the quarry general information where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry general information, or <code>null</code> if a matching quarry general information could not be found
	 */
	@Override
	public QuarryGeneralInformation fetchBygetQuarry_ById(
		long quarryApplicationId) {

		return fetchBygetQuarry_ById(quarryApplicationId, true);
	}

	/**
	 * Returns the quarry general information where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry general information, or <code>null</code> if a matching quarry general information could not be found
	 */
	@Override
	public QuarryGeneralInformation fetchBygetQuarry_ById(
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

		if (result instanceof QuarryGeneralInformation) {
			QuarryGeneralInformation quarryGeneralInformation =
				(QuarryGeneralInformation)result;

			if (quarryApplicationId !=
					quarryGeneralInformation.getQuarryApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_QUARRYGENERALINFORMATION_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRY_BYID_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

				List<QuarryGeneralInformation> list = query.list();

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
								"QuarryGeneralInformationPersistenceImpl.fetchBygetQuarry_ById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryGeneralInformation quarryGeneralInformation =
						list.get(0);

					result = quarryGeneralInformation;

					cacheResult(quarryGeneralInformation);
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
			return (QuarryGeneralInformation)result;
		}
	}

	/**
	 * Removes the quarry general information where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry general information that was removed
	 */
	@Override
	public QuarryGeneralInformation removeBygetQuarry_ById(
			long quarryApplicationId)
		throws NoSuchQuarryGeneralInformationException {

		QuarryGeneralInformation quarryGeneralInformation =
			findBygetQuarry_ById(quarryApplicationId);

		return remove(quarryGeneralInformation);
	}

	/**
	 * Returns the number of quarry general informations where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry general informations
	 */
	@Override
	public int countBygetQuarry_ById(long quarryApplicationId) {
		FinderPath finderPath = _finderPathCountBygetQuarry_ById;

		Object[] finderArgs = new Object[] {quarryApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYGENERALINFORMATION_WHERE);

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
			"quarryGeneralInformation.quarryApplicationId = ?";

	public QuarryGeneralInformationPersistenceImpl() {
		setModelClass(QuarryGeneralInformation.class);

		setModelImplClass(QuarryGeneralInformationImpl.class);
		setModelPKClass(long.class);

		setTable(QuarryGeneralInformationTable.INSTANCE);
	}

	/**
	 * Caches the quarry general information in the entity cache if it is enabled.
	 *
	 * @param quarryGeneralInformation the quarry general information
	 */
	@Override
	public void cacheResult(QuarryGeneralInformation quarryGeneralInformation) {
		entityCache.putResult(
			QuarryGeneralInformationImpl.class,
			quarryGeneralInformation.getPrimaryKey(), quarryGeneralInformation);

		finderCache.putResult(
			_finderPathFetchBygetQuarry_ById,
			new Object[] {quarryGeneralInformation.getQuarryApplicationId()},
			quarryGeneralInformation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the quarry general informations in the entity cache if it is enabled.
	 *
	 * @param quarryGeneralInformations the quarry general informations
	 */
	@Override
	public void cacheResult(
		List<QuarryGeneralInformation> quarryGeneralInformations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (quarryGeneralInformations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QuarryGeneralInformation quarryGeneralInformation :
				quarryGeneralInformations) {

			if (entityCache.getResult(
					QuarryGeneralInformationImpl.class,
					quarryGeneralInformation.getPrimaryKey()) == null) {

				cacheResult(quarryGeneralInformation);
			}
		}
	}

	/**
	 * Clears the cache for all quarry general informations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QuarryGeneralInformationImpl.class);

		finderCache.clearCache(QuarryGeneralInformationImpl.class);
	}

	/**
	 * Clears the cache for the quarry general information.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QuarryGeneralInformation quarryGeneralInformation) {
		entityCache.removeResult(
			QuarryGeneralInformationImpl.class, quarryGeneralInformation);
	}

	@Override
	public void clearCache(
		List<QuarryGeneralInformation> quarryGeneralInformations) {

		for (QuarryGeneralInformation quarryGeneralInformation :
				quarryGeneralInformations) {

			entityCache.removeResult(
				QuarryGeneralInformationImpl.class, quarryGeneralInformation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QuarryGeneralInformationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				QuarryGeneralInformationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		QuarryGeneralInformationModelImpl quarryGeneralInformationModelImpl) {

		Object[] args = new Object[] {
			quarryGeneralInformationModelImpl.getQuarryApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetQuarry_ById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQuarry_ById, args,
			quarryGeneralInformationModelImpl);
	}

	/**
	 * Creates a new quarry general information with the primary key. Does not add the quarry general information to the database.
	 *
	 * @param generalInfoId the primary key for the new quarry general information
	 * @return the new quarry general information
	 */
	@Override
	public QuarryGeneralInformation create(long generalInfoId) {
		QuarryGeneralInformation quarryGeneralInformation =
			new QuarryGeneralInformationImpl();

		quarryGeneralInformation.setNew(true);
		quarryGeneralInformation.setPrimaryKey(generalInfoId);

		quarryGeneralInformation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return quarryGeneralInformation;
	}

	/**
	 * Removes the quarry general information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param generalInfoId the primary key of the quarry general information
	 * @return the quarry general information that was removed
	 * @throws NoSuchQuarryGeneralInformationException if a quarry general information with the primary key could not be found
	 */
	@Override
	public QuarryGeneralInformation remove(long generalInfoId)
		throws NoSuchQuarryGeneralInformationException {

		return remove((Serializable)generalInfoId);
	}

	/**
	 * Removes the quarry general information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the quarry general information
	 * @return the quarry general information that was removed
	 * @throws NoSuchQuarryGeneralInformationException if a quarry general information with the primary key could not be found
	 */
	@Override
	public QuarryGeneralInformation remove(Serializable primaryKey)
		throws NoSuchQuarryGeneralInformationException {

		Session session = null;

		try {
			session = openSession();

			QuarryGeneralInformation quarryGeneralInformation =
				(QuarryGeneralInformation)session.get(
					QuarryGeneralInformationImpl.class, primaryKey);

			if (quarryGeneralInformation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQuarryGeneralInformationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(quarryGeneralInformation);
		}
		catch (NoSuchQuarryGeneralInformationException noSuchEntityException) {
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
	protected QuarryGeneralInformation removeImpl(
		QuarryGeneralInformation quarryGeneralInformation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(quarryGeneralInformation)) {
				quarryGeneralInformation =
					(QuarryGeneralInformation)session.get(
						QuarryGeneralInformationImpl.class,
						quarryGeneralInformation.getPrimaryKeyObj());
			}

			if (quarryGeneralInformation != null) {
				session.delete(quarryGeneralInformation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (quarryGeneralInformation != null) {
			clearCache(quarryGeneralInformation);
		}

		return quarryGeneralInformation;
	}

	@Override
	public QuarryGeneralInformation updateImpl(
		QuarryGeneralInformation quarryGeneralInformation) {

		boolean isNew = quarryGeneralInformation.isNew();

		if (!(quarryGeneralInformation instanceof
				QuarryGeneralInformationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(quarryGeneralInformation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					quarryGeneralInformation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in quarryGeneralInformation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QuarryGeneralInformation implementation " +
					quarryGeneralInformation.getClass());
		}

		QuarryGeneralInformationModelImpl quarryGeneralInformationModelImpl =
			(QuarryGeneralInformationModelImpl)quarryGeneralInformation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (quarryGeneralInformation.getCreateDate() == null)) {
			if (serviceContext == null) {
				quarryGeneralInformation.setCreateDate(date);
			}
			else {
				quarryGeneralInformation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!quarryGeneralInformationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				quarryGeneralInformation.setModifiedDate(date);
			}
			else {
				quarryGeneralInformation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(quarryGeneralInformation);
			}
			else {
				quarryGeneralInformation =
					(QuarryGeneralInformation)session.merge(
						quarryGeneralInformation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QuarryGeneralInformationImpl.class,
			quarryGeneralInformationModelImpl, false, true);

		cacheUniqueFindersCache(quarryGeneralInformationModelImpl);

		if (isNew) {
			quarryGeneralInformation.setNew(false);
		}

		quarryGeneralInformation.resetOriginalValues();

		return quarryGeneralInformation;
	}

	/**
	 * Returns the quarry general information with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the quarry general information
	 * @return the quarry general information
	 * @throws NoSuchQuarryGeneralInformationException if a quarry general information with the primary key could not be found
	 */
	@Override
	public QuarryGeneralInformation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQuarryGeneralInformationException {

		QuarryGeneralInformation quarryGeneralInformation = fetchByPrimaryKey(
			primaryKey);

		if (quarryGeneralInformation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQuarryGeneralInformationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return quarryGeneralInformation;
	}

	/**
	 * Returns the quarry general information with the primary key or throws a <code>NoSuchQuarryGeneralInformationException</code> if it could not be found.
	 *
	 * @param generalInfoId the primary key of the quarry general information
	 * @return the quarry general information
	 * @throws NoSuchQuarryGeneralInformationException if a quarry general information with the primary key could not be found
	 */
	@Override
	public QuarryGeneralInformation findByPrimaryKey(long generalInfoId)
		throws NoSuchQuarryGeneralInformationException {

		return findByPrimaryKey((Serializable)generalInfoId);
	}

	/**
	 * Returns the quarry general information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param generalInfoId the primary key of the quarry general information
	 * @return the quarry general information, or <code>null</code> if a quarry general information with the primary key could not be found
	 */
	@Override
	public QuarryGeneralInformation fetchByPrimaryKey(long generalInfoId) {
		return fetchByPrimaryKey((Serializable)generalInfoId);
	}

	/**
	 * Returns all the quarry general informations.
	 *
	 * @return the quarry general informations
	 */
	@Override
	public List<QuarryGeneralInformation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry general informations
	 * @param end the upper bound of the range of quarry general informations (not inclusive)
	 * @return the range of quarry general informations
	 */
	@Override
	public List<QuarryGeneralInformation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry general informations
	 * @param end the upper bound of the range of quarry general informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry general informations
	 */
	@Override
	public List<QuarryGeneralInformation> findAll(
		int start, int end,
		OrderByComparator<QuarryGeneralInformation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry general informations
	 * @param end the upper bound of the range of quarry general informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry general informations
	 */
	@Override
	public List<QuarryGeneralInformation> findAll(
		int start, int end,
		OrderByComparator<QuarryGeneralInformation> orderByComparator,
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

		List<QuarryGeneralInformation> list = null;

		if (useFinderCache) {
			list = (List<QuarryGeneralInformation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUARRYGENERALINFORMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUARRYGENERALINFORMATION;

				sql = sql.concat(
					QuarryGeneralInformationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QuarryGeneralInformation>)QueryUtil.list(
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
	 * Removes all the quarry general informations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QuarryGeneralInformation quarryGeneralInformation : findAll()) {
			remove(quarryGeneralInformation);
		}
	}

	/**
	 * Returns the number of quarry general informations.
	 *
	 * @return the number of quarry general informations
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
					_SQL_COUNT_QUARRYGENERALINFORMATION);

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
		return "generalInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUARRYGENERALINFORMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QuarryGeneralInformationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the quarry general information persistence.
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

		QuarryGeneralInformationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QuarryGeneralInformationUtil.setPersistence(null);

		entityCache.removeCache(QuarryGeneralInformationImpl.class.getName());
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

	private static final String _SQL_SELECT_QUARRYGENERALINFORMATION =
		"SELECT quarryGeneralInformation FROM QuarryGeneralInformation quarryGeneralInformation";

	private static final String _SQL_SELECT_QUARRYGENERALINFORMATION_WHERE =
		"SELECT quarryGeneralInformation FROM QuarryGeneralInformation quarryGeneralInformation WHERE ";

	private static final String _SQL_COUNT_QUARRYGENERALINFORMATION =
		"SELECT COUNT(quarryGeneralInformation) FROM QuarryGeneralInformation quarryGeneralInformation";

	private static final String _SQL_COUNT_QUARRYGENERALINFORMATION_WHERE =
		"SELECT COUNT(quarryGeneralInformation) FROM QuarryGeneralInformation quarryGeneralInformation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"quarryGeneralInformation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QuarryGeneralInformation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QuarryGeneralInformation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QuarryGeneralInformationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}