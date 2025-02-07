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

import com.nbp.creative.application.form.service.exception.NoSuchCreativeCompanyGeneralInformationException;
import com.nbp.creative.application.form.service.model.CreativeCompanyGeneralInformation;
import com.nbp.creative.application.form.service.model.CreativeCompanyGeneralInformationTable;
import com.nbp.creative.application.form.service.model.impl.CreativeCompanyGeneralInformationImpl;
import com.nbp.creative.application.form.service.model.impl.CreativeCompanyGeneralInformationModelImpl;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyGeneralInformationPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyGeneralInformationUtil;
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
 * The persistence implementation for the creative company general information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CreativeCompanyGeneralInformationPersistence.class)
public class CreativeCompanyGeneralInformationPersistenceImpl
	extends BasePersistenceImpl<CreativeCompanyGeneralInformation>
	implements CreativeCompanyGeneralInformationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CreativeCompanyGeneralInformationUtil</code> to access the creative company general information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CreativeCompanyGeneralInformationImpl.class.getName();

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
	 * Returns the creative company general information where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeCompanyGeneralInformationException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company general information
	 * @throws NoSuchCreativeCompanyGeneralInformationException if a matching creative company general information could not be found
	 */
	@Override
	public CreativeCompanyGeneralInformation findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyGeneralInformationException {

		CreativeCompanyGeneralInformation creativeCompanyGeneralInformation =
			fetchBygetCreativeById(CreativeApplicationId);

		if (creativeCompanyGeneralInformation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("CreativeApplicationId=");
			sb.append(CreativeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCreativeCompanyGeneralInformationException(
				sb.toString());
		}

		return creativeCompanyGeneralInformation;
	}

	/**
	 * Returns the creative company general information where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company general information, or <code>null</code> if a matching creative company general information could not be found
	 */
	@Override
	public CreativeCompanyGeneralInformation fetchBygetCreativeById(
		long CreativeApplicationId) {

		return fetchBygetCreativeById(CreativeApplicationId, true);
	}

	/**
	 * Returns the creative company general information where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative company general information, or <code>null</code> if a matching creative company general information could not be found
	 */
	@Override
	public CreativeCompanyGeneralInformation fetchBygetCreativeById(
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

		if (result instanceof CreativeCompanyGeneralInformation) {
			CreativeCompanyGeneralInformation
				creativeCompanyGeneralInformation =
					(CreativeCompanyGeneralInformation)result;

			if (CreativeApplicationId !=
					creativeCompanyGeneralInformation.
						getCreativeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CREATIVECOMPANYGENERALINFORMATION_WHERE);

			sb.append(_FINDER_COLUMN_GETCREATIVEBYID_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

				List<CreativeCompanyGeneralInformation> list = query.list();

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
								"CreativeCompanyGeneralInformationPersistenceImpl.fetchBygetCreativeById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeCompanyGeneralInformation
						creativeCompanyGeneralInformation = list.get(0);

					result = creativeCompanyGeneralInformation;

					cacheResult(creativeCompanyGeneralInformation);
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
			return (CreativeCompanyGeneralInformation)result;
		}
	}

	/**
	 * Removes the creative company general information where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative company general information that was removed
	 */
	@Override
	public CreativeCompanyGeneralInformation removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyGeneralInformationException {

		CreativeCompanyGeneralInformation creativeCompanyGeneralInformation =
			findBygetCreativeById(CreativeApplicationId);

		return remove(creativeCompanyGeneralInformation);
	}

	/**
	 * Returns the number of creative company general informations where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative company general informations
	 */
	@Override
	public int countBygetCreativeById(long CreativeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCreativeById;

		Object[] finderArgs = new Object[] {CreativeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVECOMPANYGENERALINFORMATION_WHERE);

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
			"creativeCompanyGeneralInformation.CreativeApplicationId = ?";

	public CreativeCompanyGeneralInformationPersistenceImpl() {
		setModelClass(CreativeCompanyGeneralInformation.class);

		setModelImplClass(CreativeCompanyGeneralInformationImpl.class);
		setModelPKClass(long.class);

		setTable(CreativeCompanyGeneralInformationTable.INSTANCE);
	}

	/**
	 * Caches the creative company general information in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyGeneralInformation the creative company general information
	 */
	@Override
	public void cacheResult(
		CreativeCompanyGeneralInformation creativeCompanyGeneralInformation) {

		entityCache.putResult(
			CreativeCompanyGeneralInformationImpl.class,
			creativeCompanyGeneralInformation.getPrimaryKey(),
			creativeCompanyGeneralInformation);

		finderCache.putResult(
			_finderPathFetchBygetCreativeById,
			new Object[] {
				creativeCompanyGeneralInformation.getCreativeApplicationId()
			},
			creativeCompanyGeneralInformation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the creative company general informations in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyGeneralInformations the creative company general informations
	 */
	@Override
	public void cacheResult(
		List<CreativeCompanyGeneralInformation>
			creativeCompanyGeneralInformations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (creativeCompanyGeneralInformations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CreativeCompanyGeneralInformation
				creativeCompanyGeneralInformation :
					creativeCompanyGeneralInformations) {

			if (entityCache.getResult(
					CreativeCompanyGeneralInformationImpl.class,
					creativeCompanyGeneralInformation.getPrimaryKey()) ==
						null) {

				cacheResult(creativeCompanyGeneralInformation);
			}
		}
	}

	/**
	 * Clears the cache for all creative company general informations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CreativeCompanyGeneralInformationImpl.class);

		finderCache.clearCache(CreativeCompanyGeneralInformationImpl.class);
	}

	/**
	 * Clears the cache for the creative company general information.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CreativeCompanyGeneralInformation creativeCompanyGeneralInformation) {

		entityCache.removeResult(
			CreativeCompanyGeneralInformationImpl.class,
			creativeCompanyGeneralInformation);
	}

	@Override
	public void clearCache(
		List<CreativeCompanyGeneralInformation>
			creativeCompanyGeneralInformations) {

		for (CreativeCompanyGeneralInformation
				creativeCompanyGeneralInformation :
					creativeCompanyGeneralInformations) {

			entityCache.removeResult(
				CreativeCompanyGeneralInformationImpl.class,
				creativeCompanyGeneralInformation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CreativeCompanyGeneralInformationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CreativeCompanyGeneralInformationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CreativeCompanyGeneralInformationModelImpl
			creativeCompanyGeneralInformationModelImpl) {

		Object[] args = new Object[] {
			creativeCompanyGeneralInformationModelImpl.
				getCreativeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCreativeById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCreativeById, args,
			creativeCompanyGeneralInformationModelImpl);
	}

	/**
	 * Creates a new creative company general information with the primary key. Does not add the creative company general information to the database.
	 *
	 * @param creativeCompanyGeneralInfoId the primary key for the new creative company general information
	 * @return the new creative company general information
	 */
	@Override
	public CreativeCompanyGeneralInformation create(
		long creativeCompanyGeneralInfoId) {

		CreativeCompanyGeneralInformation creativeCompanyGeneralInformation =
			new CreativeCompanyGeneralInformationImpl();

		creativeCompanyGeneralInformation.setNew(true);
		creativeCompanyGeneralInformation.setPrimaryKey(
			creativeCompanyGeneralInfoId);

		creativeCompanyGeneralInformation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return creativeCompanyGeneralInformation;
	}

	/**
	 * Removes the creative company general information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeCompanyGeneralInfoId the primary key of the creative company general information
	 * @return the creative company general information that was removed
	 * @throws NoSuchCreativeCompanyGeneralInformationException if a creative company general information with the primary key could not be found
	 */
	@Override
	public CreativeCompanyGeneralInformation remove(
			long creativeCompanyGeneralInfoId)
		throws NoSuchCreativeCompanyGeneralInformationException {

		return remove((Serializable)creativeCompanyGeneralInfoId);
	}

	/**
	 * Removes the creative company general information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the creative company general information
	 * @return the creative company general information that was removed
	 * @throws NoSuchCreativeCompanyGeneralInformationException if a creative company general information with the primary key could not be found
	 */
	@Override
	public CreativeCompanyGeneralInformation remove(Serializable primaryKey)
		throws NoSuchCreativeCompanyGeneralInformationException {

		Session session = null;

		try {
			session = openSession();

			CreativeCompanyGeneralInformation
				creativeCompanyGeneralInformation =
					(CreativeCompanyGeneralInformation)session.get(
						CreativeCompanyGeneralInformationImpl.class,
						primaryKey);

			if (creativeCompanyGeneralInformation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreativeCompanyGeneralInformationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(creativeCompanyGeneralInformation);
		}
		catch (NoSuchCreativeCompanyGeneralInformationException
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
	protected CreativeCompanyGeneralInformation removeImpl(
		CreativeCompanyGeneralInformation creativeCompanyGeneralInformation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(creativeCompanyGeneralInformation)) {
				creativeCompanyGeneralInformation =
					(CreativeCompanyGeneralInformation)session.get(
						CreativeCompanyGeneralInformationImpl.class,
						creativeCompanyGeneralInformation.getPrimaryKeyObj());
			}

			if (creativeCompanyGeneralInformation != null) {
				session.delete(creativeCompanyGeneralInformation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (creativeCompanyGeneralInformation != null) {
			clearCache(creativeCompanyGeneralInformation);
		}

		return creativeCompanyGeneralInformation;
	}

	@Override
	public CreativeCompanyGeneralInformation updateImpl(
		CreativeCompanyGeneralInformation creativeCompanyGeneralInformation) {

		boolean isNew = creativeCompanyGeneralInformation.isNew();

		if (!(creativeCompanyGeneralInformation instanceof
				CreativeCompanyGeneralInformationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					creativeCompanyGeneralInformation.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					creativeCompanyGeneralInformation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in creativeCompanyGeneralInformation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CreativeCompanyGeneralInformation implementation " +
					creativeCompanyGeneralInformation.getClass());
		}

		CreativeCompanyGeneralInformationModelImpl
			creativeCompanyGeneralInformationModelImpl =
				(CreativeCompanyGeneralInformationModelImpl)
					creativeCompanyGeneralInformation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(creativeCompanyGeneralInformation.getCreateDate() == null)) {

			if (serviceContext == null) {
				creativeCompanyGeneralInformation.setCreateDate(date);
			}
			else {
				creativeCompanyGeneralInformation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!creativeCompanyGeneralInformationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				creativeCompanyGeneralInformation.setModifiedDate(date);
			}
			else {
				creativeCompanyGeneralInformation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(creativeCompanyGeneralInformation);
			}
			else {
				creativeCompanyGeneralInformation =
					(CreativeCompanyGeneralInformation)session.merge(
						creativeCompanyGeneralInformation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CreativeCompanyGeneralInformationImpl.class,
			creativeCompanyGeneralInformationModelImpl, false, true);

		cacheUniqueFindersCache(creativeCompanyGeneralInformationModelImpl);

		if (isNew) {
			creativeCompanyGeneralInformation.setNew(false);
		}

		creativeCompanyGeneralInformation.resetOriginalValues();

		return creativeCompanyGeneralInformation;
	}

	/**
	 * Returns the creative company general information with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the creative company general information
	 * @return the creative company general information
	 * @throws NoSuchCreativeCompanyGeneralInformationException if a creative company general information with the primary key could not be found
	 */
	@Override
	public CreativeCompanyGeneralInformation findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCreativeCompanyGeneralInformationException {

		CreativeCompanyGeneralInformation creativeCompanyGeneralInformation =
			fetchByPrimaryKey(primaryKey);

		if (creativeCompanyGeneralInformation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreativeCompanyGeneralInformationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return creativeCompanyGeneralInformation;
	}

	/**
	 * Returns the creative company general information with the primary key or throws a <code>NoSuchCreativeCompanyGeneralInformationException</code> if it could not be found.
	 *
	 * @param creativeCompanyGeneralInfoId the primary key of the creative company general information
	 * @return the creative company general information
	 * @throws NoSuchCreativeCompanyGeneralInformationException if a creative company general information with the primary key could not be found
	 */
	@Override
	public CreativeCompanyGeneralInformation findByPrimaryKey(
			long creativeCompanyGeneralInfoId)
		throws NoSuchCreativeCompanyGeneralInformationException {

		return findByPrimaryKey((Serializable)creativeCompanyGeneralInfoId);
	}

	/**
	 * Returns the creative company general information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeCompanyGeneralInfoId the primary key of the creative company general information
	 * @return the creative company general information, or <code>null</code> if a creative company general information with the primary key could not be found
	 */
	@Override
	public CreativeCompanyGeneralInformation fetchByPrimaryKey(
		long creativeCompanyGeneralInfoId) {

		return fetchByPrimaryKey((Serializable)creativeCompanyGeneralInfoId);
	}

	/**
	 * Returns all the creative company general informations.
	 *
	 * @return the creative company general informations
	 */
	@Override
	public List<CreativeCompanyGeneralInformation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative company general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company general informations
	 * @param end the upper bound of the range of creative company general informations (not inclusive)
	 * @return the range of creative company general informations
	 */
	@Override
	public List<CreativeCompanyGeneralInformation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative company general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company general informations
	 * @param end the upper bound of the range of creative company general informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative company general informations
	 */
	@Override
	public List<CreativeCompanyGeneralInformation> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyGeneralInformation>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative company general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company general informations
	 * @param end the upper bound of the range of creative company general informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative company general informations
	 */
	@Override
	public List<CreativeCompanyGeneralInformation> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyGeneralInformation> orderByComparator,
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

		List<CreativeCompanyGeneralInformation> list = null;

		if (useFinderCache) {
			list =
				(List<CreativeCompanyGeneralInformation>)finderCache.getResult(
					finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CREATIVECOMPANYGENERALINFORMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREATIVECOMPANYGENERALINFORMATION;

				sql = sql.concat(
					CreativeCompanyGeneralInformationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CreativeCompanyGeneralInformation>)QueryUtil.list(
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
	 * Removes all the creative company general informations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CreativeCompanyGeneralInformation
				creativeCompanyGeneralInformation : findAll()) {

			remove(creativeCompanyGeneralInformation);
		}
	}

	/**
	 * Returns the number of creative company general informations.
	 *
	 * @return the number of creative company general informations
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
					_SQL_COUNT_CREATIVECOMPANYGENERALINFORMATION);

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
		return "creativeCompanyGeneralInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREATIVECOMPANYGENERALINFORMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CreativeCompanyGeneralInformationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the creative company general information persistence.
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

		CreativeCompanyGeneralInformationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CreativeCompanyGeneralInformationUtil.setPersistence(null);

		entityCache.removeCache(
			CreativeCompanyGeneralInformationImpl.class.getName());
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

	private static final String _SQL_SELECT_CREATIVECOMPANYGENERALINFORMATION =
		"SELECT creativeCompanyGeneralInformation FROM CreativeCompanyGeneralInformation creativeCompanyGeneralInformation";

	private static final String
		_SQL_SELECT_CREATIVECOMPANYGENERALINFORMATION_WHERE =
			"SELECT creativeCompanyGeneralInformation FROM CreativeCompanyGeneralInformation creativeCompanyGeneralInformation WHERE ";

	private static final String _SQL_COUNT_CREATIVECOMPANYGENERALINFORMATION =
		"SELECT COUNT(creativeCompanyGeneralInformation) FROM CreativeCompanyGeneralInformation creativeCompanyGeneralInformation";

	private static final String
		_SQL_COUNT_CREATIVECOMPANYGENERALINFORMATION_WHERE =
			"SELECT COUNT(creativeCompanyGeneralInformation) FROM CreativeCompanyGeneralInformation creativeCompanyGeneralInformation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"creativeCompanyGeneralInformation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CreativeCompanyGeneralInformation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CreativeCompanyGeneralInformation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CreativeCompanyGeneralInformationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}