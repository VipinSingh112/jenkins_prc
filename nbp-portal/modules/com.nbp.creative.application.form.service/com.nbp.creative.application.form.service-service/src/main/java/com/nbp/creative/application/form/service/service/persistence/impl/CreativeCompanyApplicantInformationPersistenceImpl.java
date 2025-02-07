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

import com.nbp.creative.application.form.service.exception.NoSuchCreativeCompanyApplicantInformationException;
import com.nbp.creative.application.form.service.model.CreativeCompanyApplicantInformation;
import com.nbp.creative.application.form.service.model.CreativeCompanyApplicantInformationTable;
import com.nbp.creative.application.form.service.model.impl.CreativeCompanyApplicantInformationImpl;
import com.nbp.creative.application.form.service.model.impl.CreativeCompanyApplicantInformationModelImpl;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyApplicantInformationPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyApplicantInformationUtil;
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
 * The persistence implementation for the creative company applicant information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CreativeCompanyApplicantInformationPersistence.class)
public class CreativeCompanyApplicantInformationPersistenceImpl
	extends BasePersistenceImpl<CreativeCompanyApplicantInformation>
	implements CreativeCompanyApplicantInformationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CreativeCompanyApplicantInformationUtil</code> to access the creative company applicant information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CreativeCompanyApplicantInformationImpl.class.getName();

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
	 * Returns the creative company applicant information where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeCompanyApplicantInformationException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company applicant information
	 * @throws NoSuchCreativeCompanyApplicantInformationException if a matching creative company applicant information could not be found
	 */
	@Override
	public CreativeCompanyApplicantInformation findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyApplicantInformationException {

		CreativeCompanyApplicantInformation
			creativeCompanyApplicantInformation = fetchBygetCreativeById(
				CreativeApplicationId);

		if (creativeCompanyApplicantInformation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("CreativeApplicationId=");
			sb.append(CreativeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCreativeCompanyApplicantInformationException(
				sb.toString());
		}

		return creativeCompanyApplicantInformation;
	}

	/**
	 * Returns the creative company applicant information where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company applicant information, or <code>null</code> if a matching creative company applicant information could not be found
	 */
	@Override
	public CreativeCompanyApplicantInformation fetchBygetCreativeById(
		long CreativeApplicationId) {

		return fetchBygetCreativeById(CreativeApplicationId, true);
	}

	/**
	 * Returns the creative company applicant information where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative company applicant information, or <code>null</code> if a matching creative company applicant information could not be found
	 */
	@Override
	public CreativeCompanyApplicantInformation fetchBygetCreativeById(
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

		if (result instanceof CreativeCompanyApplicantInformation) {
			CreativeCompanyApplicantInformation
				creativeCompanyApplicantInformation =
					(CreativeCompanyApplicantInformation)result;

			if (CreativeApplicationId !=
					creativeCompanyApplicantInformation.
						getCreativeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CREATIVECOMPANYAPPLICANTINFORMATION_WHERE);

			sb.append(_FINDER_COLUMN_GETCREATIVEBYID_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

				List<CreativeCompanyApplicantInformation> list = query.list();

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
								"CreativeCompanyApplicantInformationPersistenceImpl.fetchBygetCreativeById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeCompanyApplicantInformation
						creativeCompanyApplicantInformation = list.get(0);

					result = creativeCompanyApplicantInformation;

					cacheResult(creativeCompanyApplicantInformation);
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
			return (CreativeCompanyApplicantInformation)result;
		}
	}

	/**
	 * Removes the creative company applicant information where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative company applicant information that was removed
	 */
	@Override
	public CreativeCompanyApplicantInformation removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyApplicantInformationException {

		CreativeCompanyApplicantInformation
			creativeCompanyApplicantInformation = findBygetCreativeById(
				CreativeApplicationId);

		return remove(creativeCompanyApplicantInformation);
	}

	/**
	 * Returns the number of creative company applicant informations where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative company applicant informations
	 */
	@Override
	public int countBygetCreativeById(long CreativeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCreativeById;

		Object[] finderArgs = new Object[] {CreativeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVECOMPANYAPPLICANTINFORMATION_WHERE);

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
			"creativeCompanyApplicantInformation.CreativeApplicationId = ?";

	public CreativeCompanyApplicantInformationPersistenceImpl() {
		setModelClass(CreativeCompanyApplicantInformation.class);

		setModelImplClass(CreativeCompanyApplicantInformationImpl.class);
		setModelPKClass(long.class);

		setTable(CreativeCompanyApplicantInformationTable.INSTANCE);
	}

	/**
	 * Caches the creative company applicant information in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyApplicantInformation the creative company applicant information
	 */
	@Override
	public void cacheResult(
		CreativeCompanyApplicantInformation
			creativeCompanyApplicantInformation) {

		entityCache.putResult(
			CreativeCompanyApplicantInformationImpl.class,
			creativeCompanyApplicantInformation.getPrimaryKey(),
			creativeCompanyApplicantInformation);

		finderCache.putResult(
			_finderPathFetchBygetCreativeById,
			new Object[] {
				creativeCompanyApplicantInformation.getCreativeApplicationId()
			},
			creativeCompanyApplicantInformation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the creative company applicant informations in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyApplicantInformations the creative company applicant informations
	 */
	@Override
	public void cacheResult(
		List<CreativeCompanyApplicantInformation>
			creativeCompanyApplicantInformations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (creativeCompanyApplicantInformations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CreativeCompanyApplicantInformation
				creativeCompanyApplicantInformation :
					creativeCompanyApplicantInformations) {

			if (entityCache.getResult(
					CreativeCompanyApplicantInformationImpl.class,
					creativeCompanyApplicantInformation.getPrimaryKey()) ==
						null) {

				cacheResult(creativeCompanyApplicantInformation);
			}
		}
	}

	/**
	 * Clears the cache for all creative company applicant informations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CreativeCompanyApplicantInformationImpl.class);

		finderCache.clearCache(CreativeCompanyApplicantInformationImpl.class);
	}

	/**
	 * Clears the cache for the creative company applicant information.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CreativeCompanyApplicantInformation
			creativeCompanyApplicantInformation) {

		entityCache.removeResult(
			CreativeCompanyApplicantInformationImpl.class,
			creativeCompanyApplicantInformation);
	}

	@Override
	public void clearCache(
		List<CreativeCompanyApplicantInformation>
			creativeCompanyApplicantInformations) {

		for (CreativeCompanyApplicantInformation
				creativeCompanyApplicantInformation :
					creativeCompanyApplicantInformations) {

			entityCache.removeResult(
				CreativeCompanyApplicantInformationImpl.class,
				creativeCompanyApplicantInformation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CreativeCompanyApplicantInformationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CreativeCompanyApplicantInformationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CreativeCompanyApplicantInformationModelImpl
			creativeCompanyApplicantInformationModelImpl) {

		Object[] args = new Object[] {
			creativeCompanyApplicantInformationModelImpl.
				getCreativeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCreativeById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCreativeById, args,
			creativeCompanyApplicantInformationModelImpl);
	}

	/**
	 * Creates a new creative company applicant information with the primary key. Does not add the creative company applicant information to the database.
	 *
	 * @param creativeCompanyApplicantInfoId the primary key for the new creative company applicant information
	 * @return the new creative company applicant information
	 */
	@Override
	public CreativeCompanyApplicantInformation create(
		long creativeCompanyApplicantInfoId) {

		CreativeCompanyApplicantInformation
			creativeCompanyApplicantInformation =
				new CreativeCompanyApplicantInformationImpl();

		creativeCompanyApplicantInformation.setNew(true);
		creativeCompanyApplicantInformation.setPrimaryKey(
			creativeCompanyApplicantInfoId);

		creativeCompanyApplicantInformation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return creativeCompanyApplicantInformation;
	}

	/**
	 * Removes the creative company applicant information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeCompanyApplicantInfoId the primary key of the creative company applicant information
	 * @return the creative company applicant information that was removed
	 * @throws NoSuchCreativeCompanyApplicantInformationException if a creative company applicant information with the primary key could not be found
	 */
	@Override
	public CreativeCompanyApplicantInformation remove(
			long creativeCompanyApplicantInfoId)
		throws NoSuchCreativeCompanyApplicantInformationException {

		return remove((Serializable)creativeCompanyApplicantInfoId);
	}

	/**
	 * Removes the creative company applicant information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the creative company applicant information
	 * @return the creative company applicant information that was removed
	 * @throws NoSuchCreativeCompanyApplicantInformationException if a creative company applicant information with the primary key could not be found
	 */
	@Override
	public CreativeCompanyApplicantInformation remove(Serializable primaryKey)
		throws NoSuchCreativeCompanyApplicantInformationException {

		Session session = null;

		try {
			session = openSession();

			CreativeCompanyApplicantInformation
				creativeCompanyApplicantInformation =
					(CreativeCompanyApplicantInformation)session.get(
						CreativeCompanyApplicantInformationImpl.class,
						primaryKey);

			if (creativeCompanyApplicantInformation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreativeCompanyApplicantInformationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(creativeCompanyApplicantInformation);
		}
		catch (NoSuchCreativeCompanyApplicantInformationException
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
	protected CreativeCompanyApplicantInformation removeImpl(
		CreativeCompanyApplicantInformation
			creativeCompanyApplicantInformation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(creativeCompanyApplicantInformation)) {
				creativeCompanyApplicantInformation =
					(CreativeCompanyApplicantInformation)session.get(
						CreativeCompanyApplicantInformationImpl.class,
						creativeCompanyApplicantInformation.getPrimaryKeyObj());
			}

			if (creativeCompanyApplicantInformation != null) {
				session.delete(creativeCompanyApplicantInformation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (creativeCompanyApplicantInformation != null) {
			clearCache(creativeCompanyApplicantInformation);
		}

		return creativeCompanyApplicantInformation;
	}

	@Override
	public CreativeCompanyApplicantInformation updateImpl(
		CreativeCompanyApplicantInformation
			creativeCompanyApplicantInformation) {

		boolean isNew = creativeCompanyApplicantInformation.isNew();

		if (!(creativeCompanyApplicantInformation instanceof
				CreativeCompanyApplicantInformationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					creativeCompanyApplicantInformation.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					creativeCompanyApplicantInformation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in creativeCompanyApplicantInformation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CreativeCompanyApplicantInformation implementation " +
					creativeCompanyApplicantInformation.getClass());
		}

		CreativeCompanyApplicantInformationModelImpl
			creativeCompanyApplicantInformationModelImpl =
				(CreativeCompanyApplicantInformationModelImpl)
					creativeCompanyApplicantInformation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(creativeCompanyApplicantInformation.getCreateDate() == null)) {

			if (serviceContext == null) {
				creativeCompanyApplicantInformation.setCreateDate(date);
			}
			else {
				creativeCompanyApplicantInformation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!creativeCompanyApplicantInformationModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				creativeCompanyApplicantInformation.setModifiedDate(date);
			}
			else {
				creativeCompanyApplicantInformation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(creativeCompanyApplicantInformation);
			}
			else {
				creativeCompanyApplicantInformation =
					(CreativeCompanyApplicantInformation)session.merge(
						creativeCompanyApplicantInformation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CreativeCompanyApplicantInformationImpl.class,
			creativeCompanyApplicantInformationModelImpl, false, true);

		cacheUniqueFindersCache(creativeCompanyApplicantInformationModelImpl);

		if (isNew) {
			creativeCompanyApplicantInformation.setNew(false);
		}

		creativeCompanyApplicantInformation.resetOriginalValues();

		return creativeCompanyApplicantInformation;
	}

	/**
	 * Returns the creative company applicant information with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the creative company applicant information
	 * @return the creative company applicant information
	 * @throws NoSuchCreativeCompanyApplicantInformationException if a creative company applicant information with the primary key could not be found
	 */
	@Override
	public CreativeCompanyApplicantInformation findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCreativeCompanyApplicantInformationException {

		CreativeCompanyApplicantInformation
			creativeCompanyApplicantInformation = fetchByPrimaryKey(primaryKey);

		if (creativeCompanyApplicantInformation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreativeCompanyApplicantInformationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return creativeCompanyApplicantInformation;
	}

	/**
	 * Returns the creative company applicant information with the primary key or throws a <code>NoSuchCreativeCompanyApplicantInformationException</code> if it could not be found.
	 *
	 * @param creativeCompanyApplicantInfoId the primary key of the creative company applicant information
	 * @return the creative company applicant information
	 * @throws NoSuchCreativeCompanyApplicantInformationException if a creative company applicant information with the primary key could not be found
	 */
	@Override
	public CreativeCompanyApplicantInformation findByPrimaryKey(
			long creativeCompanyApplicantInfoId)
		throws NoSuchCreativeCompanyApplicantInformationException {

		return findByPrimaryKey((Serializable)creativeCompanyApplicantInfoId);
	}

	/**
	 * Returns the creative company applicant information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeCompanyApplicantInfoId the primary key of the creative company applicant information
	 * @return the creative company applicant information, or <code>null</code> if a creative company applicant information with the primary key could not be found
	 */
	@Override
	public CreativeCompanyApplicantInformation fetchByPrimaryKey(
		long creativeCompanyApplicantInfoId) {

		return fetchByPrimaryKey((Serializable)creativeCompanyApplicantInfoId);
	}

	/**
	 * Returns all the creative company applicant informations.
	 *
	 * @return the creative company applicant informations
	 */
	@Override
	public List<CreativeCompanyApplicantInformation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative company applicant informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyApplicantInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company applicant informations
	 * @param end the upper bound of the range of creative company applicant informations (not inclusive)
	 * @return the range of creative company applicant informations
	 */
	@Override
	public List<CreativeCompanyApplicantInformation> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative company applicant informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyApplicantInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company applicant informations
	 * @param end the upper bound of the range of creative company applicant informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative company applicant informations
	 */
	@Override
	public List<CreativeCompanyApplicantInformation> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyApplicantInformation>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative company applicant informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyApplicantInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company applicant informations
	 * @param end the upper bound of the range of creative company applicant informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative company applicant informations
	 */
	@Override
	public List<CreativeCompanyApplicantInformation> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyApplicantInformation>
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

		List<CreativeCompanyApplicantInformation> list = null;

		if (useFinderCache) {
			list =
				(List<CreativeCompanyApplicantInformation>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CREATIVECOMPANYAPPLICANTINFORMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREATIVECOMPANYAPPLICANTINFORMATION;

				sql = sql.concat(
					CreativeCompanyApplicantInformationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<CreativeCompanyApplicantInformation>)QueryUtil.list(
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
	 * Removes all the creative company applicant informations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CreativeCompanyApplicantInformation
				creativeCompanyApplicantInformation : findAll()) {

			remove(creativeCompanyApplicantInformation);
		}
	}

	/**
	 * Returns the number of creative company applicant informations.
	 *
	 * @return the number of creative company applicant informations
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
					_SQL_COUNT_CREATIVECOMPANYAPPLICANTINFORMATION);

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
		return "creativeCompanyApplicantInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREATIVECOMPANYAPPLICANTINFORMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CreativeCompanyApplicantInformationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the creative company applicant information persistence.
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

		CreativeCompanyApplicantInformationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CreativeCompanyApplicantInformationUtil.setPersistence(null);

		entityCache.removeCache(
			CreativeCompanyApplicantInformationImpl.class.getName());
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
		_SQL_SELECT_CREATIVECOMPANYAPPLICANTINFORMATION =
			"SELECT creativeCompanyApplicantInformation FROM CreativeCompanyApplicantInformation creativeCompanyApplicantInformation";

	private static final String
		_SQL_SELECT_CREATIVECOMPANYAPPLICANTINFORMATION_WHERE =
			"SELECT creativeCompanyApplicantInformation FROM CreativeCompanyApplicantInformation creativeCompanyApplicantInformation WHERE ";

	private static final String _SQL_COUNT_CREATIVECOMPANYAPPLICANTINFORMATION =
		"SELECT COUNT(creativeCompanyApplicantInformation) FROM CreativeCompanyApplicantInformation creativeCompanyApplicantInformation";

	private static final String
		_SQL_COUNT_CREATIVECOMPANYAPPLICANTINFORMATION_WHERE =
			"SELECT COUNT(creativeCompanyApplicantInformation) FROM CreativeCompanyApplicantInformation creativeCompanyApplicantInformation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"creativeCompanyApplicantInformation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CreativeCompanyApplicantInformation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CreativeCompanyApplicantInformation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CreativeCompanyApplicantInformationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}