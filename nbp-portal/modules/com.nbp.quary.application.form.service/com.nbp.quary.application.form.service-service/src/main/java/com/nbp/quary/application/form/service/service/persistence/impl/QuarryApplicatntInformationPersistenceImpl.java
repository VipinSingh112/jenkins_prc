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

import com.nbp.quary.application.form.service.exception.NoSuchQuarryApplicatntInformationException;
import com.nbp.quary.application.form.service.model.QuarryApplicatntInformation;
import com.nbp.quary.application.form.service.model.QuarryApplicatntInformationTable;
import com.nbp.quary.application.form.service.model.impl.QuarryApplicatntInformationImpl;
import com.nbp.quary.application.form.service.model.impl.QuarryApplicatntInformationModelImpl;
import com.nbp.quary.application.form.service.service.persistence.QuarryApplicatntInformationPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryApplicatntInformationUtil;
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
 * The persistence implementation for the quarry applicatnt information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QuarryApplicatntInformationPersistence.class)
public class QuarryApplicatntInformationPersistenceImpl
	extends BasePersistenceImpl<QuarryApplicatntInformation>
	implements QuarryApplicatntInformationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QuarryApplicatntInformationUtil</code> to access the quarry applicatnt information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QuarryApplicatntInformationImpl.class.getName();

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
	 * Returns the quarry applicatnt information where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryApplicatntInformationException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry applicatnt information
	 * @throws NoSuchQuarryApplicatntInformationException if a matching quarry applicatnt information could not be found
	 */
	@Override
	public QuarryApplicatntInformation findBygetQuarry_ById(
			long quarryApplicationId)
		throws NoSuchQuarryApplicatntInformationException {

		QuarryApplicatntInformation quarryApplicatntInformation =
			fetchBygetQuarry_ById(quarryApplicationId);

		if (quarryApplicatntInformation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("quarryApplicationId=");
			sb.append(quarryApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQuarryApplicatntInformationException(sb.toString());
		}

		return quarryApplicatntInformation;
	}

	/**
	 * Returns the quarry applicatnt information where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry applicatnt information, or <code>null</code> if a matching quarry applicatnt information could not be found
	 */
	@Override
	public QuarryApplicatntInformation fetchBygetQuarry_ById(
		long quarryApplicationId) {

		return fetchBygetQuarry_ById(quarryApplicationId, true);
	}

	/**
	 * Returns the quarry applicatnt information where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry applicatnt information, or <code>null</code> if a matching quarry applicatnt information could not be found
	 */
	@Override
	public QuarryApplicatntInformation fetchBygetQuarry_ById(
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

		if (result instanceof QuarryApplicatntInformation) {
			QuarryApplicatntInformation quarryApplicatntInformation =
				(QuarryApplicatntInformation)result;

			if (quarryApplicationId !=
					quarryApplicatntInformation.getQuarryApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_QUARRYAPPLICATNTINFORMATION_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRY_BYID_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

				List<QuarryApplicatntInformation> list = query.list();

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
								"QuarryApplicatntInformationPersistenceImpl.fetchBygetQuarry_ById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryApplicatntInformation quarryApplicatntInformation =
						list.get(0);

					result = quarryApplicatntInformation;

					cacheResult(quarryApplicatntInformation);
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
			return (QuarryApplicatntInformation)result;
		}
	}

	/**
	 * Removes the quarry applicatnt information where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry applicatnt information that was removed
	 */
	@Override
	public QuarryApplicatntInformation removeBygetQuarry_ById(
			long quarryApplicationId)
		throws NoSuchQuarryApplicatntInformationException {

		QuarryApplicatntInformation quarryApplicatntInformation =
			findBygetQuarry_ById(quarryApplicationId);

		return remove(quarryApplicatntInformation);
	}

	/**
	 * Returns the number of quarry applicatnt informations where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry applicatnt informations
	 */
	@Override
	public int countBygetQuarry_ById(long quarryApplicationId) {
		FinderPath finderPath = _finderPathCountBygetQuarry_ById;

		Object[] finderArgs = new Object[] {quarryApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYAPPLICATNTINFORMATION_WHERE);

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
			"quarryApplicatntInformation.quarryApplicationId = ?";

	public QuarryApplicatntInformationPersistenceImpl() {
		setModelClass(QuarryApplicatntInformation.class);

		setModelImplClass(QuarryApplicatntInformationImpl.class);
		setModelPKClass(long.class);

		setTable(QuarryApplicatntInformationTable.INSTANCE);
	}

	/**
	 * Caches the quarry applicatnt information in the entity cache if it is enabled.
	 *
	 * @param quarryApplicatntInformation the quarry applicatnt information
	 */
	@Override
	public void cacheResult(
		QuarryApplicatntInformation quarryApplicatntInformation) {

		entityCache.putResult(
			QuarryApplicatntInformationImpl.class,
			quarryApplicatntInformation.getPrimaryKey(),
			quarryApplicatntInformation);

		finderCache.putResult(
			_finderPathFetchBygetQuarry_ById,
			new Object[] {quarryApplicatntInformation.getQuarryApplicationId()},
			quarryApplicatntInformation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the quarry applicatnt informations in the entity cache if it is enabled.
	 *
	 * @param quarryApplicatntInformations the quarry applicatnt informations
	 */
	@Override
	public void cacheResult(
		List<QuarryApplicatntInformation> quarryApplicatntInformations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (quarryApplicatntInformations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QuarryApplicatntInformation quarryApplicatntInformation :
				quarryApplicatntInformations) {

			if (entityCache.getResult(
					QuarryApplicatntInformationImpl.class,
					quarryApplicatntInformation.getPrimaryKey()) == null) {

				cacheResult(quarryApplicatntInformation);
			}
		}
	}

	/**
	 * Clears the cache for all quarry applicatnt informations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QuarryApplicatntInformationImpl.class);

		finderCache.clearCache(QuarryApplicatntInformationImpl.class);
	}

	/**
	 * Clears the cache for the quarry applicatnt information.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QuarryApplicatntInformation quarryApplicatntInformation) {

		entityCache.removeResult(
			QuarryApplicatntInformationImpl.class, quarryApplicatntInformation);
	}

	@Override
	public void clearCache(
		List<QuarryApplicatntInformation> quarryApplicatntInformations) {

		for (QuarryApplicatntInformation quarryApplicatntInformation :
				quarryApplicatntInformations) {

			entityCache.removeResult(
				QuarryApplicatntInformationImpl.class,
				quarryApplicatntInformation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QuarryApplicatntInformationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				QuarryApplicatntInformationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		QuarryApplicatntInformationModelImpl
			quarryApplicatntInformationModelImpl) {

		Object[] args = new Object[] {
			quarryApplicatntInformationModelImpl.getQuarryApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetQuarry_ById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQuarry_ById, args,
			quarryApplicatntInformationModelImpl);
	}

	/**
	 * Creates a new quarry applicatnt information with the primary key. Does not add the quarry applicatnt information to the database.
	 *
	 * @param auarryApplicantId the primary key for the new quarry applicatnt information
	 * @return the new quarry applicatnt information
	 */
	@Override
	public QuarryApplicatntInformation create(long auarryApplicantId) {
		QuarryApplicatntInformation quarryApplicatntInformation =
			new QuarryApplicatntInformationImpl();

		quarryApplicatntInformation.setNew(true);
		quarryApplicatntInformation.setPrimaryKey(auarryApplicantId);

		quarryApplicatntInformation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return quarryApplicatntInformation;
	}

	/**
	 * Removes the quarry applicatnt information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auarryApplicantId the primary key of the quarry applicatnt information
	 * @return the quarry applicatnt information that was removed
	 * @throws NoSuchQuarryApplicatntInformationException if a quarry applicatnt information with the primary key could not be found
	 */
	@Override
	public QuarryApplicatntInformation remove(long auarryApplicantId)
		throws NoSuchQuarryApplicatntInformationException {

		return remove((Serializable)auarryApplicantId);
	}

	/**
	 * Removes the quarry applicatnt information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the quarry applicatnt information
	 * @return the quarry applicatnt information that was removed
	 * @throws NoSuchQuarryApplicatntInformationException if a quarry applicatnt information with the primary key could not be found
	 */
	@Override
	public QuarryApplicatntInformation remove(Serializable primaryKey)
		throws NoSuchQuarryApplicatntInformationException {

		Session session = null;

		try {
			session = openSession();

			QuarryApplicatntInformation quarryApplicatntInformation =
				(QuarryApplicatntInformation)session.get(
					QuarryApplicatntInformationImpl.class, primaryKey);

			if (quarryApplicatntInformation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQuarryApplicatntInformationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(quarryApplicatntInformation);
		}
		catch (NoSuchQuarryApplicatntInformationException
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
	protected QuarryApplicatntInformation removeImpl(
		QuarryApplicatntInformation quarryApplicatntInformation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(quarryApplicatntInformation)) {
				quarryApplicatntInformation =
					(QuarryApplicatntInformation)session.get(
						QuarryApplicatntInformationImpl.class,
						quarryApplicatntInformation.getPrimaryKeyObj());
			}

			if (quarryApplicatntInformation != null) {
				session.delete(quarryApplicatntInformation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (quarryApplicatntInformation != null) {
			clearCache(quarryApplicatntInformation);
		}

		return quarryApplicatntInformation;
	}

	@Override
	public QuarryApplicatntInformation updateImpl(
		QuarryApplicatntInformation quarryApplicatntInformation) {

		boolean isNew = quarryApplicatntInformation.isNew();

		if (!(quarryApplicatntInformation instanceof
				QuarryApplicatntInformationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					quarryApplicatntInformation.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					quarryApplicatntInformation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in quarryApplicatntInformation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QuarryApplicatntInformation implementation " +
					quarryApplicatntInformation.getClass());
		}

		QuarryApplicatntInformationModelImpl
			quarryApplicatntInformationModelImpl =
				(QuarryApplicatntInformationModelImpl)
					quarryApplicatntInformation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (quarryApplicatntInformation.getCreateDate() == null)) {
			if (serviceContext == null) {
				quarryApplicatntInformation.setCreateDate(date);
			}
			else {
				quarryApplicatntInformation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!quarryApplicatntInformationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				quarryApplicatntInformation.setModifiedDate(date);
			}
			else {
				quarryApplicatntInformation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(quarryApplicatntInformation);
			}
			else {
				quarryApplicatntInformation =
					(QuarryApplicatntInformation)session.merge(
						quarryApplicatntInformation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QuarryApplicatntInformationImpl.class,
			quarryApplicatntInformationModelImpl, false, true);

		cacheUniqueFindersCache(quarryApplicatntInformationModelImpl);

		if (isNew) {
			quarryApplicatntInformation.setNew(false);
		}

		quarryApplicatntInformation.resetOriginalValues();

		return quarryApplicatntInformation;
	}

	/**
	 * Returns the quarry applicatnt information with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the quarry applicatnt information
	 * @return the quarry applicatnt information
	 * @throws NoSuchQuarryApplicatntInformationException if a quarry applicatnt information with the primary key could not be found
	 */
	@Override
	public QuarryApplicatntInformation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQuarryApplicatntInformationException {

		QuarryApplicatntInformation quarryApplicatntInformation =
			fetchByPrimaryKey(primaryKey);

		if (quarryApplicatntInformation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQuarryApplicatntInformationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return quarryApplicatntInformation;
	}

	/**
	 * Returns the quarry applicatnt information with the primary key or throws a <code>NoSuchQuarryApplicatntInformationException</code> if it could not be found.
	 *
	 * @param auarryApplicantId the primary key of the quarry applicatnt information
	 * @return the quarry applicatnt information
	 * @throws NoSuchQuarryApplicatntInformationException if a quarry applicatnt information with the primary key could not be found
	 */
	@Override
	public QuarryApplicatntInformation findByPrimaryKey(long auarryApplicantId)
		throws NoSuchQuarryApplicatntInformationException {

		return findByPrimaryKey((Serializable)auarryApplicantId);
	}

	/**
	 * Returns the quarry applicatnt information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auarryApplicantId the primary key of the quarry applicatnt information
	 * @return the quarry applicatnt information, or <code>null</code> if a quarry applicatnt information with the primary key could not be found
	 */
	@Override
	public QuarryApplicatntInformation fetchByPrimaryKey(
		long auarryApplicantId) {

		return fetchByPrimaryKey((Serializable)auarryApplicantId);
	}

	/**
	 * Returns all the quarry applicatnt informations.
	 *
	 * @return the quarry applicatnt informations
	 */
	@Override
	public List<QuarryApplicatntInformation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry applicatnt informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicatntInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applicatnt informations
	 * @param end the upper bound of the range of quarry applicatnt informations (not inclusive)
	 * @return the range of quarry applicatnt informations
	 */
	@Override
	public List<QuarryApplicatntInformation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry applicatnt informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicatntInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applicatnt informations
	 * @param end the upper bound of the range of quarry applicatnt informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry applicatnt informations
	 */
	@Override
	public List<QuarryApplicatntInformation> findAll(
		int start, int end,
		OrderByComparator<QuarryApplicatntInformation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry applicatnt informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicatntInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applicatnt informations
	 * @param end the upper bound of the range of quarry applicatnt informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry applicatnt informations
	 */
	@Override
	public List<QuarryApplicatntInformation> findAll(
		int start, int end,
		OrderByComparator<QuarryApplicatntInformation> orderByComparator,
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

		List<QuarryApplicatntInformation> list = null;

		if (useFinderCache) {
			list = (List<QuarryApplicatntInformation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUARRYAPPLICATNTINFORMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUARRYAPPLICATNTINFORMATION;

				sql = sql.concat(
					QuarryApplicatntInformationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QuarryApplicatntInformation>)QueryUtil.list(
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
	 * Removes all the quarry applicatnt informations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QuarryApplicatntInformation quarryApplicatntInformation :
				findAll()) {

			remove(quarryApplicatntInformation);
		}
	}

	/**
	 * Returns the number of quarry applicatnt informations.
	 *
	 * @return the number of quarry applicatnt informations
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
					_SQL_COUNT_QUARRYAPPLICATNTINFORMATION);

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
		return "auarryApplicantId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUARRYAPPLICATNTINFORMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QuarryApplicatntInformationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the quarry applicatnt information persistence.
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

		QuarryApplicatntInformationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QuarryApplicatntInformationUtil.setPersistence(null);

		entityCache.removeCache(
			QuarryApplicatntInformationImpl.class.getName());
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

	private static final String _SQL_SELECT_QUARRYAPPLICATNTINFORMATION =
		"SELECT quarryApplicatntInformation FROM QuarryApplicatntInformation quarryApplicatntInformation";

	private static final String _SQL_SELECT_QUARRYAPPLICATNTINFORMATION_WHERE =
		"SELECT quarryApplicatntInformation FROM QuarryApplicatntInformation quarryApplicatntInformation WHERE ";

	private static final String _SQL_COUNT_QUARRYAPPLICATNTINFORMATION =
		"SELECT COUNT(quarryApplicatntInformation) FROM QuarryApplicatntInformation quarryApplicatntInformation";

	private static final String _SQL_COUNT_QUARRYAPPLICATNTINFORMATION_WHERE =
		"SELECT COUNT(quarryApplicatntInformation) FROM QuarryApplicatntInformation quarryApplicatntInformation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"quarryApplicatntInformation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QuarryApplicatntInformation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QuarryApplicatntInformation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QuarryApplicatntInformationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}