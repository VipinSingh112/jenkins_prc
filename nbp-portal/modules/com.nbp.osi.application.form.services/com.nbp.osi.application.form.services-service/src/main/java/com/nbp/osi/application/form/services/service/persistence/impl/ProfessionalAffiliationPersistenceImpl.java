/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence.impl;

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

import com.nbp.osi.application.form.services.exception.NoSuchProfessionalAffiliationException;
import com.nbp.osi.application.form.services.model.ProfessionalAffiliation;
import com.nbp.osi.application.form.services.model.ProfessionalAffiliationTable;
import com.nbp.osi.application.form.services.model.impl.ProfessionalAffiliationImpl;
import com.nbp.osi.application.form.services.model.impl.ProfessionalAffiliationModelImpl;
import com.nbp.osi.application.form.services.service.persistence.ProfessionalAffiliationPersistence;
import com.nbp.osi.application.form.services.service.persistence.ProfessionalAffiliationUtil;
import com.nbp.osi.application.form.services.service.persistence.impl.constants.OSIPersistenceConstants;

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
 * The persistence implementation for the professional affiliation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ProfessionalAffiliationPersistence.class)
public class ProfessionalAffiliationPersistenceImpl
	extends BasePersistenceImpl<ProfessionalAffiliation>
	implements ProfessionalAffiliationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ProfessionalAffiliationUtil</code> to access the professional affiliation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ProfessionalAffiliationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOsiById;
	private FinderPath _finderPathCountBygetOsiById;

	/**
	 * Returns the professional affiliation where osiApplicationId = &#63; or throws a <code>NoSuchProfessionalAffiliationException</code> if it could not be found.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching professional affiliation
	 * @throws NoSuchProfessionalAffiliationException if a matching professional affiliation could not be found
	 */
	@Override
	public ProfessionalAffiliation findBygetOsiById(long osiApplicationId)
		throws NoSuchProfessionalAffiliationException {

		ProfessionalAffiliation professionalAffiliation = fetchBygetOsiById(
			osiApplicationId);

		if (professionalAffiliation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiApplicationId=");
			sb.append(osiApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchProfessionalAffiliationException(sb.toString());
		}

		return professionalAffiliation;
	}

	/**
	 * Returns the professional affiliation where osiApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching professional affiliation, or <code>null</code> if a matching professional affiliation could not be found
	 */
	@Override
	public ProfessionalAffiliation fetchBygetOsiById(long osiApplicationId) {
		return fetchBygetOsiById(osiApplicationId, true);
	}

	/**
	 * Returns the professional affiliation where osiApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching professional affiliation, or <code>null</code> if a matching professional affiliation could not be found
	 */
	@Override
	public ProfessionalAffiliation fetchBygetOsiById(
		long osiApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiById, finderArgs, this);
		}

		if (result instanceof ProfessionalAffiliation) {
			ProfessionalAffiliation professionalAffiliation =
				(ProfessionalAffiliation)result;

			if (osiApplicationId !=
					professionalAffiliation.getOsiApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PROFESSIONALAFFILIATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiApplicationId);

				List<ProfessionalAffiliation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {osiApplicationId};
							}

							_log.warn(
								"ProfessionalAffiliationPersistenceImpl.fetchBygetOsiById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ProfessionalAffiliation professionalAffiliation = list.get(
						0);

					result = professionalAffiliation;

					cacheResult(professionalAffiliation);
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
			return (ProfessionalAffiliation)result;
		}
	}

	/**
	 * Removes the professional affiliation where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the professional affiliation that was removed
	 */
	@Override
	public ProfessionalAffiliation removeBygetOsiById(long osiApplicationId)
		throws NoSuchProfessionalAffiliationException {

		ProfessionalAffiliation professionalAffiliation = findBygetOsiById(
			osiApplicationId);

		return remove(professionalAffiliation);
	}

	/**
	 * Returns the number of professional affiliations where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching professional affiliations
	 */
	@Override
	public int countBygetOsiById(long osiApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PROFESSIONALAFFILIATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiApplicationId);

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

	private static final String _FINDER_COLUMN_GETOSIBYID_OSIAPPLICATIONID_2 =
		"professionalAffiliation.osiApplicationId = ?";

	public ProfessionalAffiliationPersistenceImpl() {
		setModelClass(ProfessionalAffiliation.class);

		setModelImplClass(ProfessionalAffiliationImpl.class);
		setModelPKClass(long.class);

		setTable(ProfessionalAffiliationTable.INSTANCE);
	}

	/**
	 * Caches the professional affiliation in the entity cache if it is enabled.
	 *
	 * @param professionalAffiliation the professional affiliation
	 */
	@Override
	public void cacheResult(ProfessionalAffiliation professionalAffiliation) {
		entityCache.putResult(
			ProfessionalAffiliationImpl.class,
			professionalAffiliation.getPrimaryKey(), professionalAffiliation);

		finderCache.putResult(
			_finderPathFetchBygetOsiById,
			new Object[] {professionalAffiliation.getOsiApplicationId()},
			professionalAffiliation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the professional affiliations in the entity cache if it is enabled.
	 *
	 * @param professionalAffiliations the professional affiliations
	 */
	@Override
	public void cacheResult(
		List<ProfessionalAffiliation> professionalAffiliations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (professionalAffiliations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ProfessionalAffiliation professionalAffiliation :
				professionalAffiliations) {

			if (entityCache.getResult(
					ProfessionalAffiliationImpl.class,
					professionalAffiliation.getPrimaryKey()) == null) {

				cacheResult(professionalAffiliation);
			}
		}
	}

	/**
	 * Clears the cache for all professional affiliations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ProfessionalAffiliationImpl.class);

		finderCache.clearCache(ProfessionalAffiliationImpl.class);
	}

	/**
	 * Clears the cache for the professional affiliation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ProfessionalAffiliation professionalAffiliation) {
		entityCache.removeResult(
			ProfessionalAffiliationImpl.class, professionalAffiliation);
	}

	@Override
	public void clearCache(
		List<ProfessionalAffiliation> professionalAffiliations) {

		for (ProfessionalAffiliation professionalAffiliation :
				professionalAffiliations) {

			entityCache.removeResult(
				ProfessionalAffiliationImpl.class, professionalAffiliation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ProfessionalAffiliationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ProfessionalAffiliationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ProfessionalAffiliationModelImpl professionalAffiliationModelImpl) {

		Object[] args = new Object[] {
			professionalAffiliationModelImpl.getOsiApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiById, args,
			professionalAffiliationModelImpl);
	}

	/**
	 * Creates a new professional affiliation with the primary key. Does not add the professional affiliation to the database.
	 *
	 * @param professionalAffiliationId the primary key for the new professional affiliation
	 * @return the new professional affiliation
	 */
	@Override
	public ProfessionalAffiliation create(long professionalAffiliationId) {
		ProfessionalAffiliation professionalAffiliation =
			new ProfessionalAffiliationImpl();

		professionalAffiliation.setNew(true);
		professionalAffiliation.setPrimaryKey(professionalAffiliationId);

		professionalAffiliation.setCompanyId(CompanyThreadLocal.getCompanyId());

		return professionalAffiliation;
	}

	/**
	 * Removes the professional affiliation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param professionalAffiliationId the primary key of the professional affiliation
	 * @return the professional affiliation that was removed
	 * @throws NoSuchProfessionalAffiliationException if a professional affiliation with the primary key could not be found
	 */
	@Override
	public ProfessionalAffiliation remove(long professionalAffiliationId)
		throws NoSuchProfessionalAffiliationException {

		return remove((Serializable)professionalAffiliationId);
	}

	/**
	 * Removes the professional affiliation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the professional affiliation
	 * @return the professional affiliation that was removed
	 * @throws NoSuchProfessionalAffiliationException if a professional affiliation with the primary key could not be found
	 */
	@Override
	public ProfessionalAffiliation remove(Serializable primaryKey)
		throws NoSuchProfessionalAffiliationException {

		Session session = null;

		try {
			session = openSession();

			ProfessionalAffiliation professionalAffiliation =
				(ProfessionalAffiliation)session.get(
					ProfessionalAffiliationImpl.class, primaryKey);

			if (professionalAffiliation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProfessionalAffiliationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(professionalAffiliation);
		}
		catch (NoSuchProfessionalAffiliationException noSuchEntityException) {
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
	protected ProfessionalAffiliation removeImpl(
		ProfessionalAffiliation professionalAffiliation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(professionalAffiliation)) {
				professionalAffiliation = (ProfessionalAffiliation)session.get(
					ProfessionalAffiliationImpl.class,
					professionalAffiliation.getPrimaryKeyObj());
			}

			if (professionalAffiliation != null) {
				session.delete(professionalAffiliation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (professionalAffiliation != null) {
			clearCache(professionalAffiliation);
		}

		return professionalAffiliation;
	}

	@Override
	public ProfessionalAffiliation updateImpl(
		ProfessionalAffiliation professionalAffiliation) {

		boolean isNew = professionalAffiliation.isNew();

		if (!(professionalAffiliation instanceof
				ProfessionalAffiliationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(professionalAffiliation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					professionalAffiliation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in professionalAffiliation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ProfessionalAffiliation implementation " +
					professionalAffiliation.getClass());
		}

		ProfessionalAffiliationModelImpl professionalAffiliationModelImpl =
			(ProfessionalAffiliationModelImpl)professionalAffiliation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (professionalAffiliation.getCreateDate() == null)) {
			if (serviceContext == null) {
				professionalAffiliation.setCreateDate(date);
			}
			else {
				professionalAffiliation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!professionalAffiliationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				professionalAffiliation.setModifiedDate(date);
			}
			else {
				professionalAffiliation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(professionalAffiliation);
			}
			else {
				professionalAffiliation =
					(ProfessionalAffiliation)session.merge(
						professionalAffiliation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ProfessionalAffiliationImpl.class, professionalAffiliationModelImpl,
			false, true);

		cacheUniqueFindersCache(professionalAffiliationModelImpl);

		if (isNew) {
			professionalAffiliation.setNew(false);
		}

		professionalAffiliation.resetOriginalValues();

		return professionalAffiliation;
	}

	/**
	 * Returns the professional affiliation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the professional affiliation
	 * @return the professional affiliation
	 * @throws NoSuchProfessionalAffiliationException if a professional affiliation with the primary key could not be found
	 */
	@Override
	public ProfessionalAffiliation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProfessionalAffiliationException {

		ProfessionalAffiliation professionalAffiliation = fetchByPrimaryKey(
			primaryKey);

		if (professionalAffiliation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProfessionalAffiliationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return professionalAffiliation;
	}

	/**
	 * Returns the professional affiliation with the primary key or throws a <code>NoSuchProfessionalAffiliationException</code> if it could not be found.
	 *
	 * @param professionalAffiliationId the primary key of the professional affiliation
	 * @return the professional affiliation
	 * @throws NoSuchProfessionalAffiliationException if a professional affiliation with the primary key could not be found
	 */
	@Override
	public ProfessionalAffiliation findByPrimaryKey(
			long professionalAffiliationId)
		throws NoSuchProfessionalAffiliationException {

		return findByPrimaryKey((Serializable)professionalAffiliationId);
	}

	/**
	 * Returns the professional affiliation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param professionalAffiliationId the primary key of the professional affiliation
	 * @return the professional affiliation, or <code>null</code> if a professional affiliation with the primary key could not be found
	 */
	@Override
	public ProfessionalAffiliation fetchByPrimaryKey(
		long professionalAffiliationId) {

		return fetchByPrimaryKey((Serializable)professionalAffiliationId);
	}

	/**
	 * Returns all the professional affiliations.
	 *
	 * @return the professional affiliations
	 */
	@Override
	public List<ProfessionalAffiliation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the professional affiliations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfessionalAffiliationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of professional affiliations
	 * @param end the upper bound of the range of professional affiliations (not inclusive)
	 * @return the range of professional affiliations
	 */
	@Override
	public List<ProfessionalAffiliation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the professional affiliations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfessionalAffiliationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of professional affiliations
	 * @param end the upper bound of the range of professional affiliations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of professional affiliations
	 */
	@Override
	public List<ProfessionalAffiliation> findAll(
		int start, int end,
		OrderByComparator<ProfessionalAffiliation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the professional affiliations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProfessionalAffiliationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of professional affiliations
	 * @param end the upper bound of the range of professional affiliations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of professional affiliations
	 */
	@Override
	public List<ProfessionalAffiliation> findAll(
		int start, int end,
		OrderByComparator<ProfessionalAffiliation> orderByComparator,
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

		List<ProfessionalAffiliation> list = null;

		if (useFinderCache) {
			list = (List<ProfessionalAffiliation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PROFESSIONALAFFILIATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PROFESSIONALAFFILIATION;

				sql = sql.concat(
					ProfessionalAffiliationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ProfessionalAffiliation>)QueryUtil.list(
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
	 * Removes all the professional affiliations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ProfessionalAffiliation professionalAffiliation : findAll()) {
			remove(professionalAffiliation);
		}
	}

	/**
	 * Returns the number of professional affiliations.
	 *
	 * @return the number of professional affiliations
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
					_SQL_COUNT_PROFESSIONALAFFILIATION);

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
		return "professionalAffiliationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PROFESSIONALAFFILIATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ProfessionalAffiliationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the professional affiliation persistence.
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

		_finderPathFetchBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiApplicationId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiApplicationId"}, false);

		ProfessionalAffiliationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ProfessionalAffiliationUtil.setPersistence(null);

		entityCache.removeCache(ProfessionalAffiliationImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PROFESSIONALAFFILIATION =
		"SELECT professionalAffiliation FROM ProfessionalAffiliation professionalAffiliation";

	private static final String _SQL_SELECT_PROFESSIONALAFFILIATION_WHERE =
		"SELECT professionalAffiliation FROM ProfessionalAffiliation professionalAffiliation WHERE ";

	private static final String _SQL_COUNT_PROFESSIONALAFFILIATION =
		"SELECT COUNT(professionalAffiliation) FROM ProfessionalAffiliation professionalAffiliation";

	private static final String _SQL_COUNT_PROFESSIONALAFFILIATION_WHERE =
		"SELECT COUNT(professionalAffiliation) FROM ProfessionalAffiliation professionalAffiliation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"professionalAffiliation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ProfessionalAffiliation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ProfessionalAffiliation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ProfessionalAffiliationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}