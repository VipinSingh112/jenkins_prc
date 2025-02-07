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

import com.nbp.janaac.application.form.service.exception.NoSuchAddFdaScopeClientException;
import com.nbp.janaac.application.form.service.model.AddFdaScopeClient;
import com.nbp.janaac.application.form.service.model.AddFdaScopeClientTable;
import com.nbp.janaac.application.form.service.model.impl.AddFdaScopeClientImpl;
import com.nbp.janaac.application.form.service.model.impl.AddFdaScopeClientModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddFdaScopeClientPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddFdaScopeClientUtil;
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
 * The persistence implementation for the add fda scope client service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddFdaScopeClientPersistence.class)
public class AddFdaScopeClientPersistenceImpl
	extends BasePersistenceImpl<AddFdaScopeClient>
	implements AddFdaScopeClientPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddFdaScopeClientUtil</code> to access the add fda scope client persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddFdaScopeClientImpl.class.getName();

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
	 * Returns all the add fda scope clients where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add fda scope clients
	 */
	@Override
	public List<AddFdaScopeClient> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add fda scope clients where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaScopeClientModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda scope clients
	 * @param end the upper bound of the range of add fda scope clients (not inclusive)
	 * @return the range of matching add fda scope clients
	 */
	@Override
	public List<AddFdaScopeClient> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add fda scope clients where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaScopeClientModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda scope clients
	 * @param end the upper bound of the range of add fda scope clients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add fda scope clients
	 */
	@Override
	public List<AddFdaScopeClient> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddFdaScopeClient> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add fda scope clients where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaScopeClientModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda scope clients
	 * @param end the upper bound of the range of add fda scope clients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add fda scope clients
	 */
	@Override
	public List<AddFdaScopeClient> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddFdaScopeClient> orderByComparator,
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

		List<AddFdaScopeClient> list = null;

		if (useFinderCache) {
			list = (List<AddFdaScopeClient>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddFdaScopeClient addFdaScopeClient : list) {
					if (janaacApplicationId !=
							addFdaScopeClient.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDFDASCOPECLIENT_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddFdaScopeClientModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddFdaScopeClient>)QueryUtil.list(
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
	 * Returns the first add fda scope client in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda scope client
	 * @throws NoSuchAddFdaScopeClientException if a matching add fda scope client could not be found
	 */
	@Override
	public AddFdaScopeClient findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddFdaScopeClient> orderByComparator)
		throws NoSuchAddFdaScopeClientException {

		AddFdaScopeClient addFdaScopeClient = fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);

		if (addFdaScopeClient != null) {
			return addFdaScopeClient;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddFdaScopeClientException(sb.toString());
	}

	/**
	 * Returns the first add fda scope client in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda scope client, or <code>null</code> if a matching add fda scope client could not be found
	 */
	@Override
	public AddFdaScopeClient fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddFdaScopeClient> orderByComparator) {

		List<AddFdaScopeClient> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add fda scope client in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda scope client
	 * @throws NoSuchAddFdaScopeClientException if a matching add fda scope client could not be found
	 */
	@Override
	public AddFdaScopeClient findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddFdaScopeClient> orderByComparator)
		throws NoSuchAddFdaScopeClientException {

		AddFdaScopeClient addFdaScopeClient = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addFdaScopeClient != null) {
			return addFdaScopeClient;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddFdaScopeClientException(sb.toString());
	}

	/**
	 * Returns the last add fda scope client in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda scope client, or <code>null</code> if a matching add fda scope client could not be found
	 */
	@Override
	public AddFdaScopeClient fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddFdaScopeClient> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddFdaScopeClient> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add fda scope clients before and after the current add fda scope client in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addFdaScopeClientId the primary key of the current add fda scope client
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add fda scope client
	 * @throws NoSuchAddFdaScopeClientException if a add fda scope client with the primary key could not be found
	 */
	@Override
	public AddFdaScopeClient[] findBygetJanaacById_PrevAndNext(
			long addFdaScopeClientId, long janaacApplicationId,
			OrderByComparator<AddFdaScopeClient> orderByComparator)
		throws NoSuchAddFdaScopeClientException {

		AddFdaScopeClient addFdaScopeClient = findByPrimaryKey(
			addFdaScopeClientId);

		Session session = null;

		try {
			session = openSession();

			AddFdaScopeClient[] array = new AddFdaScopeClientImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addFdaScopeClient, janaacApplicationId,
				orderByComparator, true);

			array[1] = addFdaScopeClient;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addFdaScopeClient, janaacApplicationId,
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

	protected AddFdaScopeClient getBygetJanaacById_PrevAndNext(
		Session session, AddFdaScopeClient addFdaScopeClient,
		long janaacApplicationId,
		OrderByComparator<AddFdaScopeClient> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDFDASCOPECLIENT_WHERE);

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
			sb.append(AddFdaScopeClientModelImpl.ORDER_BY_JPQL);
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
						addFdaScopeClient)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddFdaScopeClient> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add fda scope clients where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddFdaScopeClient addFdaScopeClient :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addFdaScopeClient);
		}
	}

	/**
	 * Returns the number of add fda scope clients where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add fda scope clients
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDFDASCOPECLIENT_WHERE);

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
			"addFdaScopeClient.janaacApplicationId = ?";

	public AddFdaScopeClientPersistenceImpl() {
		setModelClass(AddFdaScopeClient.class);

		setModelImplClass(AddFdaScopeClientImpl.class);
		setModelPKClass(long.class);

		setTable(AddFdaScopeClientTable.INSTANCE);
	}

	/**
	 * Caches the add fda scope client in the entity cache if it is enabled.
	 *
	 * @param addFdaScopeClient the add fda scope client
	 */
	@Override
	public void cacheResult(AddFdaScopeClient addFdaScopeClient) {
		entityCache.putResult(
			AddFdaScopeClientImpl.class, addFdaScopeClient.getPrimaryKey(),
			addFdaScopeClient);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add fda scope clients in the entity cache if it is enabled.
	 *
	 * @param addFdaScopeClients the add fda scope clients
	 */
	@Override
	public void cacheResult(List<AddFdaScopeClient> addFdaScopeClients) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addFdaScopeClients.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddFdaScopeClient addFdaScopeClient : addFdaScopeClients) {
			if (entityCache.getResult(
					AddFdaScopeClientImpl.class,
					addFdaScopeClient.getPrimaryKey()) == null) {

				cacheResult(addFdaScopeClient);
			}
		}
	}

	/**
	 * Clears the cache for all add fda scope clients.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddFdaScopeClientImpl.class);

		finderCache.clearCache(AddFdaScopeClientImpl.class);
	}

	/**
	 * Clears the cache for the add fda scope client.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddFdaScopeClient addFdaScopeClient) {
		entityCache.removeResult(
			AddFdaScopeClientImpl.class, addFdaScopeClient);
	}

	@Override
	public void clearCache(List<AddFdaScopeClient> addFdaScopeClients) {
		for (AddFdaScopeClient addFdaScopeClient : addFdaScopeClients) {
			entityCache.removeResult(
				AddFdaScopeClientImpl.class, addFdaScopeClient);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddFdaScopeClientImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AddFdaScopeClientImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add fda scope client with the primary key. Does not add the add fda scope client to the database.
	 *
	 * @param addFdaScopeClientId the primary key for the new add fda scope client
	 * @return the new add fda scope client
	 */
	@Override
	public AddFdaScopeClient create(long addFdaScopeClientId) {
		AddFdaScopeClient addFdaScopeClient = new AddFdaScopeClientImpl();

		addFdaScopeClient.setNew(true);
		addFdaScopeClient.setPrimaryKey(addFdaScopeClientId);

		addFdaScopeClient.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addFdaScopeClient;
	}

	/**
	 * Removes the add fda scope client with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addFdaScopeClientId the primary key of the add fda scope client
	 * @return the add fda scope client that was removed
	 * @throws NoSuchAddFdaScopeClientException if a add fda scope client with the primary key could not be found
	 */
	@Override
	public AddFdaScopeClient remove(long addFdaScopeClientId)
		throws NoSuchAddFdaScopeClientException {

		return remove((Serializable)addFdaScopeClientId);
	}

	/**
	 * Removes the add fda scope client with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add fda scope client
	 * @return the add fda scope client that was removed
	 * @throws NoSuchAddFdaScopeClientException if a add fda scope client with the primary key could not be found
	 */
	@Override
	public AddFdaScopeClient remove(Serializable primaryKey)
		throws NoSuchAddFdaScopeClientException {

		Session session = null;

		try {
			session = openSession();

			AddFdaScopeClient addFdaScopeClient =
				(AddFdaScopeClient)session.get(
					AddFdaScopeClientImpl.class, primaryKey);

			if (addFdaScopeClient == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddFdaScopeClientException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addFdaScopeClient);
		}
		catch (NoSuchAddFdaScopeClientException noSuchEntityException) {
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
	protected AddFdaScopeClient removeImpl(
		AddFdaScopeClient addFdaScopeClient) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addFdaScopeClient)) {
				addFdaScopeClient = (AddFdaScopeClient)session.get(
					AddFdaScopeClientImpl.class,
					addFdaScopeClient.getPrimaryKeyObj());
			}

			if (addFdaScopeClient != null) {
				session.delete(addFdaScopeClient);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addFdaScopeClient != null) {
			clearCache(addFdaScopeClient);
		}

		return addFdaScopeClient;
	}

	@Override
	public AddFdaScopeClient updateImpl(AddFdaScopeClient addFdaScopeClient) {
		boolean isNew = addFdaScopeClient.isNew();

		if (!(addFdaScopeClient instanceof AddFdaScopeClientModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addFdaScopeClient.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addFdaScopeClient);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addFdaScopeClient proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddFdaScopeClient implementation " +
					addFdaScopeClient.getClass());
		}

		AddFdaScopeClientModelImpl addFdaScopeClientModelImpl =
			(AddFdaScopeClientModelImpl)addFdaScopeClient;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addFdaScopeClient.getCreateDate() == null)) {
			if (serviceContext == null) {
				addFdaScopeClient.setCreateDate(date);
			}
			else {
				addFdaScopeClient.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addFdaScopeClientModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addFdaScopeClient.setModifiedDate(date);
			}
			else {
				addFdaScopeClient.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addFdaScopeClient);
			}
			else {
				addFdaScopeClient = (AddFdaScopeClient)session.merge(
					addFdaScopeClient);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddFdaScopeClientImpl.class, addFdaScopeClientModelImpl, false,
			true);

		if (isNew) {
			addFdaScopeClient.setNew(false);
		}

		addFdaScopeClient.resetOriginalValues();

		return addFdaScopeClient;
	}

	/**
	 * Returns the add fda scope client with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add fda scope client
	 * @return the add fda scope client
	 * @throws NoSuchAddFdaScopeClientException if a add fda scope client with the primary key could not be found
	 */
	@Override
	public AddFdaScopeClient findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddFdaScopeClientException {

		AddFdaScopeClient addFdaScopeClient = fetchByPrimaryKey(primaryKey);

		if (addFdaScopeClient == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddFdaScopeClientException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addFdaScopeClient;
	}

	/**
	 * Returns the add fda scope client with the primary key or throws a <code>NoSuchAddFdaScopeClientException</code> if it could not be found.
	 *
	 * @param addFdaScopeClientId the primary key of the add fda scope client
	 * @return the add fda scope client
	 * @throws NoSuchAddFdaScopeClientException if a add fda scope client with the primary key could not be found
	 */
	@Override
	public AddFdaScopeClient findByPrimaryKey(long addFdaScopeClientId)
		throws NoSuchAddFdaScopeClientException {

		return findByPrimaryKey((Serializable)addFdaScopeClientId);
	}

	/**
	 * Returns the add fda scope client with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addFdaScopeClientId the primary key of the add fda scope client
	 * @return the add fda scope client, or <code>null</code> if a add fda scope client with the primary key could not be found
	 */
	@Override
	public AddFdaScopeClient fetchByPrimaryKey(long addFdaScopeClientId) {
		return fetchByPrimaryKey((Serializable)addFdaScopeClientId);
	}

	/**
	 * Returns all the add fda scope clients.
	 *
	 * @return the add fda scope clients
	 */
	@Override
	public List<AddFdaScopeClient> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add fda scope clients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaScopeClientModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda scope clients
	 * @param end the upper bound of the range of add fda scope clients (not inclusive)
	 * @return the range of add fda scope clients
	 */
	@Override
	public List<AddFdaScopeClient> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add fda scope clients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaScopeClientModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda scope clients
	 * @param end the upper bound of the range of add fda scope clients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add fda scope clients
	 */
	@Override
	public List<AddFdaScopeClient> findAll(
		int start, int end,
		OrderByComparator<AddFdaScopeClient> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add fda scope clients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaScopeClientModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda scope clients
	 * @param end the upper bound of the range of add fda scope clients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add fda scope clients
	 */
	@Override
	public List<AddFdaScopeClient> findAll(
		int start, int end,
		OrderByComparator<AddFdaScopeClient> orderByComparator,
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

		List<AddFdaScopeClient> list = null;

		if (useFinderCache) {
			list = (List<AddFdaScopeClient>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDFDASCOPECLIENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDFDASCOPECLIENT;

				sql = sql.concat(AddFdaScopeClientModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddFdaScopeClient>)QueryUtil.list(
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
	 * Removes all the add fda scope clients from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddFdaScopeClient addFdaScopeClient : findAll()) {
			remove(addFdaScopeClient);
		}
	}

	/**
	 * Returns the number of add fda scope clients.
	 *
	 * @return the number of add fda scope clients
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ADDFDASCOPECLIENT);

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
		return "addFdaScopeClientId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDFDASCOPECLIENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddFdaScopeClientModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add fda scope client persistence.
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

		AddFdaScopeClientUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddFdaScopeClientUtil.setPersistence(null);

		entityCache.removeCache(AddFdaScopeClientImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDFDASCOPECLIENT =
		"SELECT addFdaScopeClient FROM AddFdaScopeClient addFdaScopeClient";

	private static final String _SQL_SELECT_ADDFDASCOPECLIENT_WHERE =
		"SELECT addFdaScopeClient FROM AddFdaScopeClient addFdaScopeClient WHERE ";

	private static final String _SQL_COUNT_ADDFDASCOPECLIENT =
		"SELECT COUNT(addFdaScopeClient) FROM AddFdaScopeClient addFdaScopeClient";

	private static final String _SQL_COUNT_ADDFDASCOPECLIENT_WHERE =
		"SELECT COUNT(addFdaScopeClient) FROM AddFdaScopeClient addFdaScopeClient WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "addFdaScopeClient.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddFdaScopeClient exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddFdaScopeClient exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddFdaScopeClientPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}