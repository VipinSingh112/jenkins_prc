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

import com.nbp.creative.application.form.service.exception.NoSuchCreativeCompanyDirectorInformationException;
import com.nbp.creative.application.form.service.model.CreativeCompanyDirectorInformation;
import com.nbp.creative.application.form.service.model.CreativeCompanyDirectorInformationTable;
import com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationImpl;
import com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationModelImpl;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyDirectorInformationPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyDirectorInformationUtil;
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
 * The persistence implementation for the creative company director information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CreativeCompanyDirectorInformationPersistence.class)
public class CreativeCompanyDirectorInformationPersistenceImpl
	extends BasePersistenceImpl<CreativeCompanyDirectorInformation>
	implements CreativeCompanyDirectorInformationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CreativeCompanyDirectorInformationUtil</code> to access the creative company director information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CreativeCompanyDirectorInformationImpl.class.getName();

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
	 * Returns the creative company director information where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeCompanyDirectorInformationException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company director information
	 * @throws NoSuchCreativeCompanyDirectorInformationException if a matching creative company director information could not be found
	 */
	@Override
	public CreativeCompanyDirectorInformation findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyDirectorInformationException {

		CreativeCompanyDirectorInformation creativeCompanyDirectorInformation =
			fetchBygetCreativeById(CreativeApplicationId);

		if (creativeCompanyDirectorInformation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("CreativeApplicationId=");
			sb.append(CreativeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCreativeCompanyDirectorInformationException(
				sb.toString());
		}

		return creativeCompanyDirectorInformation;
	}

	/**
	 * Returns the creative company director information where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company director information, or <code>null</code> if a matching creative company director information could not be found
	 */
	@Override
	public CreativeCompanyDirectorInformation fetchBygetCreativeById(
		long CreativeApplicationId) {

		return fetchBygetCreativeById(CreativeApplicationId, true);
	}

	/**
	 * Returns the creative company director information where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative company director information, or <code>null</code> if a matching creative company director information could not be found
	 */
	@Override
	public CreativeCompanyDirectorInformation fetchBygetCreativeById(
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

		if (result instanceof CreativeCompanyDirectorInformation) {
			CreativeCompanyDirectorInformation
				creativeCompanyDirectorInformation =
					(CreativeCompanyDirectorInformation)result;

			if (CreativeApplicationId !=
					creativeCompanyDirectorInformation.
						getCreativeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CREATIVECOMPANYDIRECTORINFORMATION_WHERE);

			sb.append(_FINDER_COLUMN_GETCREATIVEBYID_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

				List<CreativeCompanyDirectorInformation> list = query.list();

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
								"CreativeCompanyDirectorInformationPersistenceImpl.fetchBygetCreativeById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeCompanyDirectorInformation
						creativeCompanyDirectorInformation = list.get(0);

					result = creativeCompanyDirectorInformation;

					cacheResult(creativeCompanyDirectorInformation);
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
			return (CreativeCompanyDirectorInformation)result;
		}
	}

	/**
	 * Removes the creative company director information where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative company director information that was removed
	 */
	@Override
	public CreativeCompanyDirectorInformation removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyDirectorInformationException {

		CreativeCompanyDirectorInformation creativeCompanyDirectorInformation =
			findBygetCreativeById(CreativeApplicationId);

		return remove(creativeCompanyDirectorInformation);
	}

	/**
	 * Returns the number of creative company director informations where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative company director informations
	 */
	@Override
	public int countBygetCreativeById(long CreativeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCreativeById;

		Object[] finderArgs = new Object[] {CreativeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVECOMPANYDIRECTORINFORMATION_WHERE);

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
			"creativeCompanyDirectorInformation.CreativeApplicationId = ?";

	public CreativeCompanyDirectorInformationPersistenceImpl() {
		setModelClass(CreativeCompanyDirectorInformation.class);

		setModelImplClass(CreativeCompanyDirectorInformationImpl.class);
		setModelPKClass(long.class);

		setTable(CreativeCompanyDirectorInformationTable.INSTANCE);
	}

	/**
	 * Caches the creative company director information in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyDirectorInformation the creative company director information
	 */
	@Override
	public void cacheResult(
		CreativeCompanyDirectorInformation creativeCompanyDirectorInformation) {

		entityCache.putResult(
			CreativeCompanyDirectorInformationImpl.class,
			creativeCompanyDirectorInformation.getPrimaryKey(),
			creativeCompanyDirectorInformation);

		finderCache.putResult(
			_finderPathFetchBygetCreativeById,
			new Object[] {
				creativeCompanyDirectorInformation.getCreativeApplicationId()
			},
			creativeCompanyDirectorInformation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the creative company director informations in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyDirectorInformations the creative company director informations
	 */
	@Override
	public void cacheResult(
		List<CreativeCompanyDirectorInformation>
			creativeCompanyDirectorInformations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (creativeCompanyDirectorInformations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CreativeCompanyDirectorInformation
				creativeCompanyDirectorInformation :
					creativeCompanyDirectorInformations) {

			if (entityCache.getResult(
					CreativeCompanyDirectorInformationImpl.class,
					creativeCompanyDirectorInformation.getPrimaryKey()) ==
						null) {

				cacheResult(creativeCompanyDirectorInformation);
			}
		}
	}

	/**
	 * Clears the cache for all creative company director informations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CreativeCompanyDirectorInformationImpl.class);

		finderCache.clearCache(CreativeCompanyDirectorInformationImpl.class);
	}

	/**
	 * Clears the cache for the creative company director information.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CreativeCompanyDirectorInformation creativeCompanyDirectorInformation) {

		entityCache.removeResult(
			CreativeCompanyDirectorInformationImpl.class,
			creativeCompanyDirectorInformation);
	}

	@Override
	public void clearCache(
		List<CreativeCompanyDirectorInformation>
			creativeCompanyDirectorInformations) {

		for (CreativeCompanyDirectorInformation
				creativeCompanyDirectorInformation :
					creativeCompanyDirectorInformations) {

			entityCache.removeResult(
				CreativeCompanyDirectorInformationImpl.class,
				creativeCompanyDirectorInformation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CreativeCompanyDirectorInformationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CreativeCompanyDirectorInformationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CreativeCompanyDirectorInformationModelImpl
			creativeCompanyDirectorInformationModelImpl) {

		Object[] args = new Object[] {
			creativeCompanyDirectorInformationModelImpl.
				getCreativeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCreativeById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCreativeById, args,
			creativeCompanyDirectorInformationModelImpl);
	}

	/**
	 * Creates a new creative company director information with the primary key. Does not add the creative company director information to the database.
	 *
	 * @param creativeComDirectorInfoId the primary key for the new creative company director information
	 * @return the new creative company director information
	 */
	@Override
	public CreativeCompanyDirectorInformation create(
		long creativeComDirectorInfoId) {

		CreativeCompanyDirectorInformation creativeCompanyDirectorInformation =
			new CreativeCompanyDirectorInformationImpl();

		creativeCompanyDirectorInformation.setNew(true);
		creativeCompanyDirectorInformation.setPrimaryKey(
			creativeComDirectorInfoId);

		creativeCompanyDirectorInformation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return creativeCompanyDirectorInformation;
	}

	/**
	 * Removes the creative company director information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeComDirectorInfoId the primary key of the creative company director information
	 * @return the creative company director information that was removed
	 * @throws NoSuchCreativeCompanyDirectorInformationException if a creative company director information with the primary key could not be found
	 */
	@Override
	public CreativeCompanyDirectorInformation remove(
			long creativeComDirectorInfoId)
		throws NoSuchCreativeCompanyDirectorInformationException {

		return remove((Serializable)creativeComDirectorInfoId);
	}

	/**
	 * Removes the creative company director information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the creative company director information
	 * @return the creative company director information that was removed
	 * @throws NoSuchCreativeCompanyDirectorInformationException if a creative company director information with the primary key could not be found
	 */
	@Override
	public CreativeCompanyDirectorInformation remove(Serializable primaryKey)
		throws NoSuchCreativeCompanyDirectorInformationException {

		Session session = null;

		try {
			session = openSession();

			CreativeCompanyDirectorInformation
				creativeCompanyDirectorInformation =
					(CreativeCompanyDirectorInformation)session.get(
						CreativeCompanyDirectorInformationImpl.class,
						primaryKey);

			if (creativeCompanyDirectorInformation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreativeCompanyDirectorInformationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(creativeCompanyDirectorInformation);
		}
		catch (NoSuchCreativeCompanyDirectorInformationException
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
	protected CreativeCompanyDirectorInformation removeImpl(
		CreativeCompanyDirectorInformation creativeCompanyDirectorInformation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(creativeCompanyDirectorInformation)) {
				creativeCompanyDirectorInformation =
					(CreativeCompanyDirectorInformation)session.get(
						CreativeCompanyDirectorInformationImpl.class,
						creativeCompanyDirectorInformation.getPrimaryKeyObj());
			}

			if (creativeCompanyDirectorInformation != null) {
				session.delete(creativeCompanyDirectorInformation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (creativeCompanyDirectorInformation != null) {
			clearCache(creativeCompanyDirectorInformation);
		}

		return creativeCompanyDirectorInformation;
	}

	@Override
	public CreativeCompanyDirectorInformation updateImpl(
		CreativeCompanyDirectorInformation creativeCompanyDirectorInformation) {

		boolean isNew = creativeCompanyDirectorInformation.isNew();

		if (!(creativeCompanyDirectorInformation instanceof
				CreativeCompanyDirectorInformationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					creativeCompanyDirectorInformation.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					creativeCompanyDirectorInformation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in creativeCompanyDirectorInformation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CreativeCompanyDirectorInformation implementation " +
					creativeCompanyDirectorInformation.getClass());
		}

		CreativeCompanyDirectorInformationModelImpl
			creativeCompanyDirectorInformationModelImpl =
				(CreativeCompanyDirectorInformationModelImpl)
					creativeCompanyDirectorInformation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(creativeCompanyDirectorInformation.getCreateDate() == null)) {

			if (serviceContext == null) {
				creativeCompanyDirectorInformation.setCreateDate(date);
			}
			else {
				creativeCompanyDirectorInformation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!creativeCompanyDirectorInformationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				creativeCompanyDirectorInformation.setModifiedDate(date);
			}
			else {
				creativeCompanyDirectorInformation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(creativeCompanyDirectorInformation);
			}
			else {
				creativeCompanyDirectorInformation =
					(CreativeCompanyDirectorInformation)session.merge(
						creativeCompanyDirectorInformation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CreativeCompanyDirectorInformationImpl.class,
			creativeCompanyDirectorInformationModelImpl, false, true);

		cacheUniqueFindersCache(creativeCompanyDirectorInformationModelImpl);

		if (isNew) {
			creativeCompanyDirectorInformation.setNew(false);
		}

		creativeCompanyDirectorInformation.resetOriginalValues();

		return creativeCompanyDirectorInformation;
	}

	/**
	 * Returns the creative company director information with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the creative company director information
	 * @return the creative company director information
	 * @throws NoSuchCreativeCompanyDirectorInformationException if a creative company director information with the primary key could not be found
	 */
	@Override
	public CreativeCompanyDirectorInformation findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCreativeCompanyDirectorInformationException {

		CreativeCompanyDirectorInformation creativeCompanyDirectorInformation =
			fetchByPrimaryKey(primaryKey);

		if (creativeCompanyDirectorInformation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreativeCompanyDirectorInformationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return creativeCompanyDirectorInformation;
	}

	/**
	 * Returns the creative company director information with the primary key or throws a <code>NoSuchCreativeCompanyDirectorInformationException</code> if it could not be found.
	 *
	 * @param creativeComDirectorInfoId the primary key of the creative company director information
	 * @return the creative company director information
	 * @throws NoSuchCreativeCompanyDirectorInformationException if a creative company director information with the primary key could not be found
	 */
	@Override
	public CreativeCompanyDirectorInformation findByPrimaryKey(
			long creativeComDirectorInfoId)
		throws NoSuchCreativeCompanyDirectorInformationException {

		return findByPrimaryKey((Serializable)creativeComDirectorInfoId);
	}

	/**
	 * Returns the creative company director information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeComDirectorInfoId the primary key of the creative company director information
	 * @return the creative company director information, or <code>null</code> if a creative company director information with the primary key could not be found
	 */
	@Override
	public CreativeCompanyDirectorInformation fetchByPrimaryKey(
		long creativeComDirectorInfoId) {

		return fetchByPrimaryKey((Serializable)creativeComDirectorInfoId);
	}

	/**
	 * Returns all the creative company director informations.
	 *
	 * @return the creative company director informations
	 */
	@Override
	public List<CreativeCompanyDirectorInformation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative company director informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDirectorInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company director informations
	 * @param end the upper bound of the range of creative company director informations (not inclusive)
	 * @return the range of creative company director informations
	 */
	@Override
	public List<CreativeCompanyDirectorInformation> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative company director informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDirectorInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company director informations
	 * @param end the upper bound of the range of creative company director informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative company director informations
	 */
	@Override
	public List<CreativeCompanyDirectorInformation> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyDirectorInformation>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative company director informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDirectorInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company director informations
	 * @param end the upper bound of the range of creative company director informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative company director informations
	 */
	@Override
	public List<CreativeCompanyDirectorInformation> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyDirectorInformation> orderByComparator,
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

		List<CreativeCompanyDirectorInformation> list = null;

		if (useFinderCache) {
			list =
				(List<CreativeCompanyDirectorInformation>)finderCache.getResult(
					finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CREATIVECOMPANYDIRECTORINFORMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREATIVECOMPANYDIRECTORINFORMATION;

				sql = sql.concat(
					CreativeCompanyDirectorInformationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CreativeCompanyDirectorInformation>)QueryUtil.list(
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
	 * Removes all the creative company director informations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CreativeCompanyDirectorInformation
				creativeCompanyDirectorInformation : findAll()) {

			remove(creativeCompanyDirectorInformation);
		}
	}

	/**
	 * Returns the number of creative company director informations.
	 *
	 * @return the number of creative company director informations
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
					_SQL_COUNT_CREATIVECOMPANYDIRECTORINFORMATION);

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
		return "creativeComDirectorInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREATIVECOMPANYDIRECTORINFORMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CreativeCompanyDirectorInformationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the creative company director information persistence.
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

		CreativeCompanyDirectorInformationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CreativeCompanyDirectorInformationUtil.setPersistence(null);

		entityCache.removeCache(
			CreativeCompanyDirectorInformationImpl.class.getName());
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

	private static final String _SQL_SELECT_CREATIVECOMPANYDIRECTORINFORMATION =
		"SELECT creativeCompanyDirectorInformation FROM CreativeCompanyDirectorInformation creativeCompanyDirectorInformation";

	private static final String
		_SQL_SELECT_CREATIVECOMPANYDIRECTORINFORMATION_WHERE =
			"SELECT creativeCompanyDirectorInformation FROM CreativeCompanyDirectorInformation creativeCompanyDirectorInformation WHERE ";

	private static final String _SQL_COUNT_CREATIVECOMPANYDIRECTORINFORMATION =
		"SELECT COUNT(creativeCompanyDirectorInformation) FROM CreativeCompanyDirectorInformation creativeCompanyDirectorInformation";

	private static final String
		_SQL_COUNT_CREATIVECOMPANYDIRECTORINFORMATION_WHERE =
			"SELECT COUNT(creativeCompanyDirectorInformation) FROM CreativeCompanyDirectorInformation creativeCompanyDirectorInformation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"creativeCompanyDirectorInformation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CreativeCompanyDirectorInformation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CreativeCompanyDirectorInformation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CreativeCompanyDirectorInformationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}