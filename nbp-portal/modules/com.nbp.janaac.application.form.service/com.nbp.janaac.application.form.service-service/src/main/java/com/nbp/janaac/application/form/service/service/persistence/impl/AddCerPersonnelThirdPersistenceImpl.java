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
import com.liferay.portal.kernel.util.SetUtil;

import com.nbp.janaac.application.form.service.exception.NoSuchAddCerPersonnelThirdException;
import com.nbp.janaac.application.form.service.model.AddCerPersonnelThird;
import com.nbp.janaac.application.form.service.model.AddCerPersonnelThirdTable;
import com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelThirdImpl;
import com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelThirdModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddCerPersonnelThirdPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddCerPersonnelThirdUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the add cer personnel third service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddCerPersonnelThirdPersistence.class)
public class AddCerPersonnelThirdPersistenceImpl
	extends BasePersistenceImpl<AddCerPersonnelThird>
	implements AddCerPersonnelThirdPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddCerPersonnelThirdUtil</code> to access the add cer personnel third persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddCerPersonnelThirdImpl.class.getName();

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
	 * Returns all the add cer personnel thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add cer personnel thirds
	 */
	@Override
	public List<AddCerPersonnelThird> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add cer personnel thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel thirds
	 * @param end the upper bound of the range of add cer personnel thirds (not inclusive)
	 * @return the range of matching add cer personnel thirds
	 */
	@Override
	public List<AddCerPersonnelThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add cer personnel thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel thirds
	 * @param end the upper bound of the range of add cer personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add cer personnel thirds
	 */
	@Override
	public List<AddCerPersonnelThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerPersonnelThird> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add cer personnel thirds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel thirds
	 * @param end the upper bound of the range of add cer personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add cer personnel thirds
	 */
	@Override
	public List<AddCerPersonnelThird> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerPersonnelThird> orderByComparator,
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

		List<AddCerPersonnelThird> list = null;

		if (useFinderCache) {
			list = (List<AddCerPersonnelThird>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddCerPersonnelThird addCerPersonnelThird : list) {
					if (janaacApplicationId !=
							addCerPersonnelThird.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDCERPERSONNELTHIRD_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddCerPersonnelThirdModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddCerPersonnelThird>)QueryUtil.list(
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
	 * Returns the first add cer personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer personnel third
	 * @throws NoSuchAddCerPersonnelThirdException if a matching add cer personnel third could not be found
	 */
	@Override
	public AddCerPersonnelThird findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddCerPersonnelThird> orderByComparator)
		throws NoSuchAddCerPersonnelThirdException {

		AddCerPersonnelThird addCerPersonnelThird = fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);

		if (addCerPersonnelThird != null) {
			return addCerPersonnelThird;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddCerPersonnelThirdException(sb.toString());
	}

	/**
	 * Returns the first add cer personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer personnel third, or <code>null</code> if a matching add cer personnel third could not be found
	 */
	@Override
	public AddCerPersonnelThird fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddCerPersonnelThird> orderByComparator) {

		List<AddCerPersonnelThird> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add cer personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer personnel third
	 * @throws NoSuchAddCerPersonnelThirdException if a matching add cer personnel third could not be found
	 */
	@Override
	public AddCerPersonnelThird findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddCerPersonnelThird> orderByComparator)
		throws NoSuchAddCerPersonnelThirdException {

		AddCerPersonnelThird addCerPersonnelThird = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addCerPersonnelThird != null) {
			return addCerPersonnelThird;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddCerPersonnelThirdException(sb.toString());
	}

	/**
	 * Returns the last add cer personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer personnel third, or <code>null</code> if a matching add cer personnel third could not be found
	 */
	@Override
	public AddCerPersonnelThird fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddCerPersonnelThird> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddCerPersonnelThird> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add cer personnel thirds before and after the current add cer personnel third in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addCerPersonnelThirdId the primary key of the current add cer personnel third
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add cer personnel third
	 * @throws NoSuchAddCerPersonnelThirdException if a add cer personnel third with the primary key could not be found
	 */
	@Override
	public AddCerPersonnelThird[] findBygetJanaacById_PrevAndNext(
			long addCerPersonnelThirdId, long janaacApplicationId,
			OrderByComparator<AddCerPersonnelThird> orderByComparator)
		throws NoSuchAddCerPersonnelThirdException {

		AddCerPersonnelThird addCerPersonnelThird = findByPrimaryKey(
			addCerPersonnelThirdId);

		Session session = null;

		try {
			session = openSession();

			AddCerPersonnelThird[] array = new AddCerPersonnelThirdImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addCerPersonnelThird, janaacApplicationId,
				orderByComparator, true);

			array[1] = addCerPersonnelThird;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addCerPersonnelThird, janaacApplicationId,
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

	protected AddCerPersonnelThird getBygetJanaacById_PrevAndNext(
		Session session, AddCerPersonnelThird addCerPersonnelThird,
		long janaacApplicationId,
		OrderByComparator<AddCerPersonnelThird> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDCERPERSONNELTHIRD_WHERE);

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
			sb.append(AddCerPersonnelThirdModelImpl.ORDER_BY_JPQL);
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
						addCerPersonnelThird)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddCerPersonnelThird> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add cer personnel thirds where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddCerPersonnelThird addCerPersonnelThird :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addCerPersonnelThird);
		}
	}

	/**
	 * Returns the number of add cer personnel thirds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add cer personnel thirds
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDCERPERSONNELTHIRD_WHERE);

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
			"addCerPersonnelThird.janaacApplicationId = ?";

	public AddCerPersonnelThirdPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("number", "number_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AddCerPersonnelThird.class);

		setModelImplClass(AddCerPersonnelThirdImpl.class);
		setModelPKClass(long.class);

		setTable(AddCerPersonnelThirdTable.INSTANCE);
	}

	/**
	 * Caches the add cer personnel third in the entity cache if it is enabled.
	 *
	 * @param addCerPersonnelThird the add cer personnel third
	 */
	@Override
	public void cacheResult(AddCerPersonnelThird addCerPersonnelThird) {
		entityCache.putResult(
			AddCerPersonnelThirdImpl.class,
			addCerPersonnelThird.getPrimaryKey(), addCerPersonnelThird);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add cer personnel thirds in the entity cache if it is enabled.
	 *
	 * @param addCerPersonnelThirds the add cer personnel thirds
	 */
	@Override
	public void cacheResult(List<AddCerPersonnelThird> addCerPersonnelThirds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addCerPersonnelThirds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddCerPersonnelThird addCerPersonnelThird :
				addCerPersonnelThirds) {

			if (entityCache.getResult(
					AddCerPersonnelThirdImpl.class,
					addCerPersonnelThird.getPrimaryKey()) == null) {

				cacheResult(addCerPersonnelThird);
			}
		}
	}

	/**
	 * Clears the cache for all add cer personnel thirds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddCerPersonnelThirdImpl.class);

		finderCache.clearCache(AddCerPersonnelThirdImpl.class);
	}

	/**
	 * Clears the cache for the add cer personnel third.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddCerPersonnelThird addCerPersonnelThird) {
		entityCache.removeResult(
			AddCerPersonnelThirdImpl.class, addCerPersonnelThird);
	}

	@Override
	public void clearCache(List<AddCerPersonnelThird> addCerPersonnelThirds) {
		for (AddCerPersonnelThird addCerPersonnelThird :
				addCerPersonnelThirds) {

			entityCache.removeResult(
				AddCerPersonnelThirdImpl.class, addCerPersonnelThird);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddCerPersonnelThirdImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddCerPersonnelThirdImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add cer personnel third with the primary key. Does not add the add cer personnel third to the database.
	 *
	 * @param addCerPersonnelThirdId the primary key for the new add cer personnel third
	 * @return the new add cer personnel third
	 */
	@Override
	public AddCerPersonnelThird create(long addCerPersonnelThirdId) {
		AddCerPersonnelThird addCerPersonnelThird =
			new AddCerPersonnelThirdImpl();

		addCerPersonnelThird.setNew(true);
		addCerPersonnelThird.setPrimaryKey(addCerPersonnelThirdId);

		addCerPersonnelThird.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addCerPersonnelThird;
	}

	/**
	 * Removes the add cer personnel third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addCerPersonnelThirdId the primary key of the add cer personnel third
	 * @return the add cer personnel third that was removed
	 * @throws NoSuchAddCerPersonnelThirdException if a add cer personnel third with the primary key could not be found
	 */
	@Override
	public AddCerPersonnelThird remove(long addCerPersonnelThirdId)
		throws NoSuchAddCerPersonnelThirdException {

		return remove((Serializable)addCerPersonnelThirdId);
	}

	/**
	 * Removes the add cer personnel third with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add cer personnel third
	 * @return the add cer personnel third that was removed
	 * @throws NoSuchAddCerPersonnelThirdException if a add cer personnel third with the primary key could not be found
	 */
	@Override
	public AddCerPersonnelThird remove(Serializable primaryKey)
		throws NoSuchAddCerPersonnelThirdException {

		Session session = null;

		try {
			session = openSession();

			AddCerPersonnelThird addCerPersonnelThird =
				(AddCerPersonnelThird)session.get(
					AddCerPersonnelThirdImpl.class, primaryKey);

			if (addCerPersonnelThird == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddCerPersonnelThirdException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addCerPersonnelThird);
		}
		catch (NoSuchAddCerPersonnelThirdException noSuchEntityException) {
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
	protected AddCerPersonnelThird removeImpl(
		AddCerPersonnelThird addCerPersonnelThird) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addCerPersonnelThird)) {
				addCerPersonnelThird = (AddCerPersonnelThird)session.get(
					AddCerPersonnelThirdImpl.class,
					addCerPersonnelThird.getPrimaryKeyObj());
			}

			if (addCerPersonnelThird != null) {
				session.delete(addCerPersonnelThird);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addCerPersonnelThird != null) {
			clearCache(addCerPersonnelThird);
		}

		return addCerPersonnelThird;
	}

	@Override
	public AddCerPersonnelThird updateImpl(
		AddCerPersonnelThird addCerPersonnelThird) {

		boolean isNew = addCerPersonnelThird.isNew();

		if (!(addCerPersonnelThird instanceof AddCerPersonnelThirdModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addCerPersonnelThird.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addCerPersonnelThird);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addCerPersonnelThird proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddCerPersonnelThird implementation " +
					addCerPersonnelThird.getClass());
		}

		AddCerPersonnelThirdModelImpl addCerPersonnelThirdModelImpl =
			(AddCerPersonnelThirdModelImpl)addCerPersonnelThird;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addCerPersonnelThird.getCreateDate() == null)) {
			if (serviceContext == null) {
				addCerPersonnelThird.setCreateDate(date);
			}
			else {
				addCerPersonnelThird.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addCerPersonnelThirdModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addCerPersonnelThird.setModifiedDate(date);
			}
			else {
				addCerPersonnelThird.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addCerPersonnelThird);
			}
			else {
				addCerPersonnelThird = (AddCerPersonnelThird)session.merge(
					addCerPersonnelThird);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddCerPersonnelThirdImpl.class, addCerPersonnelThirdModelImpl,
			false, true);

		if (isNew) {
			addCerPersonnelThird.setNew(false);
		}

		addCerPersonnelThird.resetOriginalValues();

		return addCerPersonnelThird;
	}

	/**
	 * Returns the add cer personnel third with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add cer personnel third
	 * @return the add cer personnel third
	 * @throws NoSuchAddCerPersonnelThirdException if a add cer personnel third with the primary key could not be found
	 */
	@Override
	public AddCerPersonnelThird findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddCerPersonnelThirdException {

		AddCerPersonnelThird addCerPersonnelThird = fetchByPrimaryKey(
			primaryKey);

		if (addCerPersonnelThird == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddCerPersonnelThirdException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addCerPersonnelThird;
	}

	/**
	 * Returns the add cer personnel third with the primary key or throws a <code>NoSuchAddCerPersonnelThirdException</code> if it could not be found.
	 *
	 * @param addCerPersonnelThirdId the primary key of the add cer personnel third
	 * @return the add cer personnel third
	 * @throws NoSuchAddCerPersonnelThirdException if a add cer personnel third with the primary key could not be found
	 */
	@Override
	public AddCerPersonnelThird findByPrimaryKey(long addCerPersonnelThirdId)
		throws NoSuchAddCerPersonnelThirdException {

		return findByPrimaryKey((Serializable)addCerPersonnelThirdId);
	}

	/**
	 * Returns the add cer personnel third with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addCerPersonnelThirdId the primary key of the add cer personnel third
	 * @return the add cer personnel third, or <code>null</code> if a add cer personnel third with the primary key could not be found
	 */
	@Override
	public AddCerPersonnelThird fetchByPrimaryKey(long addCerPersonnelThirdId) {
		return fetchByPrimaryKey((Serializable)addCerPersonnelThirdId);
	}

	/**
	 * Returns all the add cer personnel thirds.
	 *
	 * @return the add cer personnel thirds
	 */
	@Override
	public List<AddCerPersonnelThird> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add cer personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel thirds
	 * @param end the upper bound of the range of add cer personnel thirds (not inclusive)
	 * @return the range of add cer personnel thirds
	 */
	@Override
	public List<AddCerPersonnelThird> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add cer personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel thirds
	 * @param end the upper bound of the range of add cer personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add cer personnel thirds
	 */
	@Override
	public List<AddCerPersonnelThird> findAll(
		int start, int end,
		OrderByComparator<AddCerPersonnelThird> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add cer personnel thirds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelThirdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel thirds
	 * @param end the upper bound of the range of add cer personnel thirds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add cer personnel thirds
	 */
	@Override
	public List<AddCerPersonnelThird> findAll(
		int start, int end,
		OrderByComparator<AddCerPersonnelThird> orderByComparator,
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

		List<AddCerPersonnelThird> list = null;

		if (useFinderCache) {
			list = (List<AddCerPersonnelThird>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDCERPERSONNELTHIRD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDCERPERSONNELTHIRD;

				sql = sql.concat(AddCerPersonnelThirdModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddCerPersonnelThird>)QueryUtil.list(
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
	 * Removes all the add cer personnel thirds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddCerPersonnelThird addCerPersonnelThird : findAll()) {
			remove(addCerPersonnelThird);
		}
	}

	/**
	 * Returns the number of add cer personnel thirds.
	 *
	 * @return the number of add cer personnel thirds
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
					_SQL_COUNT_ADDCERPERSONNELTHIRD);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "addCerPersonnelThirdId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDCERPERSONNELTHIRD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddCerPersonnelThirdModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add cer personnel third persistence.
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

		AddCerPersonnelThirdUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddCerPersonnelThirdUtil.setPersistence(null);

		entityCache.removeCache(AddCerPersonnelThirdImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDCERPERSONNELTHIRD =
		"SELECT addCerPersonnelThird FROM AddCerPersonnelThird addCerPersonnelThird";

	private static final String _SQL_SELECT_ADDCERPERSONNELTHIRD_WHERE =
		"SELECT addCerPersonnelThird FROM AddCerPersonnelThird addCerPersonnelThird WHERE ";

	private static final String _SQL_COUNT_ADDCERPERSONNELTHIRD =
		"SELECT COUNT(addCerPersonnelThird) FROM AddCerPersonnelThird addCerPersonnelThird";

	private static final String _SQL_COUNT_ADDCERPERSONNELTHIRD_WHERE =
		"SELECT COUNT(addCerPersonnelThird) FROM AddCerPersonnelThird addCerPersonnelThird WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addCerPersonnelThird.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddCerPersonnelThird exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddCerPersonnelThird exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddCerPersonnelThirdPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"number"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}