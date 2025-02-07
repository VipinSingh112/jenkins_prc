/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence.impl;

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

import com.nbp.hsra.application.service.exception.NoSuchPurposeOfPropLicenceException;
import com.nbp.hsra.application.service.model.PurposeOfPropLicence;
import com.nbp.hsra.application.service.model.PurposeOfPropLicenceTable;
import com.nbp.hsra.application.service.model.impl.PurposeOfPropLicenceImpl;
import com.nbp.hsra.application.service.model.impl.PurposeOfPropLicenceModelImpl;
import com.nbp.hsra.application.service.service.persistence.PurposeOfPropLicencePersistence;
import com.nbp.hsra.application.service.service.persistence.PurposeOfPropLicenceUtil;
import com.nbp.hsra.application.service.service.persistence.impl.constants.HSRA_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the purpose of prop licence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PurposeOfPropLicencePersistence.class)
public class PurposeOfPropLicencePersistenceImpl
	extends BasePersistenceImpl<PurposeOfPropLicence>
	implements PurposeOfPropLicencePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PurposeOfPropLicenceUtil</code> to access the purpose of prop licence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PurposeOfPropLicenceImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHsraById;
	private FinderPath _finderPathCountBygetHsraById;

	/**
	 * Returns the purpose of prop licence where hsraApplicationId = &#63; or throws a <code>NoSuchPurposeOfPropLicenceException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching purpose of prop licence
	 * @throws NoSuchPurposeOfPropLicenceException if a matching purpose of prop licence could not be found
	 */
	@Override
	public PurposeOfPropLicence findBygetHsraById(long hsraApplicationId)
		throws NoSuchPurposeOfPropLicenceException {

		PurposeOfPropLicence purposeOfPropLicence = fetchBygetHsraById(
			hsraApplicationId);

		if (purposeOfPropLicence == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPurposeOfPropLicenceException(sb.toString());
		}

		return purposeOfPropLicence;
	}

	/**
	 * Returns the purpose of prop licence where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching purpose of prop licence, or <code>null</code> if a matching purpose of prop licence could not be found
	 */
	@Override
	public PurposeOfPropLicence fetchBygetHsraById(long hsraApplicationId) {
		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the purpose of prop licence where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching purpose of prop licence, or <code>null</code> if a matching purpose of prop licence could not be found
	 */
	@Override
	public PurposeOfPropLicence fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {hsraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHsraById, finderArgs, this);
		}

		if (result instanceof PurposeOfPropLicence) {
			PurposeOfPropLicence purposeOfPropLicence =
				(PurposeOfPropLicence)result;

			if (hsraApplicationId !=
					purposeOfPropLicence.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PURPOSEOFPROPLICENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<PurposeOfPropLicence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHsraById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {hsraApplicationId};
							}

							_log.warn(
								"PurposeOfPropLicencePersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PurposeOfPropLicence purposeOfPropLicence = list.get(0);

					result = purposeOfPropLicence;

					cacheResult(purposeOfPropLicence);
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
			return (PurposeOfPropLicence)result;
		}
	}

	/**
	 * Removes the purpose of prop licence where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the purpose of prop licence that was removed
	 */
	@Override
	public PurposeOfPropLicence removeBygetHsraById(long hsraApplicationId)
		throws NoSuchPurposeOfPropLicenceException {

		PurposeOfPropLicence purposeOfPropLicence = findBygetHsraById(
			hsraApplicationId);

		return remove(purposeOfPropLicence);
	}

	/**
	 * Returns the number of purpose of prop licences where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching purpose of prop licences
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PURPOSEOFPROPLICENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

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

	private static final String _FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2 =
		"purposeOfPropLicence.hsraApplicationId = ?";

	public PurposeOfPropLicencePersistenceImpl() {
		setModelClass(PurposeOfPropLicence.class);

		setModelImplClass(PurposeOfPropLicenceImpl.class);
		setModelPKClass(long.class);

		setTable(PurposeOfPropLicenceTable.INSTANCE);
	}

	/**
	 * Caches the purpose of prop licence in the entity cache if it is enabled.
	 *
	 * @param purposeOfPropLicence the purpose of prop licence
	 */
	@Override
	public void cacheResult(PurposeOfPropLicence purposeOfPropLicence) {
		entityCache.putResult(
			PurposeOfPropLicenceImpl.class,
			purposeOfPropLicence.getPrimaryKey(), purposeOfPropLicence);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {purposeOfPropLicence.getHsraApplicationId()},
			purposeOfPropLicence);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the purpose of prop licences in the entity cache if it is enabled.
	 *
	 * @param purposeOfPropLicences the purpose of prop licences
	 */
	@Override
	public void cacheResult(List<PurposeOfPropLicence> purposeOfPropLicences) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (purposeOfPropLicences.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PurposeOfPropLicence purposeOfPropLicence :
				purposeOfPropLicences) {

			if (entityCache.getResult(
					PurposeOfPropLicenceImpl.class,
					purposeOfPropLicence.getPrimaryKey()) == null) {

				cacheResult(purposeOfPropLicence);
			}
		}
	}

	/**
	 * Clears the cache for all purpose of prop licences.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PurposeOfPropLicenceImpl.class);

		finderCache.clearCache(PurposeOfPropLicenceImpl.class);
	}

	/**
	 * Clears the cache for the purpose of prop licence.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PurposeOfPropLicence purposeOfPropLicence) {
		entityCache.removeResult(
			PurposeOfPropLicenceImpl.class, purposeOfPropLicence);
	}

	@Override
	public void clearCache(List<PurposeOfPropLicence> purposeOfPropLicences) {
		for (PurposeOfPropLicence purposeOfPropLicence :
				purposeOfPropLicences) {

			entityCache.removeResult(
				PurposeOfPropLicenceImpl.class, purposeOfPropLicence);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PurposeOfPropLicenceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				PurposeOfPropLicenceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		PurposeOfPropLicenceModelImpl purposeOfPropLicenceModelImpl) {

		Object[] args = new Object[] {
			purposeOfPropLicenceModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args, purposeOfPropLicenceModelImpl);
	}

	/**
	 * Creates a new purpose of prop licence with the primary key. Does not add the purpose of prop licence to the database.
	 *
	 * @param purposeOfPropLicenceId the primary key for the new purpose of prop licence
	 * @return the new purpose of prop licence
	 */
	@Override
	public PurposeOfPropLicence create(long purposeOfPropLicenceId) {
		PurposeOfPropLicence purposeOfPropLicence =
			new PurposeOfPropLicenceImpl();

		purposeOfPropLicence.setNew(true);
		purposeOfPropLicence.setPrimaryKey(purposeOfPropLicenceId);

		purposeOfPropLicence.setCompanyId(CompanyThreadLocal.getCompanyId());

		return purposeOfPropLicence;
	}

	/**
	 * Removes the purpose of prop licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param purposeOfPropLicenceId the primary key of the purpose of prop licence
	 * @return the purpose of prop licence that was removed
	 * @throws NoSuchPurposeOfPropLicenceException if a purpose of prop licence with the primary key could not be found
	 */
	@Override
	public PurposeOfPropLicence remove(long purposeOfPropLicenceId)
		throws NoSuchPurposeOfPropLicenceException {

		return remove((Serializable)purposeOfPropLicenceId);
	}

	/**
	 * Removes the purpose of prop licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the purpose of prop licence
	 * @return the purpose of prop licence that was removed
	 * @throws NoSuchPurposeOfPropLicenceException if a purpose of prop licence with the primary key could not be found
	 */
	@Override
	public PurposeOfPropLicence remove(Serializable primaryKey)
		throws NoSuchPurposeOfPropLicenceException {

		Session session = null;

		try {
			session = openSession();

			PurposeOfPropLicence purposeOfPropLicence =
				(PurposeOfPropLicence)session.get(
					PurposeOfPropLicenceImpl.class, primaryKey);

			if (purposeOfPropLicence == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPurposeOfPropLicenceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(purposeOfPropLicence);
		}
		catch (NoSuchPurposeOfPropLicenceException noSuchEntityException) {
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
	protected PurposeOfPropLicence removeImpl(
		PurposeOfPropLicence purposeOfPropLicence) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(purposeOfPropLicence)) {
				purposeOfPropLicence = (PurposeOfPropLicence)session.get(
					PurposeOfPropLicenceImpl.class,
					purposeOfPropLicence.getPrimaryKeyObj());
			}

			if (purposeOfPropLicence != null) {
				session.delete(purposeOfPropLicence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (purposeOfPropLicence != null) {
			clearCache(purposeOfPropLicence);
		}

		return purposeOfPropLicence;
	}

	@Override
	public PurposeOfPropLicence updateImpl(
		PurposeOfPropLicence purposeOfPropLicence) {

		boolean isNew = purposeOfPropLicence.isNew();

		if (!(purposeOfPropLicence instanceof PurposeOfPropLicenceModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(purposeOfPropLicence.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					purposeOfPropLicence);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in purposeOfPropLicence proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PurposeOfPropLicence implementation " +
					purposeOfPropLicence.getClass());
		}

		PurposeOfPropLicenceModelImpl purposeOfPropLicenceModelImpl =
			(PurposeOfPropLicenceModelImpl)purposeOfPropLicence;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (purposeOfPropLicence.getCreateDate() == null)) {
			if (serviceContext == null) {
				purposeOfPropLicence.setCreateDate(date);
			}
			else {
				purposeOfPropLicence.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!purposeOfPropLicenceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				purposeOfPropLicence.setModifiedDate(date);
			}
			else {
				purposeOfPropLicence.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(purposeOfPropLicence);
			}
			else {
				purposeOfPropLicence = (PurposeOfPropLicence)session.merge(
					purposeOfPropLicence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PurposeOfPropLicenceImpl.class, purposeOfPropLicenceModelImpl,
			false, true);

		cacheUniqueFindersCache(purposeOfPropLicenceModelImpl);

		if (isNew) {
			purposeOfPropLicence.setNew(false);
		}

		purposeOfPropLicence.resetOriginalValues();

		return purposeOfPropLicence;
	}

	/**
	 * Returns the purpose of prop licence with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the purpose of prop licence
	 * @return the purpose of prop licence
	 * @throws NoSuchPurposeOfPropLicenceException if a purpose of prop licence with the primary key could not be found
	 */
	@Override
	public PurposeOfPropLicence findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPurposeOfPropLicenceException {

		PurposeOfPropLicence purposeOfPropLicence = fetchByPrimaryKey(
			primaryKey);

		if (purposeOfPropLicence == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPurposeOfPropLicenceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return purposeOfPropLicence;
	}

	/**
	 * Returns the purpose of prop licence with the primary key or throws a <code>NoSuchPurposeOfPropLicenceException</code> if it could not be found.
	 *
	 * @param purposeOfPropLicenceId the primary key of the purpose of prop licence
	 * @return the purpose of prop licence
	 * @throws NoSuchPurposeOfPropLicenceException if a purpose of prop licence with the primary key could not be found
	 */
	@Override
	public PurposeOfPropLicence findByPrimaryKey(long purposeOfPropLicenceId)
		throws NoSuchPurposeOfPropLicenceException {

		return findByPrimaryKey((Serializable)purposeOfPropLicenceId);
	}

	/**
	 * Returns the purpose of prop licence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param purposeOfPropLicenceId the primary key of the purpose of prop licence
	 * @return the purpose of prop licence, or <code>null</code> if a purpose of prop licence with the primary key could not be found
	 */
	@Override
	public PurposeOfPropLicence fetchByPrimaryKey(long purposeOfPropLicenceId) {
		return fetchByPrimaryKey((Serializable)purposeOfPropLicenceId);
	}

	/**
	 * Returns all the purpose of prop licences.
	 *
	 * @return the purpose of prop licences
	 */
	@Override
	public List<PurposeOfPropLicence> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the purpose of prop licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurposeOfPropLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of purpose of prop licences
	 * @param end the upper bound of the range of purpose of prop licences (not inclusive)
	 * @return the range of purpose of prop licences
	 */
	@Override
	public List<PurposeOfPropLicence> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the purpose of prop licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurposeOfPropLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of purpose of prop licences
	 * @param end the upper bound of the range of purpose of prop licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of purpose of prop licences
	 */
	@Override
	public List<PurposeOfPropLicence> findAll(
		int start, int end,
		OrderByComparator<PurposeOfPropLicence> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the purpose of prop licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PurposeOfPropLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of purpose of prop licences
	 * @param end the upper bound of the range of purpose of prop licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of purpose of prop licences
	 */
	@Override
	public List<PurposeOfPropLicence> findAll(
		int start, int end,
		OrderByComparator<PurposeOfPropLicence> orderByComparator,
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

		List<PurposeOfPropLicence> list = null;

		if (useFinderCache) {
			list = (List<PurposeOfPropLicence>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PURPOSEOFPROPLICENCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PURPOSEOFPROPLICENCE;

				sql = sql.concat(PurposeOfPropLicenceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PurposeOfPropLicence>)QueryUtil.list(
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
	 * Removes all the purpose of prop licences from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PurposeOfPropLicence purposeOfPropLicence : findAll()) {
			remove(purposeOfPropLicence);
		}
	}

	/**
	 * Returns the number of purpose of prop licences.
	 *
	 * @return the number of purpose of prop licences
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
					_SQL_COUNT_PURPOSEOFPROPLICENCE);

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
		return "purposeOfPropLicenceId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PURPOSEOFPROPLICENCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PurposeOfPropLicenceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the purpose of prop licence persistence.
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

		_finderPathFetchBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		PurposeOfPropLicenceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		PurposeOfPropLicenceUtil.setPersistence(null);

		entityCache.removeCache(PurposeOfPropLicenceImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PURPOSEOFPROPLICENCE =
		"SELECT purposeOfPropLicence FROM PurposeOfPropLicence purposeOfPropLicence";

	private static final String _SQL_SELECT_PURPOSEOFPROPLICENCE_WHERE =
		"SELECT purposeOfPropLicence FROM PurposeOfPropLicence purposeOfPropLicence WHERE ";

	private static final String _SQL_COUNT_PURPOSEOFPROPLICENCE =
		"SELECT COUNT(purposeOfPropLicence) FROM PurposeOfPropLicence purposeOfPropLicence";

	private static final String _SQL_COUNT_PURPOSEOFPROPLICENCE_WHERE =
		"SELECT COUNT(purposeOfPropLicence) FROM PurposeOfPropLicence purposeOfPropLicence WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"purposeOfPropLicence.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PurposeOfPropLicence exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PurposeOfPropLicence exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PurposeOfPropLicencePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}