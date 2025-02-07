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

import com.nbp.hsra.application.service.exception.NoSuchFitPropDeclareApplicantException;
import com.nbp.hsra.application.service.model.FitPropDeclareApplicant;
import com.nbp.hsra.application.service.model.FitPropDeclareApplicantTable;
import com.nbp.hsra.application.service.model.impl.FitPropDeclareApplicantImpl;
import com.nbp.hsra.application.service.model.impl.FitPropDeclareApplicantModelImpl;
import com.nbp.hsra.application.service.service.persistence.FitPropDeclareApplicantPersistence;
import com.nbp.hsra.application.service.service.persistence.FitPropDeclareApplicantUtil;
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
 * The persistence implementation for the fit prop declare applicant service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FitPropDeclareApplicantPersistence.class)
public class FitPropDeclareApplicantPersistenceImpl
	extends BasePersistenceImpl<FitPropDeclareApplicant>
	implements FitPropDeclareApplicantPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FitPropDeclareApplicantUtil</code> to access the fit prop declare applicant persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FitPropDeclareApplicantImpl.class.getName();

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
	 * Returns the fit prop declare applicant where hsraApplicationId = &#63; or throws a <code>NoSuchFitPropDeclareApplicantException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop declare applicant
	 * @throws NoSuchFitPropDeclareApplicantException if a matching fit prop declare applicant could not be found
	 */
	@Override
	public FitPropDeclareApplicant findBygetHsraById(long hsraApplicationId)
		throws NoSuchFitPropDeclareApplicantException {

		FitPropDeclareApplicant fitPropDeclareApplicant = fetchBygetHsraById(
			hsraApplicationId);

		if (fitPropDeclareApplicant == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFitPropDeclareApplicantException(sb.toString());
		}

		return fitPropDeclareApplicant;
	}

	/**
	 * Returns the fit prop declare applicant where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop declare applicant, or <code>null</code> if a matching fit prop declare applicant could not be found
	 */
	@Override
	public FitPropDeclareApplicant fetchBygetHsraById(long hsraApplicationId) {
		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the fit prop declare applicant where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fit prop declare applicant, or <code>null</code> if a matching fit prop declare applicant could not be found
	 */
	@Override
	public FitPropDeclareApplicant fetchBygetHsraById(
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

		if (result instanceof FitPropDeclareApplicant) {
			FitPropDeclareApplicant fitPropDeclareApplicant =
				(FitPropDeclareApplicant)result;

			if (hsraApplicationId !=
					fitPropDeclareApplicant.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FITPROPDECLAREAPPLICANT_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<FitPropDeclareApplicant> list = query.list();

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
								"FitPropDeclareApplicantPersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FitPropDeclareApplicant fitPropDeclareApplicant = list.get(
						0);

					result = fitPropDeclareApplicant;

					cacheResult(fitPropDeclareApplicant);
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
			return (FitPropDeclareApplicant)result;
		}
	}

	/**
	 * Removes the fit prop declare applicant where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the fit prop declare applicant that was removed
	 */
	@Override
	public FitPropDeclareApplicant removeBygetHsraById(long hsraApplicationId)
		throws NoSuchFitPropDeclareApplicantException {

		FitPropDeclareApplicant fitPropDeclareApplicant = findBygetHsraById(
			hsraApplicationId);

		return remove(fitPropDeclareApplicant);
	}

	/**
	 * Returns the number of fit prop declare applicants where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching fit prop declare applicants
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FITPROPDECLAREAPPLICANT_WHERE);

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
		"fitPropDeclareApplicant.hsraApplicationId = ?";

	public FitPropDeclareApplicantPersistenceImpl() {
		setModelClass(FitPropDeclareApplicant.class);

		setModelImplClass(FitPropDeclareApplicantImpl.class);
		setModelPKClass(long.class);

		setTable(FitPropDeclareApplicantTable.INSTANCE);
	}

	/**
	 * Caches the fit prop declare applicant in the entity cache if it is enabled.
	 *
	 * @param fitPropDeclareApplicant the fit prop declare applicant
	 */
	@Override
	public void cacheResult(FitPropDeclareApplicant fitPropDeclareApplicant) {
		entityCache.putResult(
			FitPropDeclareApplicantImpl.class,
			fitPropDeclareApplicant.getPrimaryKey(), fitPropDeclareApplicant);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {fitPropDeclareApplicant.getHsraApplicationId()},
			fitPropDeclareApplicant);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fit prop declare applicants in the entity cache if it is enabled.
	 *
	 * @param fitPropDeclareApplicants the fit prop declare applicants
	 */
	@Override
	public void cacheResult(
		List<FitPropDeclareApplicant> fitPropDeclareApplicants) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fitPropDeclareApplicants.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FitPropDeclareApplicant fitPropDeclareApplicant :
				fitPropDeclareApplicants) {

			if (entityCache.getResult(
					FitPropDeclareApplicantImpl.class,
					fitPropDeclareApplicant.getPrimaryKey()) == null) {

				cacheResult(fitPropDeclareApplicant);
			}
		}
	}

	/**
	 * Clears the cache for all fit prop declare applicants.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FitPropDeclareApplicantImpl.class);

		finderCache.clearCache(FitPropDeclareApplicantImpl.class);
	}

	/**
	 * Clears the cache for the fit prop declare applicant.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FitPropDeclareApplicant fitPropDeclareApplicant) {
		entityCache.removeResult(
			FitPropDeclareApplicantImpl.class, fitPropDeclareApplicant);
	}

	@Override
	public void clearCache(
		List<FitPropDeclareApplicant> fitPropDeclareApplicants) {

		for (FitPropDeclareApplicant fitPropDeclareApplicant :
				fitPropDeclareApplicants) {

			entityCache.removeResult(
				FitPropDeclareApplicantImpl.class, fitPropDeclareApplicant);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FitPropDeclareApplicantImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FitPropDeclareApplicantImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FitPropDeclareApplicantModelImpl fitPropDeclareApplicantModelImpl) {

		Object[] args = new Object[] {
			fitPropDeclareApplicantModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args,
			fitPropDeclareApplicantModelImpl);
	}

	/**
	 * Creates a new fit prop declare applicant with the primary key. Does not add the fit prop declare applicant to the database.
	 *
	 * @param fitPropDeclareApplicantId the primary key for the new fit prop declare applicant
	 * @return the new fit prop declare applicant
	 */
	@Override
	public FitPropDeclareApplicant create(long fitPropDeclareApplicantId) {
		FitPropDeclareApplicant fitPropDeclareApplicant =
			new FitPropDeclareApplicantImpl();

		fitPropDeclareApplicant.setNew(true);
		fitPropDeclareApplicant.setPrimaryKey(fitPropDeclareApplicantId);

		fitPropDeclareApplicant.setCompanyId(CompanyThreadLocal.getCompanyId());

		return fitPropDeclareApplicant;
	}

	/**
	 * Removes the fit prop declare applicant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fitPropDeclareApplicantId the primary key of the fit prop declare applicant
	 * @return the fit prop declare applicant that was removed
	 * @throws NoSuchFitPropDeclareApplicantException if a fit prop declare applicant with the primary key could not be found
	 */
	@Override
	public FitPropDeclareApplicant remove(long fitPropDeclareApplicantId)
		throws NoSuchFitPropDeclareApplicantException {

		return remove((Serializable)fitPropDeclareApplicantId);
	}

	/**
	 * Removes the fit prop declare applicant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fit prop declare applicant
	 * @return the fit prop declare applicant that was removed
	 * @throws NoSuchFitPropDeclareApplicantException if a fit prop declare applicant with the primary key could not be found
	 */
	@Override
	public FitPropDeclareApplicant remove(Serializable primaryKey)
		throws NoSuchFitPropDeclareApplicantException {

		Session session = null;

		try {
			session = openSession();

			FitPropDeclareApplicant fitPropDeclareApplicant =
				(FitPropDeclareApplicant)session.get(
					FitPropDeclareApplicantImpl.class, primaryKey);

			if (fitPropDeclareApplicant == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFitPropDeclareApplicantException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fitPropDeclareApplicant);
		}
		catch (NoSuchFitPropDeclareApplicantException noSuchEntityException) {
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
	protected FitPropDeclareApplicant removeImpl(
		FitPropDeclareApplicant fitPropDeclareApplicant) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fitPropDeclareApplicant)) {
				fitPropDeclareApplicant = (FitPropDeclareApplicant)session.get(
					FitPropDeclareApplicantImpl.class,
					fitPropDeclareApplicant.getPrimaryKeyObj());
			}

			if (fitPropDeclareApplicant != null) {
				session.delete(fitPropDeclareApplicant);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fitPropDeclareApplicant != null) {
			clearCache(fitPropDeclareApplicant);
		}

		return fitPropDeclareApplicant;
	}

	@Override
	public FitPropDeclareApplicant updateImpl(
		FitPropDeclareApplicant fitPropDeclareApplicant) {

		boolean isNew = fitPropDeclareApplicant.isNew();

		if (!(fitPropDeclareApplicant instanceof
				FitPropDeclareApplicantModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(fitPropDeclareApplicant.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					fitPropDeclareApplicant);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in fitPropDeclareApplicant proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FitPropDeclareApplicant implementation " +
					fitPropDeclareApplicant.getClass());
		}

		FitPropDeclareApplicantModelImpl fitPropDeclareApplicantModelImpl =
			(FitPropDeclareApplicantModelImpl)fitPropDeclareApplicant;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (fitPropDeclareApplicant.getCreateDate() == null)) {
			if (serviceContext == null) {
				fitPropDeclareApplicant.setCreateDate(date);
			}
			else {
				fitPropDeclareApplicant.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!fitPropDeclareApplicantModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				fitPropDeclareApplicant.setModifiedDate(date);
			}
			else {
				fitPropDeclareApplicant.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fitPropDeclareApplicant);
			}
			else {
				fitPropDeclareApplicant =
					(FitPropDeclareApplicant)session.merge(
						fitPropDeclareApplicant);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FitPropDeclareApplicantImpl.class, fitPropDeclareApplicantModelImpl,
			false, true);

		cacheUniqueFindersCache(fitPropDeclareApplicantModelImpl);

		if (isNew) {
			fitPropDeclareApplicant.setNew(false);
		}

		fitPropDeclareApplicant.resetOriginalValues();

		return fitPropDeclareApplicant;
	}

	/**
	 * Returns the fit prop declare applicant with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fit prop declare applicant
	 * @return the fit prop declare applicant
	 * @throws NoSuchFitPropDeclareApplicantException if a fit prop declare applicant with the primary key could not be found
	 */
	@Override
	public FitPropDeclareApplicant findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFitPropDeclareApplicantException {

		FitPropDeclareApplicant fitPropDeclareApplicant = fetchByPrimaryKey(
			primaryKey);

		if (fitPropDeclareApplicant == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFitPropDeclareApplicantException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fitPropDeclareApplicant;
	}

	/**
	 * Returns the fit prop declare applicant with the primary key or throws a <code>NoSuchFitPropDeclareApplicantException</code> if it could not be found.
	 *
	 * @param fitPropDeclareApplicantId the primary key of the fit prop declare applicant
	 * @return the fit prop declare applicant
	 * @throws NoSuchFitPropDeclareApplicantException if a fit prop declare applicant with the primary key could not be found
	 */
	@Override
	public FitPropDeclareApplicant findByPrimaryKey(
			long fitPropDeclareApplicantId)
		throws NoSuchFitPropDeclareApplicantException {

		return findByPrimaryKey((Serializable)fitPropDeclareApplicantId);
	}

	/**
	 * Returns the fit prop declare applicant with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fitPropDeclareApplicantId the primary key of the fit prop declare applicant
	 * @return the fit prop declare applicant, or <code>null</code> if a fit prop declare applicant with the primary key could not be found
	 */
	@Override
	public FitPropDeclareApplicant fetchByPrimaryKey(
		long fitPropDeclareApplicantId) {

		return fetchByPrimaryKey((Serializable)fitPropDeclareApplicantId);
	}

	/**
	 * Returns all the fit prop declare applicants.
	 *
	 * @return the fit prop declare applicants
	 */
	@Override
	public List<FitPropDeclareApplicant> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fit prop declare applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropDeclareApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop declare applicants
	 * @param end the upper bound of the range of fit prop declare applicants (not inclusive)
	 * @return the range of fit prop declare applicants
	 */
	@Override
	public List<FitPropDeclareApplicant> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fit prop declare applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropDeclareApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop declare applicants
	 * @param end the upper bound of the range of fit prop declare applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fit prop declare applicants
	 */
	@Override
	public List<FitPropDeclareApplicant> findAll(
		int start, int end,
		OrderByComparator<FitPropDeclareApplicant> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fit prop declare applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropDeclareApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop declare applicants
	 * @param end the upper bound of the range of fit prop declare applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fit prop declare applicants
	 */
	@Override
	public List<FitPropDeclareApplicant> findAll(
		int start, int end,
		OrderByComparator<FitPropDeclareApplicant> orderByComparator,
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

		List<FitPropDeclareApplicant> list = null;

		if (useFinderCache) {
			list = (List<FitPropDeclareApplicant>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FITPROPDECLAREAPPLICANT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FITPROPDECLAREAPPLICANT;

				sql = sql.concat(
					FitPropDeclareApplicantModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FitPropDeclareApplicant>)QueryUtil.list(
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
	 * Removes all the fit prop declare applicants from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FitPropDeclareApplicant fitPropDeclareApplicant : findAll()) {
			remove(fitPropDeclareApplicant);
		}
	}

	/**
	 * Returns the number of fit prop declare applicants.
	 *
	 * @return the number of fit prop declare applicants
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
					_SQL_COUNT_FITPROPDECLAREAPPLICANT);

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
		return "fitPropDeclareApplicantId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FITPROPDECLAREAPPLICANT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FitPropDeclareApplicantModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fit prop declare applicant persistence.
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

		FitPropDeclareApplicantUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FitPropDeclareApplicantUtil.setPersistence(null);

		entityCache.removeCache(FitPropDeclareApplicantImpl.class.getName());
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

	private static final String _SQL_SELECT_FITPROPDECLAREAPPLICANT =
		"SELECT fitPropDeclareApplicant FROM FitPropDeclareApplicant fitPropDeclareApplicant";

	private static final String _SQL_SELECT_FITPROPDECLAREAPPLICANT_WHERE =
		"SELECT fitPropDeclareApplicant FROM FitPropDeclareApplicant fitPropDeclareApplicant WHERE ";

	private static final String _SQL_COUNT_FITPROPDECLAREAPPLICANT =
		"SELECT COUNT(fitPropDeclareApplicant) FROM FitPropDeclareApplicant fitPropDeclareApplicant";

	private static final String _SQL_COUNT_FITPROPDECLAREAPPLICANT_WHERE =
		"SELECT COUNT(fitPropDeclareApplicant) FROM FitPropDeclareApplicant fitPropDeclareApplicant WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"fitPropDeclareApplicant.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FitPropDeclareApplicant exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FitPropDeclareApplicant exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FitPropDeclareApplicantPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}