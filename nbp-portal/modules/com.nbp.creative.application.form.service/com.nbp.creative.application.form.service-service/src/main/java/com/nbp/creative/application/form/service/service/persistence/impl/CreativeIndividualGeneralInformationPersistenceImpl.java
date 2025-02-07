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

import com.nbp.creative.application.form.service.exception.NoSuchCreativeIndividualGeneralInformationException;
import com.nbp.creative.application.form.service.model.CreativeIndividualGeneralInformation;
import com.nbp.creative.application.form.service.model.CreativeIndividualGeneralInformationTable;
import com.nbp.creative.application.form.service.model.impl.CreativeIndividualGeneralInformationImpl;
import com.nbp.creative.application.form.service.model.impl.CreativeIndividualGeneralInformationModelImpl;
import com.nbp.creative.application.form.service.service.persistence.CreativeIndividualGeneralInformationPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeIndividualGeneralInformationUtil;
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
 * The persistence implementation for the creative individual general information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CreativeIndividualGeneralInformationPersistence.class)
public class CreativeIndividualGeneralInformationPersistenceImpl
	extends BasePersistenceImpl<CreativeIndividualGeneralInformation>
	implements CreativeIndividualGeneralInformationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CreativeIndividualGeneralInformationUtil</code> to access the creative individual general information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CreativeIndividualGeneralInformationImpl.class.getName();

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
	 * Returns the creative individual general information where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeIndividualGeneralInformationException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative individual general information
	 * @throws NoSuchCreativeIndividualGeneralInformationException if a matching creative individual general information could not be found
	 */
	@Override
	public CreativeIndividualGeneralInformation findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeIndividualGeneralInformationException {

		CreativeIndividualGeneralInformation
			creativeIndividualGeneralInformation = fetchBygetCreativeById(
				CreativeApplicationId);

		if (creativeIndividualGeneralInformation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("CreativeApplicationId=");
			sb.append(CreativeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCreativeIndividualGeneralInformationException(
				sb.toString());
		}

		return creativeIndividualGeneralInformation;
	}

	/**
	 * Returns the creative individual general information where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative individual general information, or <code>null</code> if a matching creative individual general information could not be found
	 */
	@Override
	public CreativeIndividualGeneralInformation fetchBygetCreativeById(
		long CreativeApplicationId) {

		return fetchBygetCreativeById(CreativeApplicationId, true);
	}

	/**
	 * Returns the creative individual general information where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative individual general information, or <code>null</code> if a matching creative individual general information could not be found
	 */
	@Override
	public CreativeIndividualGeneralInformation fetchBygetCreativeById(
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

		if (result instanceof CreativeIndividualGeneralInformation) {
			CreativeIndividualGeneralInformation
				creativeIndividualGeneralInformation =
					(CreativeIndividualGeneralInformation)result;

			if (CreativeApplicationId !=
					creativeIndividualGeneralInformation.
						getCreativeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CREATIVEINDIVIDUALGENERALINFORMATION_WHERE);

			sb.append(_FINDER_COLUMN_GETCREATIVEBYID_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

				List<CreativeIndividualGeneralInformation> list = query.list();

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
								"CreativeIndividualGeneralInformationPersistenceImpl.fetchBygetCreativeById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeIndividualGeneralInformation
						creativeIndividualGeneralInformation = list.get(0);

					result = creativeIndividualGeneralInformation;

					cacheResult(creativeIndividualGeneralInformation);
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
			return (CreativeIndividualGeneralInformation)result;
		}
	}

	/**
	 * Removes the creative individual general information where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative individual general information that was removed
	 */
	@Override
	public CreativeIndividualGeneralInformation removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeIndividualGeneralInformationException {

		CreativeIndividualGeneralInformation
			creativeIndividualGeneralInformation = findBygetCreativeById(
				CreativeApplicationId);

		return remove(creativeIndividualGeneralInformation);
	}

	/**
	 * Returns the number of creative individual general informations where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative individual general informations
	 */
	@Override
	public int countBygetCreativeById(long CreativeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCreativeById;

		Object[] finderArgs = new Object[] {CreativeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEINDIVIDUALGENERALINFORMATION_WHERE);

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
			"creativeIndividualGeneralInformation.CreativeApplicationId = ?";

	public CreativeIndividualGeneralInformationPersistenceImpl() {
		setModelClass(CreativeIndividualGeneralInformation.class);

		setModelImplClass(CreativeIndividualGeneralInformationImpl.class);
		setModelPKClass(long.class);

		setTable(CreativeIndividualGeneralInformationTable.INSTANCE);
	}

	/**
	 * Caches the creative individual general information in the entity cache if it is enabled.
	 *
	 * @param creativeIndividualGeneralInformation the creative individual general information
	 */
	@Override
	public void cacheResult(
		CreativeIndividualGeneralInformation
			creativeIndividualGeneralInformation) {

		entityCache.putResult(
			CreativeIndividualGeneralInformationImpl.class,
			creativeIndividualGeneralInformation.getPrimaryKey(),
			creativeIndividualGeneralInformation);

		finderCache.putResult(
			_finderPathFetchBygetCreativeById,
			new Object[] {
				creativeIndividualGeneralInformation.getCreativeApplicationId()
			},
			creativeIndividualGeneralInformation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the creative individual general informations in the entity cache if it is enabled.
	 *
	 * @param creativeIndividualGeneralInformations the creative individual general informations
	 */
	@Override
	public void cacheResult(
		List<CreativeIndividualGeneralInformation>
			creativeIndividualGeneralInformations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (creativeIndividualGeneralInformations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CreativeIndividualGeneralInformation
				creativeIndividualGeneralInformation :
					creativeIndividualGeneralInformations) {

			if (entityCache.getResult(
					CreativeIndividualGeneralInformationImpl.class,
					creativeIndividualGeneralInformation.getPrimaryKey()) ==
						null) {

				cacheResult(creativeIndividualGeneralInformation);
			}
		}
	}

	/**
	 * Clears the cache for all creative individual general informations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CreativeIndividualGeneralInformationImpl.class);

		finderCache.clearCache(CreativeIndividualGeneralInformationImpl.class);
	}

	/**
	 * Clears the cache for the creative individual general information.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CreativeIndividualGeneralInformation
			creativeIndividualGeneralInformation) {

		entityCache.removeResult(
			CreativeIndividualGeneralInformationImpl.class,
			creativeIndividualGeneralInformation);
	}

	@Override
	public void clearCache(
		List<CreativeIndividualGeneralInformation>
			creativeIndividualGeneralInformations) {

		for (CreativeIndividualGeneralInformation
				creativeIndividualGeneralInformation :
					creativeIndividualGeneralInformations) {

			entityCache.removeResult(
				CreativeIndividualGeneralInformationImpl.class,
				creativeIndividualGeneralInformation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CreativeIndividualGeneralInformationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CreativeIndividualGeneralInformationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CreativeIndividualGeneralInformationModelImpl
			creativeIndividualGeneralInformationModelImpl) {

		Object[] args = new Object[] {
			creativeIndividualGeneralInformationModelImpl.
				getCreativeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCreativeById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCreativeById, args,
			creativeIndividualGeneralInformationModelImpl);
	}

	/**
	 * Creates a new creative individual general information with the primary key. Does not add the creative individual general information to the database.
	 *
	 * @param creativeIndiGeneralInfoId the primary key for the new creative individual general information
	 * @return the new creative individual general information
	 */
	@Override
	public CreativeIndividualGeneralInformation create(
		long creativeIndiGeneralInfoId) {

		CreativeIndividualGeneralInformation
			creativeIndividualGeneralInformation =
				new CreativeIndividualGeneralInformationImpl();

		creativeIndividualGeneralInformation.setNew(true);
		creativeIndividualGeneralInformation.setPrimaryKey(
			creativeIndiGeneralInfoId);

		creativeIndividualGeneralInformation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return creativeIndividualGeneralInformation;
	}

	/**
	 * Removes the creative individual general information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeIndiGeneralInfoId the primary key of the creative individual general information
	 * @return the creative individual general information that was removed
	 * @throws NoSuchCreativeIndividualGeneralInformationException if a creative individual general information with the primary key could not be found
	 */
	@Override
	public CreativeIndividualGeneralInformation remove(
			long creativeIndiGeneralInfoId)
		throws NoSuchCreativeIndividualGeneralInformationException {

		return remove((Serializable)creativeIndiGeneralInfoId);
	}

	/**
	 * Removes the creative individual general information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the creative individual general information
	 * @return the creative individual general information that was removed
	 * @throws NoSuchCreativeIndividualGeneralInformationException if a creative individual general information with the primary key could not be found
	 */
	@Override
	public CreativeIndividualGeneralInformation remove(Serializable primaryKey)
		throws NoSuchCreativeIndividualGeneralInformationException {

		Session session = null;

		try {
			session = openSession();

			CreativeIndividualGeneralInformation
				creativeIndividualGeneralInformation =
					(CreativeIndividualGeneralInformation)session.get(
						CreativeIndividualGeneralInformationImpl.class,
						primaryKey);

			if (creativeIndividualGeneralInformation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreativeIndividualGeneralInformationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(creativeIndividualGeneralInformation);
		}
		catch (NoSuchCreativeIndividualGeneralInformationException
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
	protected CreativeIndividualGeneralInformation removeImpl(
		CreativeIndividualGeneralInformation
			creativeIndividualGeneralInformation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(creativeIndividualGeneralInformation)) {
				creativeIndividualGeneralInformation =
					(CreativeIndividualGeneralInformation)session.get(
						CreativeIndividualGeneralInformationImpl.class,
						creativeIndividualGeneralInformation.
							getPrimaryKeyObj());
			}

			if (creativeIndividualGeneralInformation != null) {
				session.delete(creativeIndividualGeneralInformation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (creativeIndividualGeneralInformation != null) {
			clearCache(creativeIndividualGeneralInformation);
		}

		return creativeIndividualGeneralInformation;
	}

	@Override
	public CreativeIndividualGeneralInformation updateImpl(
		CreativeIndividualGeneralInformation
			creativeIndividualGeneralInformation) {

		boolean isNew = creativeIndividualGeneralInformation.isNew();

		if (!(creativeIndividualGeneralInformation instanceof
				CreativeIndividualGeneralInformationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					creativeIndividualGeneralInformation.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					creativeIndividualGeneralInformation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in creativeIndividualGeneralInformation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CreativeIndividualGeneralInformation implementation " +
					creativeIndividualGeneralInformation.getClass());
		}

		CreativeIndividualGeneralInformationModelImpl
			creativeIndividualGeneralInformationModelImpl =
				(CreativeIndividualGeneralInformationModelImpl)
					creativeIndividualGeneralInformation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(creativeIndividualGeneralInformation.getCreateDate() == null)) {

			if (serviceContext == null) {
				creativeIndividualGeneralInformation.setCreateDate(date);
			}
			else {
				creativeIndividualGeneralInformation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!creativeIndividualGeneralInformationModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				creativeIndividualGeneralInformation.setModifiedDate(date);
			}
			else {
				creativeIndividualGeneralInformation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(creativeIndividualGeneralInformation);
			}
			else {
				creativeIndividualGeneralInformation =
					(CreativeIndividualGeneralInformation)session.merge(
						creativeIndividualGeneralInformation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CreativeIndividualGeneralInformationImpl.class,
			creativeIndividualGeneralInformationModelImpl, false, true);

		cacheUniqueFindersCache(creativeIndividualGeneralInformationModelImpl);

		if (isNew) {
			creativeIndividualGeneralInformation.setNew(false);
		}

		creativeIndividualGeneralInformation.resetOriginalValues();

		return creativeIndividualGeneralInformation;
	}

	/**
	 * Returns the creative individual general information with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the creative individual general information
	 * @return the creative individual general information
	 * @throws NoSuchCreativeIndividualGeneralInformationException if a creative individual general information with the primary key could not be found
	 */
	@Override
	public CreativeIndividualGeneralInformation findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCreativeIndividualGeneralInformationException {

		CreativeIndividualGeneralInformation
			creativeIndividualGeneralInformation = fetchByPrimaryKey(
				primaryKey);

		if (creativeIndividualGeneralInformation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreativeIndividualGeneralInformationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return creativeIndividualGeneralInformation;
	}

	/**
	 * Returns the creative individual general information with the primary key or throws a <code>NoSuchCreativeIndividualGeneralInformationException</code> if it could not be found.
	 *
	 * @param creativeIndiGeneralInfoId the primary key of the creative individual general information
	 * @return the creative individual general information
	 * @throws NoSuchCreativeIndividualGeneralInformationException if a creative individual general information with the primary key could not be found
	 */
	@Override
	public CreativeIndividualGeneralInformation findByPrimaryKey(
			long creativeIndiGeneralInfoId)
		throws NoSuchCreativeIndividualGeneralInformationException {

		return findByPrimaryKey((Serializable)creativeIndiGeneralInfoId);
	}

	/**
	 * Returns the creative individual general information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeIndiGeneralInfoId the primary key of the creative individual general information
	 * @return the creative individual general information, or <code>null</code> if a creative individual general information with the primary key could not be found
	 */
	@Override
	public CreativeIndividualGeneralInformation fetchByPrimaryKey(
		long creativeIndiGeneralInfoId) {

		return fetchByPrimaryKey((Serializable)creativeIndiGeneralInfoId);
	}

	/**
	 * Returns all the creative individual general informations.
	 *
	 * @return the creative individual general informations
	 */
	@Override
	public List<CreativeIndividualGeneralInformation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative individual general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual general informations
	 * @param end the upper bound of the range of creative individual general informations (not inclusive)
	 * @return the range of creative individual general informations
	 */
	@Override
	public List<CreativeIndividualGeneralInformation> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative individual general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual general informations
	 * @param end the upper bound of the range of creative individual general informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative individual general informations
	 */
	@Override
	public List<CreativeIndividualGeneralInformation> findAll(
		int start, int end,
		OrderByComparator<CreativeIndividualGeneralInformation>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative individual general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual general informations
	 * @param end the upper bound of the range of creative individual general informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative individual general informations
	 */
	@Override
	public List<CreativeIndividualGeneralInformation> findAll(
		int start, int end,
		OrderByComparator<CreativeIndividualGeneralInformation>
			orderByComparator,
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

		List<CreativeIndividualGeneralInformation> list = null;

		if (useFinderCache) {
			list =
				(List<CreativeIndividualGeneralInformation>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CREATIVEINDIVIDUALGENERALINFORMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREATIVEINDIVIDUALGENERALINFORMATION;

				sql = sql.concat(
					CreativeIndividualGeneralInformationModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<CreativeIndividualGeneralInformation>)QueryUtil.list(
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
	 * Removes all the creative individual general informations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CreativeIndividualGeneralInformation
				creativeIndividualGeneralInformation : findAll()) {

			remove(creativeIndividualGeneralInformation);
		}
	}

	/**
	 * Returns the number of creative individual general informations.
	 *
	 * @return the number of creative individual general informations
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
					_SQL_COUNT_CREATIVEINDIVIDUALGENERALINFORMATION);

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
		return "creativeIndiGeneralInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREATIVEINDIVIDUALGENERALINFORMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CreativeIndividualGeneralInformationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the creative individual general information persistence.
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

		CreativeIndividualGeneralInformationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CreativeIndividualGeneralInformationUtil.setPersistence(null);

		entityCache.removeCache(
			CreativeIndividualGeneralInformationImpl.class.getName());
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

	private static final String
		_SQL_SELECT_CREATIVEINDIVIDUALGENERALINFORMATION =
			"SELECT creativeIndividualGeneralInformation FROM CreativeIndividualGeneralInformation creativeIndividualGeneralInformation";

	private static final String
		_SQL_SELECT_CREATIVEINDIVIDUALGENERALINFORMATION_WHERE =
			"SELECT creativeIndividualGeneralInformation FROM CreativeIndividualGeneralInformation creativeIndividualGeneralInformation WHERE ";

	private static final String
		_SQL_COUNT_CREATIVEINDIVIDUALGENERALINFORMATION =
			"SELECT COUNT(creativeIndividualGeneralInformation) FROM CreativeIndividualGeneralInformation creativeIndividualGeneralInformation";

	private static final String
		_SQL_COUNT_CREATIVEINDIVIDUALGENERALINFORMATION_WHERE =
			"SELECT COUNT(creativeIndividualGeneralInformation) FROM CreativeIndividualGeneralInformation creativeIndividualGeneralInformation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"creativeIndividualGeneralInformation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CreativeIndividualGeneralInformation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CreativeIndividualGeneralInformation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CreativeIndividualGeneralInformationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}