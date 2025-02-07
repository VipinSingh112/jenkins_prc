/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

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

import com.nbp.janaac.application.form.service.exception.NoSuchAddCerScopeServiceException;
import com.nbp.janaac.application.form.service.model.AddCerScopeService;
import com.nbp.janaac.application.form.service.model.AddCerScopeServiceTable;
import com.nbp.janaac.application.form.service.model.impl.AddCerScopeServiceImpl;
import com.nbp.janaac.application.form.service.model.impl.AddCerScopeServiceModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddCerScopeServicePersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddCerScopeServiceUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the add cer scope service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddCerScopeServicePersistence.class)
public class AddCerScopeServicePersistenceImpl
	extends BasePersistenceImpl<AddCerScopeService>
	implements AddCerScopeServicePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddCerScopeServiceUtil</code> to access the add cer scope service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddCerScopeServiceImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetJanaacById;
	private FinderPath _finderPathWithoutPaginationFindBygetJanaacById;
	private FinderPath _finderPathCountBygetJanaacById;

	/**
	 * Returns all the add cer scope services where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add cer scope services
	 */
	@Override
	public List<AddCerScopeService> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add cer scope services where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer scope services
	 * @param end the upper bound of the range of add cer scope services (not inclusive)
	 * @return the range of matching add cer scope services
	 */
	@Override
	public List<AddCerScopeService> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add cer scope services where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer scope services
	 * @param end the upper bound of the range of add cer scope services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add cer scope services
	 */
	@Override
	public List<AddCerScopeService> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerScopeService> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add cer scope services where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer scope services
	 * @param end the upper bound of the range of add cer scope services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add cer scope services
	 */
	@Override
	public List<AddCerScopeService> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerScopeService> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJanaacById;
				finderArgs = new Object[] {janaacApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJanaacById;
			finderArgs = new Object[] {
				janaacApplicationId, start, end, orderByComparator
			};
		}

		List<AddCerScopeService> list = null;

		if (useFinderCache) {
			list = (List<AddCerScopeService>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddCerScopeService addCerScopeService : list) {
					if (janaacApplicationId !=
							addCerScopeService.getJanaacApplicationId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_ADDCERSCOPESERVICE_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddCerScopeServiceModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddCerScopeService>)QueryUtil.list(
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
	 * Returns the first add cer scope service in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer scope service
	 * @throws NoSuchAddCerScopeServiceException if a matching add cer scope service could not be found
	 */
	@Override
	public AddCerScopeService findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddCerScopeService> orderByComparator)
		throws NoSuchAddCerScopeServiceException {

		AddCerScopeService addCerScopeService = fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);

		if (addCerScopeService != null) {
			return addCerScopeService;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddCerScopeServiceException(sb.toString());
	}

	/**
	 * Returns the first add cer scope service in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer scope service, or <code>null</code> if a matching add cer scope service could not be found
	 */
	@Override
	public AddCerScopeService fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddCerScopeService> orderByComparator) {

		List<AddCerScopeService> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add cer scope service in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer scope service
	 * @throws NoSuchAddCerScopeServiceException if a matching add cer scope service could not be found
	 */
	@Override
	public AddCerScopeService findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddCerScopeService> orderByComparator)
		throws NoSuchAddCerScopeServiceException {

		AddCerScopeService addCerScopeService = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addCerScopeService != null) {
			return addCerScopeService;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddCerScopeServiceException(sb.toString());
	}

	/**
	 * Returns the last add cer scope service in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer scope service, or <code>null</code> if a matching add cer scope service could not be found
	 */
	@Override
	public AddCerScopeService fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddCerScopeService> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddCerScopeService> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add cer scope services before and after the current add cer scope service in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addCerScopeServiceId the primary key of the current add cer scope service
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add cer scope service
	 * @throws NoSuchAddCerScopeServiceException if a add cer scope service with the primary key could not be found
	 */
	@Override
	public AddCerScopeService[] findBygetJanaacById_PrevAndNext(
			long addCerScopeServiceId, long janaacApplicationId,
			OrderByComparator<AddCerScopeService> orderByComparator)
		throws NoSuchAddCerScopeServiceException {

		AddCerScopeService addCerScopeService = findByPrimaryKey(
			addCerScopeServiceId);

		Session session = null;

		try {
			session = openSession();

			AddCerScopeService[] array = new AddCerScopeServiceImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addCerScopeService, janaacApplicationId,
				orderByComparator, true);

			array[1] = addCerScopeService;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addCerScopeService, janaacApplicationId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AddCerScopeService getBygetJanaacById_PrevAndNext(
		Session session, AddCerScopeService addCerScopeService,
		long janaacApplicationId,
		OrderByComparator<AddCerScopeService> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ADDCERSCOPESERVICE_WHERE);

		sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(AddCerScopeServiceModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(janaacApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						addCerScopeService)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddCerScopeService> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add cer scope services where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddCerScopeService addCerScopeService :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addCerScopeService);
		}
	}

	/**
	 * Returns the number of add cer scope services where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add cer scope services
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDCERSCOPESERVICE_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

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
		_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2 =
			"addCerScopeService.janaacApplicationId = ?";

	public AddCerScopeServicePersistenceImpl() {
		setModelClass(AddCerScopeService.class);

		setModelImplClass(AddCerScopeServiceImpl.class);
		setModelPKClass(long.class);

		setTable(AddCerScopeServiceTable.INSTANCE);
	}

	/**
	 * Caches the add cer scope service in the entity cache if it is enabled.
	 *
	 * @param addCerScopeService the add cer scope service
	 */
	@Override
	public void cacheResult(AddCerScopeService addCerScopeService) {
		entityCache.putResult(
			AddCerScopeServiceImpl.class, addCerScopeService.getPrimaryKey(),
			addCerScopeService);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add cer scope services in the entity cache if it is enabled.
	 *
	 * @param addCerScopeServices the add cer scope services
	 */
	@Override
	public void cacheResult(List<AddCerScopeService> addCerScopeServices) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addCerScopeServices.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddCerScopeService addCerScopeService : addCerScopeServices) {
			if (entityCache.getResult(
					AddCerScopeServiceImpl.class,
					addCerScopeService.getPrimaryKey()) == null) {

				cacheResult(addCerScopeService);
			}
		}
	}

	/**
	 * Clears the cache for all add cer scope services.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddCerScopeServiceImpl.class);

		finderCache.clearCache(AddCerScopeServiceImpl.class);
	}

	/**
	 * Clears the cache for the add cer scope service.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddCerScopeService addCerScopeService) {
		entityCache.removeResult(
			AddCerScopeServiceImpl.class, addCerScopeService);
	}

	@Override
	public void clearCache(List<AddCerScopeService> addCerScopeServices) {
		for (AddCerScopeService addCerScopeService : addCerScopeServices) {
			entityCache.removeResult(
				AddCerScopeServiceImpl.class, addCerScopeService);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddCerScopeServiceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AddCerScopeServiceImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add cer scope service with the primary key. Does not add the add cer scope service to the database.
	 *
	 * @param addCerScopeServiceId the primary key for the new add cer scope service
	 * @return the new add cer scope service
	 */
	@Override
	public AddCerScopeService create(long addCerScopeServiceId) {
		AddCerScopeService addCerScopeService = new AddCerScopeServiceImpl();

		addCerScopeService.setNew(true);
		addCerScopeService.setPrimaryKey(addCerScopeServiceId);

		addCerScopeService.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addCerScopeService;
	}

	/**
	 * Removes the add cer scope service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addCerScopeServiceId the primary key of the add cer scope service
	 * @return the add cer scope service that was removed
	 * @throws NoSuchAddCerScopeServiceException if a add cer scope service with the primary key could not be found
	 */
	@Override
	public AddCerScopeService remove(long addCerScopeServiceId)
		throws NoSuchAddCerScopeServiceException {

		return remove((Serializable)addCerScopeServiceId);
	}

	/**
	 * Removes the add cer scope service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add cer scope service
	 * @return the add cer scope service that was removed
	 * @throws NoSuchAddCerScopeServiceException if a add cer scope service with the primary key could not be found
	 */
	@Override
	public AddCerScopeService remove(Serializable primaryKey)
		throws NoSuchAddCerScopeServiceException {

		Session session = null;

		try {
			session = openSession();

			AddCerScopeService addCerScopeService =
				(AddCerScopeService)session.get(
					AddCerScopeServiceImpl.class, primaryKey);

			if (addCerScopeService == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddCerScopeServiceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addCerScopeService);
		}
		catch (NoSuchAddCerScopeServiceException noSuchEntityException) {
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
	protected AddCerScopeService removeImpl(
		AddCerScopeService addCerScopeService) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addCerScopeService)) {
				addCerScopeService = (AddCerScopeService)session.get(
					AddCerScopeServiceImpl.class,
					addCerScopeService.getPrimaryKeyObj());
			}

			if (addCerScopeService != null) {
				session.delete(addCerScopeService);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addCerScopeService != null) {
			clearCache(addCerScopeService);
		}

		return addCerScopeService;
	}

	@Override
	public AddCerScopeService updateImpl(
		AddCerScopeService addCerScopeService) {

		boolean isNew = addCerScopeService.isNew();

		if (!(addCerScopeService instanceof AddCerScopeServiceModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addCerScopeService.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addCerScopeService);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addCerScopeService proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddCerScopeService implementation " +
					addCerScopeService.getClass());
		}

		AddCerScopeServiceModelImpl addCerScopeServiceModelImpl =
			(AddCerScopeServiceModelImpl)addCerScopeService;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addCerScopeService.getCreateDate() == null)) {
			if (serviceContext == null) {
				addCerScopeService.setCreateDate(date);
			}
			else {
				addCerScopeService.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addCerScopeServiceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addCerScopeService.setModifiedDate(date);
			}
			else {
				addCerScopeService.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addCerScopeService);
			}
			else {
				addCerScopeService = (AddCerScopeService)session.merge(
					addCerScopeService);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddCerScopeServiceImpl.class, addCerScopeServiceModelImpl, false,
			true);

		if (isNew) {
			addCerScopeService.setNew(false);
		}

		addCerScopeService.resetOriginalValues();

		return addCerScopeService;
	}

	/**
	 * Returns the add cer scope service with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add cer scope service
	 * @return the add cer scope service
	 * @throws NoSuchAddCerScopeServiceException if a add cer scope service with the primary key could not be found
	 */
	@Override
	public AddCerScopeService findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddCerScopeServiceException {

		AddCerScopeService addCerScopeService = fetchByPrimaryKey(primaryKey);

		if (addCerScopeService == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddCerScopeServiceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addCerScopeService;
	}

	/**
	 * Returns the add cer scope service with the primary key or throws a <code>NoSuchAddCerScopeServiceException</code> if it could not be found.
	 *
	 * @param addCerScopeServiceId the primary key of the add cer scope service
	 * @return the add cer scope service
	 * @throws NoSuchAddCerScopeServiceException if a add cer scope service with the primary key could not be found
	 */
	@Override
	public AddCerScopeService findByPrimaryKey(long addCerScopeServiceId)
		throws NoSuchAddCerScopeServiceException {

		return findByPrimaryKey((Serializable)addCerScopeServiceId);
	}

	/**
	 * Returns the add cer scope service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addCerScopeServiceId the primary key of the add cer scope service
	 * @return the add cer scope service, or <code>null</code> if a add cer scope service with the primary key could not be found
	 */
	@Override
	public AddCerScopeService fetchByPrimaryKey(long addCerScopeServiceId) {
		return fetchByPrimaryKey((Serializable)addCerScopeServiceId);
	}

	/**
	 * Returns all the add cer scope services.
	 *
	 * @return the add cer scope services
	 */
	@Override
	public List<AddCerScopeService> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add cer scope services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer scope services
	 * @param end the upper bound of the range of add cer scope services (not inclusive)
	 * @return the range of add cer scope services
	 */
	@Override
	public List<AddCerScopeService> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add cer scope services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer scope services
	 * @param end the upper bound of the range of add cer scope services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add cer scope services
	 */
	@Override
	public List<AddCerScopeService> findAll(
		int start, int end,
		OrderByComparator<AddCerScopeService> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add cer scope services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerScopeServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer scope services
	 * @param end the upper bound of the range of add cer scope services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add cer scope services
	 */
	@Override
	public List<AddCerScopeService> findAll(
		int start, int end,
		OrderByComparator<AddCerScopeService> orderByComparator,
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

		List<AddCerScopeService> list = null;

		if (useFinderCache) {
			list = (List<AddCerScopeService>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDCERSCOPESERVICE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDCERSCOPESERVICE;

				sql = sql.concat(AddCerScopeServiceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddCerScopeService>)QueryUtil.list(
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
	 * Removes all the add cer scope services from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddCerScopeService addCerScopeService : findAll()) {
			remove(addCerScopeService);
		}
	}

	/**
	 * Returns the number of add cer scope services.
	 *
	 * @return the number of add cer scope services
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
					_SQL_COUNT_ADDCERSCOPESERVICE);

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
		return "addCerScopeServiceId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDCERSCOPESERVICE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddCerScopeServiceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add cer scope service persistence.
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

		_finderPathWithPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJanaacById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"janaacApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, true);

		_finderPathCountBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, false);

		AddCerScopeServiceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddCerScopeServiceUtil.setPersistence(null);

		entityCache.removeCache(AddCerScopeServiceImpl.class.getName());
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ADDCERSCOPESERVICE =
		"SELECT addCerScopeService FROM AddCerScopeService addCerScopeService";

	private static final String _SQL_SELECT_ADDCERSCOPESERVICE_WHERE =
		"SELECT addCerScopeService FROM AddCerScopeService addCerScopeService WHERE ";

	private static final String _SQL_COUNT_ADDCERSCOPESERVICE =
		"SELECT COUNT(addCerScopeService) FROM AddCerScopeService addCerScopeService";

	private static final String _SQL_COUNT_ADDCERSCOPESERVICE_WHERE =
		"SELECT COUNT(addCerScopeService) FROM AddCerScopeService addCerScopeService WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "addCerScopeService.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddCerScopeService exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddCerScopeService exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddCerScopeServicePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}