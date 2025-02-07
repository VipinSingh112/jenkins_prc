/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence.impl;

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

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionWaterEmployeeException;
import com.nbp.jtb.application.form.service.model.AttractionWaterEmployee;
import com.nbp.jtb.application.form.service.model.AttractionWaterEmployeeTable;
import com.nbp.jtb.application.form.service.model.impl.AttractionWaterEmployeeImpl;
import com.nbp.jtb.application.form.service.model.impl.AttractionWaterEmployeeModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AttractionWaterEmployeePersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionWaterEmployeeUtil;
import com.nbp.jtb.application.form.service.service.persistence.impl.constants.JTB_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the attraction water employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AttractionWaterEmployeePersistence.class)
public class AttractionWaterEmployeePersistenceImpl
	extends BasePersistenceImpl<AttractionWaterEmployee>
	implements AttractionWaterEmployeePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AttractionWaterEmployeeUtil</code> to access the attraction water employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AttractionWaterEmployeeImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJTB_ByApplicationId;
	private FinderPath _finderPathCountBygetJTB_ByApplicationId;

	/**
	 * Returns the attraction water employee where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionWaterEmployeeException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water employee
	 * @throws NoSuchAttractionWaterEmployeeException if a matching attraction water employee could not be found
	 */
	@Override
	public AttractionWaterEmployee findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionWaterEmployeeException {

		AttractionWaterEmployee attractionWaterEmployee =
			fetchBygetJTB_ByApplicationId(jtbApplicationId);

		if (attractionWaterEmployee == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAttractionWaterEmployeeException(sb.toString());
		}

		return attractionWaterEmployee;
	}

	/**
	 * Returns the attraction water employee where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water employee, or <code>null</code> if a matching attraction water employee could not be found
	 */
	@Override
	public AttractionWaterEmployee fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the attraction water employee where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction water employee, or <code>null</code> if a matching attraction water employee could not be found
	 */
	@Override
	public AttractionWaterEmployee fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jtbApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJTB_ByApplicationId, finderArgs, this);
		}

		if (result instanceof AttractionWaterEmployee) {
			AttractionWaterEmployee attractionWaterEmployee =
				(AttractionWaterEmployee)result;

			if (jtbApplicationId !=
					attractionWaterEmployee.getJtbApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ATTRACTIONWATEREMPLOYEE_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AttractionWaterEmployee> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJTB_ByApplicationId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {jtbApplicationId};
							}

							_log.warn(
								"AttractionWaterEmployeePersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AttractionWaterEmployee attractionWaterEmployee = list.get(
						0);

					result = attractionWaterEmployee;

					cacheResult(attractionWaterEmployee);
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
			return (AttractionWaterEmployee)result;
		}
	}

	/**
	 * Removes the attraction water employee where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction water employee that was removed
	 */
	@Override
	public AttractionWaterEmployee removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionWaterEmployeeException {

		AttractionWaterEmployee attractionWaterEmployee =
			findBygetJTB_ByApplicationId(jtbApplicationId);

		return remove(attractionWaterEmployee);
	}

	/**
	 * Returns the number of attraction water employees where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction water employees
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ATTRACTIONWATEREMPLOYEE_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

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
		_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2 =
			"attractionWaterEmployee.jtbApplicationId = ?";

	public AttractionWaterEmployeePersistenceImpl() {
		setModelClass(AttractionWaterEmployee.class);

		setModelImplClass(AttractionWaterEmployeeImpl.class);
		setModelPKClass(long.class);

		setTable(AttractionWaterEmployeeTable.INSTANCE);
	}

	/**
	 * Caches the attraction water employee in the entity cache if it is enabled.
	 *
	 * @param attractionWaterEmployee the attraction water employee
	 */
	@Override
	public void cacheResult(AttractionWaterEmployee attractionWaterEmployee) {
		entityCache.putResult(
			AttractionWaterEmployeeImpl.class,
			attractionWaterEmployee.getPrimaryKey(), attractionWaterEmployee);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {attractionWaterEmployee.getJtbApplicationId()},
			attractionWaterEmployee);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the attraction water employees in the entity cache if it is enabled.
	 *
	 * @param attractionWaterEmployees the attraction water employees
	 */
	@Override
	public void cacheResult(
		List<AttractionWaterEmployee> attractionWaterEmployees) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (attractionWaterEmployees.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AttractionWaterEmployee attractionWaterEmployee :
				attractionWaterEmployees) {

			if (entityCache.getResult(
					AttractionWaterEmployeeImpl.class,
					attractionWaterEmployee.getPrimaryKey()) == null) {

				cacheResult(attractionWaterEmployee);
			}
		}
	}

	/**
	 * Clears the cache for all attraction water employees.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AttractionWaterEmployeeImpl.class);

		finderCache.clearCache(AttractionWaterEmployeeImpl.class);
	}

	/**
	 * Clears the cache for the attraction water employee.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AttractionWaterEmployee attractionWaterEmployee) {
		entityCache.removeResult(
			AttractionWaterEmployeeImpl.class, attractionWaterEmployee);
	}

	@Override
	public void clearCache(
		List<AttractionWaterEmployee> attractionWaterEmployees) {

		for (AttractionWaterEmployee attractionWaterEmployee :
				attractionWaterEmployees) {

			entityCache.removeResult(
				AttractionWaterEmployeeImpl.class, attractionWaterEmployee);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AttractionWaterEmployeeImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AttractionWaterEmployeeImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AttractionWaterEmployeeModelImpl attractionWaterEmployeeModelImpl) {

		Object[] args = new Object[] {
			attractionWaterEmployeeModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			attractionWaterEmployeeModelImpl);
	}

	/**
	 * Creates a new attraction water employee with the primary key. Does not add the attraction water employee to the database.
	 *
	 * @param attractionWaterEmpLicId the primary key for the new attraction water employee
	 * @return the new attraction water employee
	 */
	@Override
	public AttractionWaterEmployee create(long attractionWaterEmpLicId) {
		AttractionWaterEmployee attractionWaterEmployee =
			new AttractionWaterEmployeeImpl();

		attractionWaterEmployee.setNew(true);
		attractionWaterEmployee.setPrimaryKey(attractionWaterEmpLicId);

		attractionWaterEmployee.setCompanyId(CompanyThreadLocal.getCompanyId());

		return attractionWaterEmployee;
	}

	/**
	 * Removes the attraction water employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionWaterEmpLicId the primary key of the attraction water employee
	 * @return the attraction water employee that was removed
	 * @throws NoSuchAttractionWaterEmployeeException if a attraction water employee with the primary key could not be found
	 */
	@Override
	public AttractionWaterEmployee remove(long attractionWaterEmpLicId)
		throws NoSuchAttractionWaterEmployeeException {

		return remove((Serializable)attractionWaterEmpLicId);
	}

	/**
	 * Removes the attraction water employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attraction water employee
	 * @return the attraction water employee that was removed
	 * @throws NoSuchAttractionWaterEmployeeException if a attraction water employee with the primary key could not be found
	 */
	@Override
	public AttractionWaterEmployee remove(Serializable primaryKey)
		throws NoSuchAttractionWaterEmployeeException {

		Session session = null;

		try {
			session = openSession();

			AttractionWaterEmployee attractionWaterEmployee =
				(AttractionWaterEmployee)session.get(
					AttractionWaterEmployeeImpl.class, primaryKey);

			if (attractionWaterEmployee == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttractionWaterEmployeeException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(attractionWaterEmployee);
		}
		catch (NoSuchAttractionWaterEmployeeException noSuchEntityException) {
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
	protected AttractionWaterEmployee removeImpl(
		AttractionWaterEmployee attractionWaterEmployee) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attractionWaterEmployee)) {
				attractionWaterEmployee = (AttractionWaterEmployee)session.get(
					AttractionWaterEmployeeImpl.class,
					attractionWaterEmployee.getPrimaryKeyObj());
			}

			if (attractionWaterEmployee != null) {
				session.delete(attractionWaterEmployee);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (attractionWaterEmployee != null) {
			clearCache(attractionWaterEmployee);
		}

		return attractionWaterEmployee;
	}

	@Override
	public AttractionWaterEmployee updateImpl(
		AttractionWaterEmployee attractionWaterEmployee) {

		boolean isNew = attractionWaterEmployee.isNew();

		if (!(attractionWaterEmployee instanceof
				AttractionWaterEmployeeModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(attractionWaterEmployee.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					attractionWaterEmployee);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in attractionWaterEmployee proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AttractionWaterEmployee implementation " +
					attractionWaterEmployee.getClass());
		}

		AttractionWaterEmployeeModelImpl attractionWaterEmployeeModelImpl =
			(AttractionWaterEmployeeModelImpl)attractionWaterEmployee;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (attractionWaterEmployee.getCreateDate() == null)) {
			if (serviceContext == null) {
				attractionWaterEmployee.setCreateDate(date);
			}
			else {
				attractionWaterEmployee.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!attractionWaterEmployeeModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				attractionWaterEmployee.setModifiedDate(date);
			}
			else {
				attractionWaterEmployee.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(attractionWaterEmployee);
			}
			else {
				attractionWaterEmployee =
					(AttractionWaterEmployee)session.merge(
						attractionWaterEmployee);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AttractionWaterEmployeeImpl.class, attractionWaterEmployeeModelImpl,
			false, true);

		cacheUniqueFindersCache(attractionWaterEmployeeModelImpl);

		if (isNew) {
			attractionWaterEmployee.setNew(false);
		}

		attractionWaterEmployee.resetOriginalValues();

		return attractionWaterEmployee;
	}

	/**
	 * Returns the attraction water employee with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attraction water employee
	 * @return the attraction water employee
	 * @throws NoSuchAttractionWaterEmployeeException if a attraction water employee with the primary key could not be found
	 */
	@Override
	public AttractionWaterEmployee findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttractionWaterEmployeeException {

		AttractionWaterEmployee attractionWaterEmployee = fetchByPrimaryKey(
			primaryKey);

		if (attractionWaterEmployee == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttractionWaterEmployeeException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return attractionWaterEmployee;
	}

	/**
	 * Returns the attraction water employee with the primary key or throws a <code>NoSuchAttractionWaterEmployeeException</code> if it could not be found.
	 *
	 * @param attractionWaterEmpLicId the primary key of the attraction water employee
	 * @return the attraction water employee
	 * @throws NoSuchAttractionWaterEmployeeException if a attraction water employee with the primary key could not be found
	 */
	@Override
	public AttractionWaterEmployee findByPrimaryKey(
			long attractionWaterEmpLicId)
		throws NoSuchAttractionWaterEmployeeException {

		return findByPrimaryKey((Serializable)attractionWaterEmpLicId);
	}

	/**
	 * Returns the attraction water employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionWaterEmpLicId the primary key of the attraction water employee
	 * @return the attraction water employee, or <code>null</code> if a attraction water employee with the primary key could not be found
	 */
	@Override
	public AttractionWaterEmployee fetchByPrimaryKey(
		long attractionWaterEmpLicId) {

		return fetchByPrimaryKey((Serializable)attractionWaterEmpLicId);
	}

	/**
	 * Returns all the attraction water employees.
	 *
	 * @return the attraction water employees
	 */
	@Override
	public List<AttractionWaterEmployee> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attraction water employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water employees
	 * @param end the upper bound of the range of attraction water employees (not inclusive)
	 * @return the range of attraction water employees
	 */
	@Override
	public List<AttractionWaterEmployee> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attraction water employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water employees
	 * @param end the upper bound of the range of attraction water employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction water employees
	 */
	@Override
	public List<AttractionWaterEmployee> findAll(
		int start, int end,
		OrderByComparator<AttractionWaterEmployee> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the attraction water employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water employees
	 * @param end the upper bound of the range of attraction water employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction water employees
	 */
	@Override
	public List<AttractionWaterEmployee> findAll(
		int start, int end,
		OrderByComparator<AttractionWaterEmployee> orderByComparator,
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

		List<AttractionWaterEmployee> list = null;

		if (useFinderCache) {
			list = (List<AttractionWaterEmployee>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ATTRACTIONWATEREMPLOYEE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ATTRACTIONWATEREMPLOYEE;

				sql = sql.concat(
					AttractionWaterEmployeeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AttractionWaterEmployee>)QueryUtil.list(
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
	 * Removes all the attraction water employees from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AttractionWaterEmployee attractionWaterEmployee : findAll()) {
			remove(attractionWaterEmployee);
		}
	}

	/**
	 * Returns the number of attraction water employees.
	 *
	 * @return the number of attraction water employees
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
					_SQL_COUNT_ATTRACTIONWATEREMPLOYEE);

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
		return "attractionWaterEmpLicId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ATTRACTIONWATEREMPLOYEE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AttractionWaterEmployeeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the attraction water employee persistence.
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

		_finderPathFetchBygetJTB_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJTB_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, true);

		_finderPathCountBygetJTB_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJTB_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, false);

		AttractionWaterEmployeeUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AttractionWaterEmployeeUtil.setPersistence(null);

		entityCache.removeCache(AttractionWaterEmployeeImpl.class.getName());
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ATTRACTIONWATEREMPLOYEE =
		"SELECT attractionWaterEmployee FROM AttractionWaterEmployee attractionWaterEmployee";

	private static final String _SQL_SELECT_ATTRACTIONWATEREMPLOYEE_WHERE =
		"SELECT attractionWaterEmployee FROM AttractionWaterEmployee attractionWaterEmployee WHERE ";

	private static final String _SQL_COUNT_ATTRACTIONWATEREMPLOYEE =
		"SELECT COUNT(attractionWaterEmployee) FROM AttractionWaterEmployee attractionWaterEmployee";

	private static final String _SQL_COUNT_ATTRACTIONWATEREMPLOYEE_WHERE =
		"SELECT COUNT(attractionWaterEmployee) FROM AttractionWaterEmployee attractionWaterEmployee WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"attractionWaterEmployee.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AttractionWaterEmployee exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AttractionWaterEmployee exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AttractionWaterEmployeePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}